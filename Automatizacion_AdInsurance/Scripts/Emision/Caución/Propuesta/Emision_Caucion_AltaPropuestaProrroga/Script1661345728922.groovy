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










WebUI.click(findTestObject('Emision_Caucion_PropuestaIncompleta_SinDatos/span_nuevaPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/comboProcesoNegocio',
	'cboProcesoNegocioId', ProcesoNegocioId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent('El valor de la póliza en la propuesta no debería ser nulo para el proceso de negocio seleccionado',
	false)

WebUI.verifyTextPresent('Debe ingresar un productor en la propuesta.', false)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Button_CerrarValidaciones'))

WebUI.setText(findTestObject('Page_Modificacin de propuesta de Endoso - CAUCION - 244362/input_Pliza_txtPolizaOrigen'),
	nPolizaPrecond)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

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






















/*
numDocTomadorActual = WebUI.getText(findTestObject('Emision_Caucion_AltaPropuestaProrroga/label_numDoc'))

WebUI.verifyNotEqual(numDocTomadorActual, '')
*/

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

/*
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
*/

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboGrupoEndosoEmergente', 
    'cboGrupoEndoso', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoEmergente', 
    'cboTipoEndoso', tipoEndosoId2)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoCausa', 
    'cboTipoEndosoCausa', tipoEndosoCausaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonContinuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

WebUI.navigateToUrl(linkConsultaMovimientos)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

/*
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
*/

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado)

