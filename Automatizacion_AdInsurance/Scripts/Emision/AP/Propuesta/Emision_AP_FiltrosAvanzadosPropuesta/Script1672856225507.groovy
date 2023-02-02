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

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/span_unidOperativaPropuestas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxLaMeridional_li'))

WebUI.click(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/span_sucursalPropuestas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxCasaCentral_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxUnidOperativa'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxSucursal'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults1'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults2'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults3'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults1'), 'Casa Central')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults2'), 'Casa Central')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults3'), 'Casa Central')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

inicioVigenciaDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('10', false)

WebUI.setText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_inicioVigenciaDesde'), inicioVigenciaDesde)

incioVigenciaHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('90', true)

WebUI.setText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_inicioVigenciaHasta'), incioVigenciaHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

def inicioVigenciaDesdeDate = Date.parse('dd/MM/yyyy', inicioVigenciaDesde)

def incioVigenciaHastaDate = Date.parse('dd/MM/yyyy', incioVigenciaHasta)

inicioVigencia1 = WebUI.getText(findTestObject('Emision_FiltrosBasicosPoliza/span_inicioVigenciaResults1'))

inicioVigencia2 = WebUI.getText(findTestObject('Emision_FiltrosBasicosPoliza/span_inicioVigenciaResults2'))

inicioVigencia3 = WebUI.getText(findTestObject('Emision_FiltrosBasicosPoliza/span_inicioVigenciaResults3'))

def inicioVigenciaDate1 = Date.parse('dd/MM/yyyy', inicioVigencia1)

def inicioVigenciaDate2 = Date.parse('dd/MM/yyyy', inicioVigencia2)

def inicioVigenciaDate3 = Date.parse('dd/MM/yyyy', inicioVigencia3)

if (inicioVigenciaDate1 >= inicioVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (incioVigenciaHastaDate >= inicioVigenciaDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (inicioVigenciaDate2 >= inicioVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (incioVigenciaHastaDate >= inicioVigenciaDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (inicioVigenciaDate3 >= inicioVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (incioVigenciaHastaDate >= inicioVigenciaDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_inicioVigenciaDesde'))

WebUI.clearText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_inicioVigenciaHasta'))

finVigenciaDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('10', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaDesde'), finVigenciaDesde)

finVigenciaHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('90', true)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaHasta'), finVigenciaHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

def finVigenciaDesdeDate = Date.parse('dd/MM/yyyy', finVigenciaDesde)

def finVigenciaHastaDate = Date.parse('dd/MM/yyyy', finVigenciaHasta)

finVigencia1 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults1'))

finVigencia2 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults2'))

finVigencia3 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults3'))

def finVigenciaDate1 = Date.parse('dd/MM/yyyy', finVigencia1)

def finVigenciaDate2 = Date.parse('dd/MM/yyyy', finVigencia2)

def finVigenciaDate3 = Date.parse('dd/MM/yyyy', finVigencia3)

if (finVigenciaDate1 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (finVigenciaDate2 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (finVigenciaDate3 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaDesde'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaHasta'))

WebUI.click(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/span_procesNegPropuestas'))

WebUI.click(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/checkboxPolNueva_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults1'), 'Póliza Nueva')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults2'), 'Póliza Nueva')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults3'), 'Póliza Nueva')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/span_procesNegPropuestas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_procesoNegocioTodos'))

WebUI.setText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_numDoc'), numDoc)

if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), 'KATALON, PRODUCTORE', 
    FailureHandling.OPTIONAL)) {
    System.out.println('Todo bien')
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal1'), 'SQUEO, LAUTARO')) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No corresponde con la opción a validar')
}

if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal2'), 'KATALON, PRODUCTORE', 
    FailureHandling.OPTIONAL)) {
    System.out.println('Todo bien')
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal2'), 'SQUEO, LAUTARO')) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No corresponde con la opción a validar')
}

if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal3'), 'KATALON, PRODUCTORE', 
    FailureHandling.OPTIONAL)) {
    System.out.println('Todo bien')
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanProductorPrincipal3'), 'SQUEO, LAUTARO')) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No corresponde con la opción a validar')
}

WebUI.clearText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_numDoc'))

WebUI.setText(findTestObject('Emision_FiltrosBasicosPoliza/input_apellidoRazonSocial'), 'katalon')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados1'), 'KATALON, TOMADORE')

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados2'), 'KATALON, TOMADORE')

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados3'), 'KATALON, TOMADORE')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.setText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_numDoc'), '12312312')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('No se encontraron registros para los filtros especificados.', false)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_AP_FiltrosAvanzadosPropuesta/input_numDoc'))

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Nombre_PersonaNombre'), 'tomadore')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados1'), 'KATALON, TOMADORE')

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados2'), 'KATALON, TOMADORE')

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/spanTomadorResultados3'), 'KATALON, TOMADORE')