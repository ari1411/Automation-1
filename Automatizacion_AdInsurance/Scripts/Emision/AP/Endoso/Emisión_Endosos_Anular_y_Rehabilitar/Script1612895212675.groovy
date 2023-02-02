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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as Utils

WebUI.enableSmartWait()

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : false, ('Url') : findTestData(
            '_Login').getValue(1, 1), ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(
            3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (GrupoRamoId > 0) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterGrupoRamoId', 
        'GrupoRamoId', GrupoRamoId)

    WebUI.waitForJQueryLoad(60)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(60)

if (SubRamoId > 0) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
        SubRamoId)

    WebUI.waitForJQueryLoad(60)
}

if (((nPoliza) as int) > 0) {
    WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), nPoliza)
}

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/span_EstadoProrrogaDescripcion'), 5)

if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_1'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_2'), 'Vigente', 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_2'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_3'), 'Vigente', 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_3'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_4'), 'Vigente', 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_4'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_5'), 'Vigente', 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_5'))
} else {
    Utils.markErrorAndStop('ERROR: No se encontró una póliza vigente entre las primeras 5 filas. En caso de necesitar verificar en más filas, avisar al desarrollador')
}

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoIdAnular)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoIdAnular)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaIdAnular)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

String numeroPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numeroPoliza = (numeroPoliza - 'Número de póliza: ')

Utils.logInfo(numeroPoliza)

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), numeroPoliza)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/span_EstadoImpresionDescripcion_1'), 5)

if (((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_1'), 'Anulada', 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_1'), 
    'Anulada', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_2'), 
    'Anulada', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_2'), 
    'Anulada', FailureHandling.OPTIONAL)) {
    Utils.markPassed('Póliza anulada correctamente')
} else {
    Utils.markErrorAndStop('ERROR: El estado de póliza y resumen no están anuladas')
}

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Rehabilitar'))

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoIdRehabilitar)

WebUI.delay(1)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoIdRehabilitar)

WebUI.delay(1)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaIdRehabilitar)

WebUI.delay(1)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/span_EstadoProrrogaDescripcion'), 5)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

if (((((WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_1'), 'Vigente', 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_1'), 
    'Anulada', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_2'), 
    'Vigente', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_2'), 
    'Anulada', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_3'), 
    'Vigente', FailureHandling.OPTIONAL)) && WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_3'), 
    'Vigente', FailureHandling.OPTIONAL)) {
    Utils.markPassed('Póliza Rehabilitada correctamente')

    WebUI.closeBrowser()
} else {
    Utils.markErrorAndStop('ERROR: la póliza no se rehabilitó correctamente')
}

