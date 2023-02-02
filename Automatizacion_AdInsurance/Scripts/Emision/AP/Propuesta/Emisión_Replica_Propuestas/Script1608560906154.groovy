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
            3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de propuestas'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(10)

if (SubRamoId > 0) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
        SubRamoId)
}

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Todos_k-select'))

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Propuesta aceptada 4_EstadoCotizacionId'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Replicar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de propuestas/_CboSubramo', 'cboSubramo', 
    NewSubRamoId)

WebUI.click(findTestObject('Page_Consulta de propuestas/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 10)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'))

WebUI.scrollToPosition(0, 0)

if (!(WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 
    'Póliza Nueva [1]', FailureHandling.OPTIONAL))) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
        'cboProcesoNegocioId', ProcesoNegocioPolizaNvaId)

    WebUI.waitForPageLoad(30)

    WebUI.waitForJQueryLoad(30)
}

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSucursal'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', ProcesoNegocioEndosoId)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

'En caso de seleccionar el proceso negocio Endoso procede de esta forma'
if (!(WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 
    'Endoso [4]', FailureHandling.OPTIONAL))) {
    Utils.logInfo('ERROR: No realizo el cambio de Proceso de Negocio')
}

WebUI.setText(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Pliza_txtPolizaOrigen'), PolizaOrigen)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Nmero de propuesta_NumeroPropuesta.StringValue'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.verifyElementNotPresent(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSucursal'), 0)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 10)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.verifyElementClickable(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectTipoDocumento'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a alta de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markWarning('ERROR: No llego a solapa Personas')
}

if (WebUI.verifyElementVisible(findTestObject('Page_Alta de Pliza Nueva/_SelectTipoDocumento'), FailureHandling.OPTIONAL)) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 
        'TipoDocumentoId_XmlValue', TipoDocumentoId)

    WebUI.waitForPageLoad(10)

    WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

    WebUI.waitForJQueryLoad(10)

    WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), CUIL_CUIT)

    WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'))

    WebUI.waitForPageLoad(10)

    WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

    WebUI.waitForJQueryLoad(10)

    if (TipoPersonaId > '0') {
        CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 
            'TipoPersonaId_XmlValue', TipoPersonaId)

        WebUI.waitForPageLoad(10)

        WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

        WebUI.waitForJQueryLoad(10)
    }
}

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/li_Adjuntos'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

'Por el momento no puedo subir archivos. Esto queda pendiente'
if (false) {
    WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/button_Agregaradjuntos'))

    WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/span_Seleccione'))

    WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/li_Imagen 2'))

    WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/button_Confirmar'), 
        FailureHandling.OPTIONAL)

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/span_'), 
        0)) {
        WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Endoso - Accident_4fa216/span_'))
    }
}

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Modificar'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Se generó correctamente la propuesta')

    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    NumeroPropuesta = WebUI.getText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_LabelNroPropuesta'))

    NumeroPropuesta = (NumeroPropuesta - 'Número de propuesta: ')

    Utils.logInfo(NumeroPropuesta)
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No se generó la propuesta')
}

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.waitForElementClickable(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'), 10)

WebUI.focus(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'))

WebUI.sendKeys(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'), NumeroPropuesta)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    '0')

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Todos_k-select'))

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Propuesta emitida 18_EstadoCotizacionId'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(30)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Replicar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de propuestas/_CboSubramo', 'cboSubramo', 
    NewSubRamoId)

WebUI.click(findTestObject('Page_Consulta de propuestas/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', ProcesoNegocioPolizaNvaId)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo', 
    'cboSubRamoId', NewSubRamoId)

WebUI.focus(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/span_Productor principal_k-icon k-clear-value k-i-close'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Emitida'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Cerrar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), 
    ProductorPrincipal)

WebUI.click(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_FilterProductorPrincipal'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo', 
    'cboSubRamoId', NewSubRamoId)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 30)

WebUI.waitForJQueryLoad(30)

WebUI.focus(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/_li_Operaciones Referidas por otras Cias R'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion24'))

WebUI.waitForJQueryLoad(30)

WebUI.focus(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor14'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor14'))

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/_li_barrio zona riesgo bajo'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion14'))

WebUI.waitForJQueryLoad(30)

WebUI.focus(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

WebUI.waitForJQueryLoad(30)

WebUI.clearText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/_input_Numero de Poliza SISE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/_input_Numero de Poliza SISE'), 
    PolizaSISE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion19'))

WebUI.waitForJQueryLoad(30)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Emitida'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

NumeroPropuesta = WebUI.getText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_LabelNroPropuesta'))

NumeroPropuesta = (NumeroPropuesta - 'Número de propuesta: ')

Utils.logInfo(NumeroPropuesta)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de propuesta de Pliza Nueva - ACCIDENTES PERSONALES - 107040/button_Continuar'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Se emitió correctamente la propuesta')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No se generó la propuesta')
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de propuestas'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.waitForElementClickable(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'), 10)

WebUI.focus(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'))

WebUI.sendKeys(findTestObject('Page_Consulta de propuestas/input_Nmero propuesta_NumeroPropuesta'), NumeroPropuesta)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Replicar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de propuestas/_CboSubramo', 'cboSubramo', 
    NewSubRamoId)

WebUI.click(findTestObject('Page_Consulta de propuestas/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/span_Productor principal_k-select'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(ProductorPrincipal, false)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 30)

WebUI.verifyTextPresent(TipoOperacionVerif, false)

WebUI.verifyTextPresent(AmbitoCoberturaVerif, false)

WebUI.verifyTextPresent(PolizaSISE, false)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Emitida'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

