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

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

/*
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaEnEspera'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))
*/
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/botonModificarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/li_validaciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_EquipoDistribución_ModificarManualmente/comboEquipoDistribucion', 
    'EquipoDistribucionId_XmlValue', eqDistribId)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_EquipoDistribución_ModificarManualmente/comboUsuarioDistribucion', 
    'UsuarioDistribucionId_XmlValue', findTestData('Emision_AP_EquipoDistribución_ModificarManualmente').getValue(4, 1))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

equipDistribucion = WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/h4_equipoDistribucion'))

equipDistribucion = (equipDistribucion - 'Equipo de distribución: ')

usuarioDistribucion = WebUI.getText(findTestObject('Emision_AP_EquipoDistribución_ModificarManualmente/h4_usuarioDistribucion'))

usuarioDistribucion = (usuarioDistribucion - 'Usuario de distribución: ')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

//WebUI.verifyEqual(equipDistribucion, eqDistribEsperado)
WebUI.verifyEqual(usuarioDistribucion, usDistribEsperado)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

Utils.logInfo(numCotizacion)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_AP_EqDistrb_ModifManual', 1, 6)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(nuevaURL)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), Usuario)

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), Clave)

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/checkboxEquipoEmisorAP'))*/

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotiacionMonitorDistribucionPrevio'))

WebUI.setText(findTestObject('Emision_AP_MonitorDistribucion/inputNumCotizacionMonitorDistribucion'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanNumCotizacion1'), numCotizacion)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'), equipDistribucion)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'), eqDistribEsperado, FailureHandling.STOP_ON_FAILURE)

