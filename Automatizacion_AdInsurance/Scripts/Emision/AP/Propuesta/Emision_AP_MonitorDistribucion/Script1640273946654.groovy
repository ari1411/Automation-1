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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'))

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(1, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'),
	FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxProcesoNegocioRenovacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

equipoDistrib = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'))

nCotizacion = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion/spanNumCotizacion1'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/a_GestionMonitorDistribucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (equipoDistrib == equipoDistribucion1) {
    WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorAP'))
} else if (equipoDistrib == equipoDistribucion2) {
    WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorCaucion'))
} else if (equipoDistrib == equipoDistribucion3) {
    WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorAutosInmuebles'))
} else if (equipoDistrib == equipoDistribucion4) {
    WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorHogar'))
} else {
    Utils.logInfo(msgeErrorCorrespondenciaEquipoDistribucion)
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotiacionMonitorDistribucionPrevio'))

WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotizacionMonitorDistribucion'), nCotizacion)

// podria poner if estDistrib == talCosa1; click(checkboxTalCosa1)
//WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorAP'))
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'), equipoDistrib)

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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion/comboEquipoDistribucion', 
    'EquipoDistribucionId', idOpcionEquipoDistrib)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/spanProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxProcesoNegocioProrroga'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

equipoDistrib = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'))

nCotizacion = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion/spanNumCotizacion1'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/a_GestionMonitorDistribucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorCaucion'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotiacionMonitorDistribucionPrevio'))

WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotizacionMonitorDistribucion'), nCotizacion)

// WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorCaucion'))
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'), equipoDistrib)

WebUI.closeBrowser()

