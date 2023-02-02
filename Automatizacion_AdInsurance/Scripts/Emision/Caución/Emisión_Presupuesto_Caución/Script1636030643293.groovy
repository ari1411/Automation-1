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

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Consulta de movimientos/_FilterRamoId'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a consulta de movimientos')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta de movimientos')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/span_Nuevo'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectTipoDocumento'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a alta de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de póliza')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoId)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), CUIL_CUIT)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/div_Nmero de documentokendo.syncReady(funct_946f82'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (TipoPersonaId > 0) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 'TipoPersonaId_XmlValue', 
        TipoPersonaId)
}

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.ClickByTitle.clickElement'('/Page_Alta de Pliza Nueva/_SolapaAsegurado', 'Asegurado')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectRolPersonaOrigen'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Entro a solapa Asegurado')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Asegurado')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectRolPersonaOrigen', 'RolPersonaOrigenId', 
    '3')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCopiar', 'lnkCopiarPersona')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.delay(1)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuEmision', 'Emision')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05 - Entro a solapa Emisión')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Emisión')
}

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), Productor)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectProducto', 'ProductoId_XmlValue', 
    ProductoId)

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectVigenciaContrato', 'VigenciaId_XmlValue', 
    VigenciaContratoId)

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectFormaPago', 'FormaPagoId_XmlValue', 
    FormaPagoId)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_CeldaSumaAseguradaObraPublica'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('06 - Entro a solapa Riesgos Caución')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Riesgos Caución')
}

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_No_k-switch-handle2'))

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Incompleta'), 'Estado: Incompleta')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCalcular', 'lnkCalcular')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Presupuestada'), 'Estado: Presupuestada')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonGuardar', 'lnkGuardar')

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07 - Guardo presupuesto póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No emitió póliza')
}

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(120)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60, FailureHandling.OPTIONAL)) {
    Utils.markPassed('08 - Listo para seleccionar destinatarios y formularios')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a seleccion de destinatarios y formularios')
}

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(120)

WebUI.delay(10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

