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

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/span_Nuevo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), CUIL_CUIT)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (TipoPersonaId > '0') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 'TipoPersonaId', 
        TipoPersonaId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

CustomKeywords.'hs.controles.kendo.ClickByTitle.clickElement'('/Page_Alta de Pliza Nueva/_SolapaAsegurado', 'Asegurado')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoIdAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), CUIL_CUIT_Asegurado)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (TipoPersonaIdAsegurado > '0') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 'TipoPersonaId', 
        TipoPersonaId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuEmision', 'Emision')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), Productor)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectProducto', 'ProductoId_XmlValue', 
    ProductoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectVigenciaContrato', 'VigenciaId_XmlValue', 
    VigenciaContratoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectFormaPago', 'FormaPagoId_XmlValue', 
    FormaPagoIdCUPON)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/IgnoraPrimaMinima'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(1)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/span_No_k-switch-handle'))

WebUI.delay(1)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCalcular', 'lnkCalcular')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonEmitir', 'lnkEmitir')

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

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

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_Caucion_AltaPersonaExis', 1, 18)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_Caucion_AltaPersonaExis', 1, 19)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(120)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), nPoliza)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(CUIL_CUIT, false)

WebUI.verifyTextPresent(Verif_Apellido, false)

WebUI.verifyTextPresent(Verif_Nombre, false)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuEmision', 'Emision')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(Productor, false)

WebUI.verifyTextPresent(Verif_Vigencia, false)

WebUI.verifyTextPresent(Verif_FormaPago, false)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(Verif_SumaAsegurada, false)

// WebUI.verifyTextPresent(Verif_TasaFinal, false)
WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.delay(2)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

