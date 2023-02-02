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

if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_1'), '', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Replicar'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_2'), '', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_2'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Replicar'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_NumeroPropuesta_3'), '', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_3'))

    WebUI.click(findTestObject('Page_Consulta de movimientos/span_Replicar'))
} else {
    Utils.markErrorAndStop('ERROR: En las primeras tres filas no se encuentra un número de propuesta vacio')

    toString()
}

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a modificación de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de póliza')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectFormaPago', 'FormaPagoId_XmlValue', 
    FormaPagoId)

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), NumeroTarjeta)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Emisin'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), 20, 
    FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Entro a solapa Personas')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Personas')
}

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), NumeroDocumento)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_RiesgosAP'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_No_k-switch-handle1'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05 - Entro a solapa Riesgos')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Riesgos')
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

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_AP_ReplicaPoliza_Modifi', 1, 6)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_AP_ReplicaPoliza_Modifi', 1, 7)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(120)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('11 - Listo para seleccionar destinatarios y formularios de réplica')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a selección de destinatarios y formularios de la réplica')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectDestinatario', 'cboDestinatarios', 
    '2')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(120)

WebUI.delay(10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

