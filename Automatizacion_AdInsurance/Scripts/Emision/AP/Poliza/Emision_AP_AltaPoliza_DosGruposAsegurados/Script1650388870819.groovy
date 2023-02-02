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

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad) < CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'(
    'Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/button_nuevoMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), prodPrincipal)

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', producto)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectSubProducto', 
    'SubProductoId_XmlValue', subproducto)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectVigenciaContrato', 
    'VigenciaId_XmlValue', vigenciaContrato)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectFormaPago', 
    'FormaPagoId_XmlValue', formaPago)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectPlanPago', 
    'PlanCuotasId_XmlValue', planCuotas)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocTomador)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/a_agregarActividad'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.clearText(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/input_actividadGrupo2Input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/input_actividadGrupo2Input'), 'Abogad')

WebUI.sendKeys(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/input_actividadGrupo2Input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Ver asegurados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowTitle('Consulta de asegurados')

WebUI.click(findTestObject('Emision_AP_PrecondicionAltaPolizasparaProrrogar/button_altaAsegurado'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputTipoDocAsegurado', 
    'TipoDocumentoAseguradoId', tipoDoc)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Asegurado (Nuevo)/input_Nro. documento_NumeroDocumento'), dni)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/aside_clickFueraDelCampoNuevoAsegurado'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/span_gruposActividad'), 1)

WebUI.delay(7)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_ReplicaPoliza_DosGruposAsegurados/inputGruposActividadMovimiento', 
    'MovimientoActividadId', grupoActividad)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Asegurado (Nuevo)/_SelectTipoBeneficiario', 
    'TipoBeneficiario', tipoBeneficiario)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Asegurado (Nuevo)/button_Guardar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_PrecondicionAltaPolizasparaProrrogar/button_altaAsegurado'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputTipoDocAsegurado', 
    'TipoDocumentoAseguradoId', tipoDocAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/input_dniAsegurado'), dniAsegurado)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/aside_clickFueraDelCampoNuevoAsegurado'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_ReplicaPoliza_DosGruposAsegurados/inputGruposActividadMovimiento', 
    'MovimientoActividadId', grupoActividadAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Asegurado (Nuevo)/_SelectTipoBeneficiario', 
    'TipoBeneficiario', tipoBeneficiarioAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Asegurado (Nuevo)/button_Guardar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// a continuacion iba a hacer una modificacion de datos de cada asegurado, para que se actualizaran automaticamente algunos datos,
// pero creo que no va a ser necesario, por eso es que queda comentado
/*WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/menuDatosAsegurado'))

if (WebUI.verifyElementPresent(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'),
	1, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'))
} else if (WebUI.verifyElementPresent(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'),
	1, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'))
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/buttonGrabar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/a_menuDatosAsegurado2'))

if (WebUI.verifyElementPresent(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'),
	1, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'))
} else if (WebUI.verifyElementPresent(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'),
	1, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'))
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/buttonGrabar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.closeWindowTitle('Consulta de asegurados')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - ACCIDENTES PERSONALES - 111072/a_Copiar asegurados'))

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

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

String numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_AP_AltaPlza_DosGrupsAse', 1, 19)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_AP_AltaPlza_DosGrupsAse', 1, 20)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

