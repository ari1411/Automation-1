import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as Utils

WebUI.enableSmartWait()

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(1, 1), ('Usuario') : findTestData(
            '_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Cotizacin_k-numeric-wrap k-state-defau_ed4460'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), CotizacionId)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/_grdConsultaMovimiento'), 5)

nEndoso = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso1'))

if (nEndoso == '000000') {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_GridConsultaMov_Menu1'))
} else {
    PolizaAnterior = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza1'))

    PolizaActual = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza2'))

    nEndoso = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso2'))

    if ((PolizaAnterior != PolizaActual) && (nEndoso == '000000')) {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_GridConsultaMov_Menu2'))
    } else {
        PolizaAnterior = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza2'))

        PolizaActual = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza3'))

        nEndoso = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso3'))

        if ((PolizaAnterior != PolizaActual) && (nEndoso == '000000')) {
            WebUI.click(findTestObject('Page_Consulta de movimientos/a_GridConsultaMov_Menu3'))
        } else {
            PolizaAnterior = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza3'))

            PolizaActual = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza4'))

            nEndoso = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso4'))

            if ((PolizaAnterior != PolizaActual) && (nEndoso == '000000')) {
                WebUI.click(findTestObject('Page_Consulta de movimientos/a_GridConsultaMov_Menu4'))
            } else {
                PolizaAnterior = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza4'))

                PolizaActual = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza5'))

                nEndoso = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso5'))

                if ((PolizaAnterior != PolizaActual) && (nEndoso == '000000')) {
                    WebUI.click(findTestObject('Page_Consulta de movimientos/a_GridConsultaMov_Menu5'))
                } else {
                    Utils.markErrorAndStop('Error: No se encuentra una Poliza sin endosos entre los primeros 5 registros de la grilla')
                }
            }
        }
    }
}

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Renovar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('No es posible renovar la póliza ya que aún posee prórrogas pendientes de realizar. - 500 - Internal Server Error', 
    false)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

