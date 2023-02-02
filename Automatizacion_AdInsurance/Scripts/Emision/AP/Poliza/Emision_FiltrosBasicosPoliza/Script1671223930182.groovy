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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariabappele as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as Utils

WebUI.enableSmartWait()

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(1, 1), ('Usuario') : findTestData(
            '_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

// WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))
WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanNumCotizacion1'), nCotizacionPre)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), FailureHandling.STOP_ON_FAILURE)

numCotInvalid = (nCotizacionPre + '2')

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotInvalid)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('No se encontraron registros para los filtros especificados.', false)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Emision_FiltrosBasicosPoliza/input_GrupoRamoId', 'GrupoRamoId', 
    GrupoRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/opcionCheckboxGrupoRamo'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/opcionCheckboxSubRamo'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_grupoRamoResultados1'), 'Accidentes personales')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Emision_FiltrosBasicosPoliza/input_GrupoRamoId', 'GrupoRamoId', 
    '0')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/opcionCheckboxSubRamo'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_subRamoResultados1'), 'DM (Negocios Masivos)')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', '0')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacionBeta'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxEmitida'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoCotizacionDescripcion_1'), 'Emitida')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoCotizacionDescripcion_1'), 'Emitida')

if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza1'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza2'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza3'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza4'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza5'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza6'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados6'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza7'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados7'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza8'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados8'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza9'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados9'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza10'), estadoPolizaDeseado, 
    FailureHandling.OPTIONAL)) {
    numPoliza = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados10'))
}

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacionBeta'))

WebUI.click(findTestObject('Object Repository/Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxEmitida'))

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'), numPoliza)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', '0')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('El filtro por número de póliza debe ir acompañado del filtro por ramo', false)

WebUI.clearText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_FiltrosBasicosPoliza/input_moneda', 
    'MonedaId', '2')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_RevisionSelladoUSD/span_monedaResults1'), 'Dolar USA (Billete)')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_RevisionSelladoUSD/span_monedaResults1'), 'Dolar USA (Billete)')

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_FiltrosBasicosPoliza/input_moneda', 
    'MonedaId', '0')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', '0')

WebUI.setText(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), 'katalon, p')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), Keys.chord(Keys.ENTER))

// 3:36
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), 'KATALON, PRODUCTORE')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), 'KATALON, PRODUCTORE')

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', '0')

WebUI.clearText(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), FailureHandling.STOP_ON_FAILURE)

// WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/span_eliminarProdPrinc'))
WebUI.setText(findTestObject('Emision_FiltrosBasicosPoliza/input_numDocPersona'), numDocTom)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/opcionCheckboxTomadorDocumento'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_tomadorDocResults1'), 'DNI ' + numDocTom)

WebUI.clearText(findTestObject('Emision_FiltrosBasicosPoliza/input_numDocPersona'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Nombre_PersonaNombre'), 'tomadore')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados1'), 'KATALON, TOMADORE')

WebUI.clearText(findTestObject('Page_Consulta de movimientos/input_Nombre_PersonaNombre'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Emision_FiltrosBasicosPoliza/input_apellidoRazonSocial'), 'katalon')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados1'), 'KATALON, TOMADORE')

WebUI.clearText(findTestObject('Emision_FiltrosBasicosPoliza/input_apellidoRazonSocial'), FailureHandling.STOP_ON_FAILURE)

FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(0, true)

FechaEmiHasta = (FechaEmiHasta + ' 00:00')

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

fechaEmi = WebUI.getText(findTestObject('Emision_FiltrosBasicosPoliza/span_fechaEmisionResults1'))

def fechaEmiDate = Date.parse('dd/MM/yyyy hh:mm', fechaEmi)

def fechaEmiHastaDate = Date.parse('dd/MM/yyyy hh:mm', FechaEmiHasta)

// WebUI.verifyLessThanOrEqual(fechaEmi, FechaEmiHasta)
if (fechaEmiHastaDate >= fechaEmiDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

// verificacion
WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

String FechaInicioVigenciaFROM = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(0, true)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Inicio vigencia desde_FechaInicioVigenciaFROM'), FechaInicioVigenciaFROM)

String FechaInicioVigenciaTO = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(120, true)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Inicio vigencia hasta_FechaInicioVigenciaTO'), FechaInicioVigenciaTO)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

inicioVigResults = WebUI.getText(findTestObject('Emision_FiltrosBasicosPoliza/span_inicioVigenciaResults1'))

def fechaIniVigFromDate = Date.parse('dd/MM/yyyy', FechaInicioVigenciaFROM)

def fechaIniVigToDate = Date.parse('dd/MM/yyyy', FechaInicioVigenciaTO)

def inicioVigResultsDate = Date.parse('dd/MM/yyyy', inicioVigResults)

if (inicioVigResultsDate >= fechaIniVigFromDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaIniVigToDate >= inicioVigResultsDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

