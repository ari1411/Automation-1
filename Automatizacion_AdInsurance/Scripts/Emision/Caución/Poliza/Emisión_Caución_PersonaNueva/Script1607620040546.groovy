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

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (TipoPersonaId > '0') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 'TipoPersonaId_XmlValue', 
        TipoPersonaId)

    WebUI.waitForPageLoad(10)

    WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

    WebUI.waitForJQueryLoad(10)
}

WebUI.scrollToElement(findTestObject('Page_Alta de Pliza Nueva/label_Tipo'), 10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDomicilio', 'TipoDomicilioId_XmlValue', 
    TipoDomicilioId)

WebUI.delay(0.5)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectPais', 'PaisId_XmlValue', 
    PaisId)

WebUI.delay(0.5)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectProvincia', 'ProvinciaId_XmlValue', 
    ProvinciaId)

WebUI.waitForElementClickable(findTestObject('Page_Alta de Pliza Nueva/input_Localidad_LocalidadId_input'), 10)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Localidad_LocalidadId_input'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.waitForElementClickable(findTestObject('Page_Alta de Pliza Nueva/input_Localidad_LocalidadId_input'), 10)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Localidad_LocalidadId_input'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Localidad_LocalidadId_input'), Localidad)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterLocalidad'), 10)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterLocalidad'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_C. P._CodigoPostal_input'), CodigoPostal)

WebUI.waitForJQueryLoad(10)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero sucursal_NumeroSucursal'), Sucursal)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Calle_Calle'), Calle)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero_NumeroCalle'), Numero)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Piso_Piso'), Piso)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Dpto._Departamento'), Departamento)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_SeleccioneDomicilio_Tomador'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_SeleccioneDomicilio_Tomador'))

WebUI.click(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Caucin/li_SeleccioneDomicilio_2'))

WebUI.waitForJQueryLoad(10)

WebUI.scrollToPosition(0, 0)

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

WebUI.waitForJQueryLoad(10)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_SeleccioneDomicilio_Asegurado'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_SeleccioneDomicilio_Asegurado'))

WebUI.click(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Caucin/li_SeleccioneDomicilio_3_2'))

WebUI.waitForJQueryLoad(10)

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
    FormaPagoIdVISA)

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

WebUI.scrollToElement(findTestObject('Page_Alta de Pliza Nueva/div_Nmero Tarjetakendo.syncReady(function()_96715f'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/label_Nmero Tarjeta'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Alta de Pliza Nueva/label_Nmero Tarjeta'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectFormaPago', 'FormaPagoId_XmlValue', 
    FormaPagoIdCUPON)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_No_k-switch-handle1'))

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

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_CeldaSumaAseguradaObraPublica'))

WebUI.sendKeys(findTestObject('Page_Alta de Pliza Nueva/_GrillaRiesgoSumaAsegurada'), SumaAseguradaPublica)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Caucin/span_No_k-switch-handle2'))

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCalcular', 'lnkCalcular')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonEmitir', 'lnkEmitir')

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07 - Emitio póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No emitió póliza')
}

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(120)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60)

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

