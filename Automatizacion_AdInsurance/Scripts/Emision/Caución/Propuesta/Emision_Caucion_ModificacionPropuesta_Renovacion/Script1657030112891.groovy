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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

//WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// 0:39 > veo que el proceso de negocio es poliza nueva, y que el estado de la propuesta es incompleta
WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// *Borra los datos del tomador y el asegurado (-+21)
WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'))

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_Asegurado_tabPersona_2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'))

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', ProcesoNegocioId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(linkConsultaMovimientos)

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

// 2:06
WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// aca tengo que ver como tomo el numero de poliza que quiero
/*
Queremos que el movimiento tenga un numero de poliza para setearlo en la propuesta que venimos trabajando
 Ademas no queremos que el estado de poliza sea "Anulada" para evitar el error "no es posible emitir una poliza nueva o prórroga con
prima o premio inferior a igual a cero" 
*/
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

WebUI.switchToWindowIndex(currentWindow)

WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/inputNumPoliza'), numPoliza)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTE_c08506/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// 2:28
WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numDocTomadorActual = WebUI.getText(findTestObject('Emision_Caucion_AltaPropuestaProrroga/label_numDoc'))

WebUI.verifyNotEqual(numDocTomadorActual, '')

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

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
}

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// 3:22
// tal vez debería verificar que en proceso de negocio en los resultados diga Renovación
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent(prodPrincMovs, false)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent(numDocTomadorActual, false)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_Asegurado_tabPersona_2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

