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

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), ProductorPrincipal // vidal adano, ignacio
    )

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    ValorPropuesta_nPolizaRenovadaSISE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    ValorPropuesta_CodAseg)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    ValorPropuesta_NombreAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    ValorPropuesta_ApellidoAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_inputTipoDocumento', 
    'TipoDocumento', ValorPropuesta_TipoDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor08'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nro. Documento_NroDocumento'), 
    ValorPropuesta_nDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion08'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor09'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Direccin_Direccion'), 
    ValorPropuesta_Direccion)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor10'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_input_Sexo', 
    'Sexo', ValorPropuesta_Sexo)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor11'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Telfono_Telefono'), 
    ValorPropuesta_Tel)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion11'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor12'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Mail para poliza electronica_PolizaElectronica'), 
    ValorPropuesta_Mail)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion12'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), 
    GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Prima Informada por el productor_PrimaInformada'), 
    ValorPropuesta_PrimaInformada)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor16'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Poliza SISE_NroPolizaSise'), 
    ValorPropuesta_nPolizaSISE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor17'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/textarea_Observaciones_Observaciones'), 
    ValorPropuesta_Obs)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion17'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboEquipoTecnico', 
    'EQUIPO', ValorPropuesta_EqTec)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion19'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor21'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RiType_RiType'), ValorPropuesta_RiType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion21'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor22'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MML_MML'), ValorPropuesta_MML)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion22'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_CiaReferida', 
    'CiaReferida', ValorPropuesta_CiaReferida)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion24'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor25'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MARS_MARS'), ValorPropuesta_MARS)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion25'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor26'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MethodofPayment_MethodofPayment'), 
    ValorPropuesta_MetodPayment)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion26'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor27'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RI Type_RIType'), ValorPropuesta_RIType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion27'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor28'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_TreatyCode_TreatyCode'), 
    ValorPropuesta_TreatyCode)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion28'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor29'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AgencyCommissionRate_AgencyCommissionRate'), 
    ValorPropuesta_AgencyComRate)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion29'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96', 
    'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocTomador)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_Asegurado_tabPersona_2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96', 
    'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

numCotizacion0 = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion0 = (numCotizacion0 - 'Número de cotización: ')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion0)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numPropResultados = WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados1'))

WebUI.verifyNotEqual(numPropResultados, '')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ReplicaPoliza_OrigenPropuesta/buttonContinuarProsperar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_emision'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', productoId // (sp hogar informatica nora - hog12)
    )

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

// subproducto (sp hogar informatica nora - s1)
/*
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectSubProducto', 'SubProductoId_XmlValue',
	subProductoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ProsperarPropuesta_TierraDelFuego/input_vigenciaContrato', 
    'VigenciaId_XmlValue', vigenciaContratoId // anual
    )

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_riesgosCaucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.getText(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/span_tasasFranquiciasAut_b')) == 'No') {
    WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/span_tasasFranquiciasAut_b'))
}

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
WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

// 2:10
WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_ReplicPol_OrigProp', 1, 5)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Cauc_ReplicPol_OrigProp', 1, 6)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.navigateToUrl(consultaMovimientos)

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

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/botonReplicarPropuesta'))

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

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_ReplicPol_OrigProp', 1, 36)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Cauc_ReplicPol_OrigProp', 1, 37)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)


WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'))

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))