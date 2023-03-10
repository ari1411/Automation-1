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

// WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))
WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Consulta de movimientos'))

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

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotPrecond)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_Endoso_ActualizacionDeNomina/li_endosar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboGrupoEndosoEmergente', 
    'cboGrupoEndoso', grupoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoEmergente', 
    'cboTipoEndoso', tipoEndosoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboTipoEndosoCausa', 
    'cboTipoEndosoCausa', tipoEndosoCausaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonContinuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/li_RiesgosVehiculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - Autos/_btnAgregarAuto'))




















WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Marca_MarcaAutoId.XmlValue_input'),
	Marca) // toyota (45)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Marca_MarcaAutoId.XmlValue_input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Modelo_ModeloAutoId.XmlValue_input'),
	Modelo) // etios 1.5 4 ptas platinum - iaa

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Modelo_ModeloAutoId.XmlValue_input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Ao_Anio.XmlValue_input'),
	Anio) // 2020

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Kilometraje',
	'KilometrajeAutoId_XmlValue', Kilometraje) // 1 a??o de uso (1)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/input_Suma asegurada_k-numeric-wrap k-state-_a41a9d'))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Suma asegurada_SumaAsegurada.DecimalValue'),
	SumaAsegurada) // 1200000



CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Destino',
	'DestinoAutoId_XmlValue', Destino) // particular (1)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Carroceria',
	'CarroceriaAutoId_XmlValue', Carroceria) // cerrada (2)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Provincia',
	'ProvinciaIdAuto_XmlValue', Provincia) // caba (1)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'),
	GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'),
	Localidad) // ciudad autonoma de buenos aires

WebUI.delay(Integer.parseInt(EsperaLocalidad))

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_C. P._CodigoPostalAuto_input'),
	CodigoPostal)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Patente_Patente.StringValue'),
	Patente)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Motor_Motor.StringValue'),
	Motor)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Chasis_Chasis.StringValue'),
	Chasis)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_ClausulaAjuste',
	'ClausulaAjusteAutoId_XmlValue', ClausulaAjuste)

WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/div_Datos del propietario'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)












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
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

/*
numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'N??mero de cotizaci??n: ')

numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'N??mero de p??liza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Hogar_Endoso_AjustCosto', 1, 14)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Hogar_Endoso_AjustCosto', 1, 15)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')
*/
WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'))

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado,
	FailureHandling.STOP_ON_FAILURE)



