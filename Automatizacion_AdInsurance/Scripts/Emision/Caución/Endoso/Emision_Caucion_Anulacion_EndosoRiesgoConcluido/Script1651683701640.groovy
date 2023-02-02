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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Consulta de movimientos'))

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

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPolizaPrecondicion)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), '1')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/input_checkboxProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado1)

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'))

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), '0')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado0)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

/*

if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults1'), '000001', FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado1)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults2'), '000001', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio2'), procesoNegocioDeseado1)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults3'), '000001', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio3'), procesoNegocioDeseado1)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults4'), '000001', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio4'), procesoNegocioDeseado1)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults5'), '000001', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio5'), procesoNegocioDeseado1)
}

if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults1'), '000000', FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults2'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio2'), procesoNegocioDeseado0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults3'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio3'), procesoNegocioDeseado0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults4'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio4'), procesoNegocioDeseado0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults5'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio5'), procesoNegocioDeseado0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
}
*/
WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

'20 en HS\r\n164 en Meridional??'
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

String numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Cauc_Anul_EndosRiesConc', 1, 9)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_Anul_EndosRiesConc', 1, 10)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado2)

/*
if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults1'), '000002', FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio1'), procesoNegocioDeseado2)

    WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado2)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults2'), '000002', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio2'), procesoNegocioDeseado2)

    WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados2'), tipoEndosoDeseado2)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults3'), '000002', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio3'), procesoNegocioDeseado2)

    WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados3'), tipoEndosoDeseado2)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults4'), '000002', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio4'), procesoNegocioDeseado2)

    WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados4'), tipoEndosoDeseado2)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults5'), '000002', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanProcesoNegocio5'), procesoNegocioDeseado2)

    WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados5'), tipoEndosoDeseado2)
}
*/
WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'))

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), '0')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_1'), estadoResumen0)

WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga1'), estadoProrroga0)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

/*
if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults1'), '000000', FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_1'), estadoResumen0)

    WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga1'), estadoProrroga0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults2'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_2'), estadoResumen0)

    WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga2'), estadoProrroga0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults3'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_3'), estadoResumen0)

    WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga3'), estadoProrroga0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults4'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_4'), estadoResumen0)

    WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga4'), estadoProrroga0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults5'), '000000', 
    FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_5'), estadoResumen0)

    WebUI.verifyElementText(findTestObject('Emision_Caucion_Anulacion_EndosoRiesgoConcluido/span_estadoProrroga5'), estadoProrroga0)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
}
*/
WebUI.click(findTestObject('Object Repository/Emision_AP_ValidacionRefacturacion/li_prorrogar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboGrupoEndosoEmergente', 
    'cboGrupoEndoso', GrupoEndosoIdBeta)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoEmergente', 
    'cboTipoEndoso', TipoEndosoIdBeta)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoCausa', 
    'cboTipoEndosoCausa', TipoEndosoCausaIdBeta)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonContinuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacionFinal = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacionFinal = (numCotizacionFinal - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_Anul_EndosRiesConc', 1, 18)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacionFinal)

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado3)

