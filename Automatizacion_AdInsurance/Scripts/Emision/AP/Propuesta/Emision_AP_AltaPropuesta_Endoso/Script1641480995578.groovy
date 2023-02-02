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

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)


/*
 * 
 * Fecha
 * 
 * 
WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)


Estado de cotizacion


WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/Select_cbochk_ProcesoNegocio', 
    'cbochk_ProcesoNegocioId', '1')
    

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados') // sustituimos lo comentado por esto, hasta refrescar
    )

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/checkboxProcesoNegocioPolizaNueva'))

    */



WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

/*
WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Prorroga/a_resultados2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/

/*if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'), numPolizaNulo, FailureHandling.OPTIONAL) && 
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal2'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal3'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal4'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal5'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados6'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal6'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados7'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal7'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados8'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal8'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados9'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal9'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados10'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal10'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados11'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal11'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta11'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados12'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal12'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta12'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados13'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal13'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta13'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados14'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal14'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta14'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados15'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal15'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta15'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados16'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal16'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta16'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados17'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal17'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta17'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados18'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal18'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta18'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados19'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal19'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta19'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados20'), numPolizaNulo, 
    FailureHandling.OPTIONAL) && WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal20'), 
    numPolizaNulo, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta20'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))
} else {
    Utils.logInfo(msgeErrorFaltaPropuestas1)
}*/
// cambiamos todo ese enjambre de condicionales anterior por esto simplemente:
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio', 
    'cboProcesoNegocioId', procesoNegocioId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

hoy = CustomKeywords.'hs.utils.GetDate.GetFechaActualDMA_H0'()

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputFechaPropuesta'), hoy)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputNumeroPoliza'))

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'))

WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nuev_77de0e/input_Fecha de inicio de vigencia_FechaInic_05a41d'), 
    hoy)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

Apellido_Actual = WebUI.getText(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyMatch(Apellido_Actual, '', false, FailureHandling.OPTIONAL)) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 
        'TipoDocumentoId_XmlValue', TipoDocumentoTomadorId)

    WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), '38991713')

    WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementVisible(findTestObject('Emision_AP_AltaPropuesta_Endoso/imgAdvertenciaValorPolizaNulo'))

WebUI.verifyElementVisible(findTestObject('Emision_AP_AltaPropuesta_Endoso/imgExigenciaProductorPrincipal'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonCerrarValidaciones'))

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTE_c08506/li_Propuesta'))

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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'),
	FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

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

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Edicion_AP_AltaPropuesta_Endoso', 1, 7)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(prodPrincMovs, 'Edicion_AP_AltaPropuesta_Endoso', 1, 8)

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

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_AP_AltaPropuesta_Endoso', 1, 11)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numCotizacion)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.navigateToUrl('http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/ConsultaMovimientos?nombre=ConsultaPropuestaLM')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaAceptadaSeleccionada'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

    WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaAnuladaSeleccionada'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

    WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAnulada'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaEmitidaSeleccionada'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

    WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEmitida'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaEnEsperaSeleccionada'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

    WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/li_propuestaIncompletaSeleccionada'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))
}

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/Select_cbochk_ProcesoNegocio', 
    'cbochk_ProcesoNegocioId', '1')*/
/*WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados')) // sustituimos lo comentado por esto, hasta refrescar

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/checkboxProcesoNegocioPolizaNueva'))*/
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboGrupoEndosoEmergente', 
    'cboGrupoEndoso', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoEmergente', 
    'cboTipoEndoso', tipoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoCausa', 
    'cboTipoEndosoCausa', tipoEndosoCausaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonContinuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

MetPagoActual = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'))

//MetPagoActual = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'), 'value')

if (MetPagoActual == 'CUPON') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
        'FormaPagoId_XmlValue', formaPagoIdVisa)

    WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), '4111111111111111')
}

if (MetPagoActual == 'VISA') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
        'FormaPagoId_XmlValue', formaPagoIdCupon)
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 5)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numEndoso = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/h3_numeroEndoso'))

numEndoso = (numEndoso - 'Número de endoso: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numEndoso, 'Emision_AP_AltaPropuesta_Endoso', 1, 14)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numEndoso)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Pliza_Poliza'), numPoliza)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), '1')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumEndosoResultados1'), numEndoso)

