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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Consulta de propuestas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanNumCotizacion1'), nCotizacionPre)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), FailureHandling.STOP_ON_FAILURE)

numCotInvalid = (nCotizacionPre + '2')

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotInvalid)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('No se encontraron registros para los filtros especificados.', false)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/opcionCheckboxSubRamo'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_subRamoResultados1'), 'DM (Negocios Masivos)')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', '0')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosBasicosPoliza/span_ramoResultados1'), 'ACCIDENTES PERSONALES')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', '0')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoCotizacionDescripcion_1'), 'Propuesta aceptada')

WebUI.setText(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), 'katalon, p')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), 'KATALON, PRODUCTORE')

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal2'), 'KATALON, PRODUCTORE')

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal3'), 'KATALON, PRODUCTORE')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_estCotizTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_equipoDistribucion'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxEqEmisorAP_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_eqDistribResults1'), 'Equipo Emisor AP')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_eqDistribResults2'), 'Equipo Emisor AP')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_eqDistribResults3'), 'Equipo Emisor AP')

numProp = WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados2'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_equipoDistribucion'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_eqDistribTodos'))

WebUI.click(findTestObject('Emision_FiltrosBasicosPoliza/input_productorPrincipal1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_eliminarProdPrinc'))

WebUI.setText(findTestObject('Emision_Transporte_EmitirPoliza_OrigenPropuesta/input_numPropuesta'), numProp)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados1'), 
    numProp)

WebUI.setText(findTestObject('Emision_Transporte_EmitirPoliza_OrigenPropuesta/input_numPropuesta'), '')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_FiltrosBasicosPoliza/input_moneda', 
    'MonedaId', '1')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_RevisionSelladoUSD/span_monedaResults1'), 'PESOS')

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_FiltrosBasicosPoliza/input_moneda', 
    'MonedaId', '0')

fechaPropDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('10', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropDesde'), fechaPropDesde)

fechaPropHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('90', true)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropHasta'), fechaPropHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

def fechaPropDesdeDate = Date.parse('dd/MM/yyyy', fechaPropDesde)

def fechaPropHastaDate = Date.parse('dd/MM/yyyy', fechaPropHasta)

fechaProp1 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp1'))

fechaProp2 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp2'))

fechaProp3 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp3'))

def fechaPropDate1 = Date.parse('dd/MM/yyyy', fechaProp1)

def fechaPropDate2 = Date.parse('dd/MM/yyyy', fechaProp2)

def fechaPropDate3 = Date.parse('dd/MM/yyyy', fechaProp3)

System.out.println(fechaPropDesdeDate)

System.out.println(fechaPropHastaDate)

System.out.println(fechaPropDate1)

if (fechaPropDate1 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (fechaPropDate2 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (fechaPropDate3 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}