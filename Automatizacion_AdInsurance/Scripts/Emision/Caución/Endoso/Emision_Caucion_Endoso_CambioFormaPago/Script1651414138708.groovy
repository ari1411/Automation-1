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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

//WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPolizaPrecondicion)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacionPrecond)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))


/*WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/










WebUI.click(findTestObject('Page_Consulta de movimientos/span_Endosar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

'20 en HS\r\n164 en Meridional??'
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_emision'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
    'FormaPagoId_XmlValue', formaPagoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), NumeroTarjeta)
*/

MetPagoActual = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'))

//MetPagoActual = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'), 'value')

if (MetPagoActual == 'CUPON') {
	CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago',
		'FormaPagoId_XmlValue', formaPagoIdVisa)

	WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), '4111111111111111')
}

if (MetPagoActual == 'VISA') {
	CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago',
		'FormaPagoId_XmlValue', formaPagoIdCupon)
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
/*
WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
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

String numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_Endos_CmbioFormPag', 1, 13)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPoliza, 'Emision_Cauc_Endos_CmbioFormPag', 1, 14)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(120)

WebUI.waitForJQueryLoad(120)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

