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

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_ConsultaMovimiento/a_consulta de movimientos'))

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

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), numEndosoDeseado)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'),
	FechaEmiHasta)

//WebUI.verifyElement(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza1'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza2'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza3'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza4'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza5'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza6'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados6'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza7'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados7'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza8'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados8'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza9'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados9'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza10'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados10'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))
}

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Rehabilitar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_AP_Poliza_Rehabilitacio', 1, 4)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.navigateToUrl(consultaMovimientos)

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

WebUI.setText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/inputNumPoliza'), numPoliza)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Emision_AP_Poliza_Rehabilitacion/chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Columnas'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado, 
    FailureHandling.OPTIONAL)) {
    Utils.logInfo(msgeOK)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados2'), tipoEndosoDeseado, 
    FailureHandling.OPTIONAL)) {
    Utils.logInfo(msgeOK)
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados3'), tipoEndosoDeseado, 
    FailureHandling.OPTIONAL)) {
    Utils.logInfo(msgeOK)
} else {
    Utils.markErrorAndStop(msgeERROR)
}

