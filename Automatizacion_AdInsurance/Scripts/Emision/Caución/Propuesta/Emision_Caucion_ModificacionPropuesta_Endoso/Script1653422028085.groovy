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

String FechaHoy = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('1', true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaHoy)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

/*prodPrincipal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanProdPincipalResultados1'))

tomador = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTomadorResultados1'))*/
// esto corresponde a otra prueba. Lo comenté por si eventualmente llegara a servirme
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio', 
    'cboProcesoNegocioId', procesoNegocioId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
    'cboGrupoEndosoId', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
    'cboTipoEndosoId', tipoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
WebUI.executeJavaScript('window.open();', [])

/*currentWindow = WebUI.getWindowIndex()
//Switches tab #1
WebUI.switchToWindowIndex(currentWindow + 1)*/
WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/ConsultaMovimientos?nombre=ConsultaMovimientos')

//Switches tab #0
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados1')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados2')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados3')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados4')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados5')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados6')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados6'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados7')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados7'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados8')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados8'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados9')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados9'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))
} else if (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados10')) != 
numPolizaNulo) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados10'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))
}

WebUI.switchToWindowIndex(0)

WebUI.sendKeys(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/inputNumPoliza'), numPolizaOriginal)

WebUI.sendKeys(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/inputNumPoliza'), Keys.chord(Keys.TAB))

//WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))
WebUI.delay(2)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

//WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/aside_clickFueraDelCampoNuevoAsegurado'))
//WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)
//WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTE_c08506/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

String numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_ModifProp_Endoso', 1, 9)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Cauc_ModifProp_Endoso', 1, 10)

// vamos a ver si a pesar de ser el numPoliza el obj, igual funciona porque el obj tiene referenciado el elemWeb mediante el xpath crudo (ordinalNumerico, sin considerar atributos de los nodos)
CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

