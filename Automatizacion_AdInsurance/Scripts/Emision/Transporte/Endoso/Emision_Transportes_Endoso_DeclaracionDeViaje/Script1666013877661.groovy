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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

// WebUI.click(findTestObject('Page_Consulta de movimientos/span_Endosar'))
WebUI.click(findTestObject('Emision_AP_Endoso_ActualizacionDeNomina/li_endosar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    grupoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

'20 en HS\r\n164 en Meridional??'
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    tipoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    tipoEndosoCausaId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Transporte_GenerarPresupuesto/li_riesgosTransporte'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Transportes_Endoso_DeclaracionDeViaje/button_nuevaDeclaracionViaje'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Fecha inicio_FechaInicio'), 
    '17/10/2022')

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Fecha fin_FechaFin'), 
    '25/10/2022')

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/span_Monto custodia_k-numeric-wrap k-state-_3a962b'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Monto custodia_MontoCustodia'), 
    '100000')

WebUI.focus(findTestObject('Emision_Transporte_Endoso_AumentoSumaAsegurada/tr_transitoAereo'))

WebUI.click(findTestObject('Emision_Transporte_Endoso_AumentoSumaAsegurada/tr_transitoAereo'))

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/td_Transito areo_grdRiesgoTransporte_active_cell'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Transito areo_SumaAseguradaTransportada'), 
    '15000')

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/td_Transito areo_grdRiesgoTransporte_active_cell'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Transito areo_SumaAseguradaTransportada'), 
    '15000')

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/td_Transito areo_grdRiesgoTransporte_active_cell'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Transito areo_SumaAseguradaTransportada'), 
    '15000')

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/span_45.000,00'))

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/button_Grabar'))

