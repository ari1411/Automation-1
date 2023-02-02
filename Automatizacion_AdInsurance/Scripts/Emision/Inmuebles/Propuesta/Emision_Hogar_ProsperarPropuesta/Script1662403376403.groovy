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

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), FechaEmiHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'), 1)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Hogar_ProsperarPropuesta/button_continuarSubRamo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', productoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/li_riesgosHogar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Hogar_AltaPoliza/input_provinciaHogar', 
    'ProvinciaIdInmueble_XmlValue', provinciaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), localidad)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_Hogar_AltaPoliza/input_localidadHogar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/input_codigoPostal'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Emision_Hogar_AltaPoliza/input_codigoPostal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/input_codigoPostal'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/input_codigoPostal'), codigoPostal)

WebUI.sendKeys(findTestObject('Emision_Hogar_AltaPoliza/input_codigoPostal'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_calleInmueble'), 1)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_calleInmueble'), calle)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_alturaInmueble'), altura)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_pisoInmueble'), piso)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_departamentoInmueble'), departamento)

WebUI.scrollToElement(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/span_Mts. cuadrados_k-numeric-wrap k-state-_e1699a'), 
    1)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/span_Mts. cuadrados_k-numeric-wrap k-state-_e1699a'))

WebUI.setText(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/input_Mts. cuadrados_MetrosCuadrados.DecimalValue'), 
    '45')

WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/div_function DefaultCampoEmisionEvent(e)   _bea8e3'))

/*
WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/td_Incendio Parcial  1065_grdInmuebleRiesgo_aa9454'))

WebUI.setText(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/input_Incendio Parcial  1065_SumaAsegurada'), 
    '1500000')

WebUI.sendKeys(findTestObject('Page_Modificacin de Pliza Nueva - Hogar - 321802/input_Incendio Parcial  1065_SumaAsegurada'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/div_function DefaultCampoEmisionEvent(e)   _bea8e3'))
*/

/*
WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/span_Mts. cuadrados_k-numeric-wrap k-state-_e1699a'))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/input_Mts. cuadrados_MetrosCuadrados.DecimalValue'), 
    '45')

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/input_Mts. cuadrados_MetrosCuadrados.DecimalValue'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Hogar - 321802/aside_Automation QA        automation      _df3052'))
*/

WebUI.scrollToElement(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), 1)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

