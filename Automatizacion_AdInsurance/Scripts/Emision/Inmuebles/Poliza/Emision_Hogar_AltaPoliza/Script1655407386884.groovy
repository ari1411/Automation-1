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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/button_nuevoMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), prodPrinc // vidal adano, ignacio
    )

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', productoId // (sp hogar informatica nora - hog12)
    )

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
// WebUI.verifyElementText(findTestObject('Emision_Hogar_AltaPoliza/span_subproducto'), 'subproducto Katalon - subproduct')
if (WebUI.getText(findTestObject('Emision_Hogar_AltaPoliza/span_vigenciaContrato')) != 'Anual') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ProsperarPropuesta_TierraDelFuego/input_vigenciaContrato', 
        'VigenciaId_XmlValue', vigenciaContratoId // anual
        )

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
        )
}

if (WebUI.getText(findTestObject('Emision_Hogar_AltaPoliza/span_formaPago')) != 'CUPON') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
        'FormaPagoId_XmlValue', formaPagoId // cupon
        )

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
        )
}

if (WebUI.getText(findTestObject('Emision_Hogar_AltaPoliza/span_planCuotas')) != '1 Cuota-Contado') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectPlanPago', 'PlanCuotasId_XmlValue', 
        planCuotasId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
        )
}

if (WebUI.getText(findTestObject('Emision_Hogar_AltaPoliza/span_planComercial')) != 'plan abierto para cualquier ramo') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Emision_Hogar_AltaPoliza/input_planComercial', 'PlanComercialId', 
        planComercialId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
        )
}

if (WebUI.getText(findTestObject('Emision_Hogar_AltaPoliza/span_moneda')) != 'Pesos') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectTipoMoneda', 
        'TipoMonedaId_XmlValue', monedaId //pesos
        )

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad // WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
        )
}

// subproducto (sp hogar informatica nora - s1)
/*
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectSubProducto', 'SubProductoId_XmlValue',
	subProductoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96', 
    'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocTomador)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
/*
WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_Asegurado_tabPersona_2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96',
	'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'),
	nDocAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
WebUI.click(findTestObject('Emision_Hogar_AltaPoliza/li_riesgosHogar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/span_Detalles'))

WebUI.click(findTestObject('Object Repository/Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/span_Adicionales (6)'))

WebUI.click(findTestObject('Object Repository/Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_Adicionales_Seleccionadoobject HTMLIn_f70834'))

WebUI.click(findTestObject('Object Repository/Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/button_Cerrar'))

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Hogar_AltaPoliza/input_provinciaHogar', 
    'ProvinciaIdInmueble_XmlValue', provinciaId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.delay(3)

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

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_calleInmueble'), calle)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_alturaInmueble'), altura)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_pisoInmueble'), piso)

WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_departamentoInmueble'), departamento)

// WebUI.setText(findTestObject('Emision_Hogar_AltaPoliza/Page_Alta de Pliza Nueva - Hogar/input_metrosCuadrados'), '65')
WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

// WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Hogar_AltaPoliza', 1, 23)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Hogar_AltaPoliza', 1, 24)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

