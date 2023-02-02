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

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Consulta de movimientos/_FilterRamoId'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a consulta de movimientos')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta de movimientos')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Refrescar'))

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/a_Moneda_1'), GlobalVariable.WaitForLoad)

if (  (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_1'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados1')) != 
'Anulada') ) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_2'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados2')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_2'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_3'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados3')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_3'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_4'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados4')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_4'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_5'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados5')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_5'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_6'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados6')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_6'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else if ((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_7'), '', FailureHandling.OPTIONAL)) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados7')) != 
'Anulada')) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_7'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))
} else {
    Utils.markErrorAndStop('ERROR: En las primeras tres filas no se encuentra un número de propuesta vacio')
}

WebUI.waitForPageLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/li_Emisin'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a modificación de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de póliza')
}

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Presupuestada'), 'Estado: Presupuestada')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonEmitir'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('10 - Emitió Póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No emitió Póliza')
}

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

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

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_AP_Poliza_AnulacionTota', 1, 8)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_AP_Poliza_AnulacionTota', 1, 9)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Pliza_Poliza'), nPoliza)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_Poliza'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_Poliza'), nPoliza)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_TipoEndosoDescripcion'), TextoTipoEndoso)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_EstadoResumenDescripcion'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_EstadoResumenDescripcion'), TextoEstadoResumen)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

