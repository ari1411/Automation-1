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

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'),
	FechaEmiHasta)

WebUI.click(findTestObject('Page_Consulta de propuestas/_Select_EstadoCotizacionId_listbox'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_ConsultaMovimiento/checkBoxPropuestaRechazada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Exportar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Replicar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Imprimir'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de movimientos/li_Consultas'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de estados'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de notificaciones'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Marcas de gestion'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de propuestas/_Select_EstadoCotizacionId_listbox'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_ConsultaMovimiento/checkBoxPropuestaRechazada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEmitida'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Exportar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Replicar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Imprimir'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de movimientos/li_Consultas'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de estados'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de notificaciones'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Marcas de gestion'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de propuestas/_Select_EstadoCotizacionId_listbox'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEmitida'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAnulada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Exportar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Replicar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Imprimir'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de movimientos/span_Consultas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de movimientos/li_Consultas'))

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de estados'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Log de notificaciones'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Consulta de propuestas/span_Marcas de gestion'), FailureHandling.STOP_ON_FAILURE)

