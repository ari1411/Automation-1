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

/*
WebUI.callTestCase(findTestCase('Emision/AP/Poliza/Creacion_NuevoMovimiento_Full'), [('RamoId') : findTestData('Nuevas Operaciones').getValue(1, 1)
        , ('SubRamoId') : findTestData('Nuevas Operaciones').getValue(2, 1), ('numEndosoDeseado') : findTestData('Nuevas Operaciones').getValue(5, 1)
        , ('numPolizaNulo') : findTestData('Nuevas Operaciones').getValue(6, 1), ('estadoPolizaIndeseado') : findTestData('Nuevas Operaciones').getValue(7, 1)
        , ('consultaMovimientos') : findTestData('Nuevas Operaciones').getValue(4, 1), ('msgeErrorFaltaPropuestas2') : findTestData('Nuevas Operaciones').getValue(8, 1)
        , ('vigenciaContrato') : findTestData('Nuevas Operaciones').getValue(11, 1)], FailureHandling.STOP_ON_FAILURE)
*/
WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Consulta de propuestas'))

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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

/*
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/checkboxProcesoNegocioPolizaNueva'))
*/
WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

prodPrincipal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanProdPincipalResultados1'))

tomador = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTomadorResultados1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

String FechaPropuesta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(0, true)

WebUI.setText(findTestObject('Object Repository/Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputFechaPropuesta'), 
    FechaPropuesta)

String FechaInicioVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(0, true)

WebUI.setText(findTestObject('Object Repository/Emision_Caucion_AnulacionEndosoRiesgoConcluido_SinPolizaEntregada/input_fechaInicioVigenciaEmision'), 
    FechaInicioVigencia)

String FechaFinVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(8, true)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
    FechaFinVigencia)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementPresent(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputApellidoRazonSocial'), 1, FailureHandling.OPTIONAL)) {
    apellidoRazonSocialTomador = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputApellidoRazonSocial'), 
        'value')
} else if (WebUI.verifyElementPresent(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/labelApellidoRazonSocialTomador'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    apellidoRazonSocialTomador = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/labelApellidoRazonSocialTomador'))
}

/*apellidoRazonSocialTomador = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputApellidoRazonSocial'),
	'value')*/
WebUI.verifyEqual(tomador.contains(apellidoRazonSocialTomador), true)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTE_c08506/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio', 
    'cboProcesoNegocioId', procesoNegocioId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'))

/*WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), 0)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanLimpiarProductorPrincipal'))*/
WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputNumeroPoliza'))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementVisible(findTestObject('Emision_AP_AltaPropuesta_Endoso/imgAdvertenciaValorPolizaNulo'))

WebUI.verifyElementVisible(findTestObject('Emision_AP_AltaPropuesta_Endoso/imgExigenciaProductorPrincipal'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonCerrarValidaciones'))

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(nuevaURL1)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), Usuario)

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), Clave)

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/label_Producto'), 5)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de movimientos/_SelectProducto', 
    'ProductoId', ProductoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), '0')

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nPoliPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/* Queremos que el movimiento tenga un numero de poliza para setearlo en la propuesta que venimos trabajando
	Ademas no queremos que el estado de poliza sea "Anulada" para evitar el error "no es posible emitir una poliza nueva o prórroga con
prima o premio inferior a igual a cero" */
if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados1')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados1')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados1'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults1'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados2')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados2')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados2'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults2'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados3')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados3')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados3'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults3'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados4')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados4')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados4'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults4'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados5')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados5')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados5'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults5'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados6')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados6')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados6'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults6'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados7')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados7')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados7'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults7'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados8')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados8')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados8'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults8'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados9')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados9')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados9'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults9'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados10')) != 
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados10')) != 
estadoPolizaIndeseado)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados10'))

    prodPrincMovs = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanProdPrincipalResults10'))
} else {
    Utils.logInfo(msgeErrorFaltaPropuestas2)
}

Utils.logInfo(numPoliza)

Utils.logInfo(prodPrincMovs)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_AP_AltaProp_Prorroga', 1, 7)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(prodPrincMovs, 'Emision_AP_AltaProp_Prorroga', 1, 8)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/inputNumPoliza'), numPoliza)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTE_c08506/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/labelProdPrincipal'), prodPrincMovs)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
    'cboGrupoEndosoId', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
    'cboTipoEndosoId', tipoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numCotizacion0 = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTituloDescripcionPropuesta'))

numCotizacion0 = (numCotizacion0 - 'Modificación de propuesta de Anulación - ACCIDENTES PERSONALES - ')

Utils.logInfo(numCotizacion0)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_AltaPropuesta_Anulacion/spanMsgeValidAmbitoCobertura'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Edicion_AP_AltaPropuesta_Anulacion/botonCerrarVentanaEmergenteValid'))

    WebUI.navigateToUrl(nuevaURL2)

    WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion0)

    WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
        5)

    WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor14'))

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AmbitoCobertura', 
        'AmbitoCobertura', ValorPropuesta_AmbitoCobertura)

    WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion14'), FailureHandling.STOP_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio'))

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio', 
        'cboProcesoNegocioId', procesoNegocioId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/inputNumPoliza'), numPoliza)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
        'cboGrupoEndosoId', grupoEndosoId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
        'cboTipoEndosoId', tipoEndosoId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_AP_AltaProp_Prorroga', 1, 13)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numCotizacion)

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*WebUI.executeJavaScript('window.open();', [])

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowIndex(1)*/
WebUI.navigateToUrl(nuevaURL2)

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

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

/*WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaAceptadaSeleccionada'),
	1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaAnuladaSeleccionada'),
	1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAnulada'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaEmitidaSeleccionada'),
	1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEmitida'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaEnEsperaSeleccionada'),
	1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaIncompletaSeleccionada'),
	1, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))
}*/
/*WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/checkboxProcesoNegocioPolizaNueva'))*/
WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementVisible(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanMsgeErrorFechas'), FailureHandling.OPTIONAL)) {
    WebUI.navigateToUrl(nuevaURL2)

    WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

    WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nuev_77de0e/input_Fecha de inicio de vigencia_FechaInic_05a41d'), 
        '01/02/2022')

    WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nuev_77de0e/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
        '01/08/2022')

    WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.navigateToUrl(nuevaURL2)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

    WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

    WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboGrupoEndosoEmergente', 
    'cboGrupoEndoso', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoEmergente', 
    'cboTipoEndoso', tipoEndosoId2)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoCausa', 
    'cboTipoEndosoCausa', tipoEndosoCausaId)

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

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numEndoso = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/h3_numeroEndoso'))

numEndoso = (numEndoso - 'Número de endoso: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numEndoso, 'Emision_AP_AltaProp_Prorroga', 1, 16)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numEndoso)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.clearText(findTestObject('Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Pliza_Poliza'), numPoliza)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumEndosoResultados1'), numEndoso)

