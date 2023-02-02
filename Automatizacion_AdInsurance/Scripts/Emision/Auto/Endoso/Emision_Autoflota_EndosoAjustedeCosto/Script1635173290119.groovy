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

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : false, ('Url') : findTestData(
            '_Login').getValue(1, 1), ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(
            3, 1), ('VerificarNombreModulo') : true, ('NombreModulo') : 'Emisión'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Pliza_Poliza'), nPolizaAlta)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_Poliza'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_Poliza'), nPolizaAlta)

if (!(WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroEndoso'), NumeroEndoso, FailureHandling.OPTIONAL))) {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: El número de Póliza ingresado ya posee endosos. Deben modificarlo desde el excel')
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k_0cde73'))

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Endosar'))

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndoso)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    Endoso)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    Causa)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Autos/input_PorcentajeDescuento.DecimalValue_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Autos/input_PorcentajeDescuento.DecimalValue_2'), PorcentajeDescuento)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonEmitir'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

nCotizacion = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de cotizacin 106516'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nCotizacion)

nPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de propuesta 934'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nPoliza)

nCotizacion = (nCotizacion - 'Número de cotización: ')

Utils.logInfo(nCotizacion)

nPoliza = (nPoliza - 'Número de póliza: ')

Utils.logInfo(nPoliza)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_Autoflota_EndosoAjusted', 1, 9)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_Autoflota_EndosoAjusted', 1, 10)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_c6f968/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Pliza_Poliza'), nPolizaAlta)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_Poliza'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_Poliza'), nPolizaAlta)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_TipoEndosoDescripcion'), TextoTipoEndoso)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

