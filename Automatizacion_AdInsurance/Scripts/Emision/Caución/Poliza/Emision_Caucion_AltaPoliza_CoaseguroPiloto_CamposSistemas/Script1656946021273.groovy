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

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/button_nuevoMovimiento'))

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

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocAsegurado)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_emision'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), prodPrinc)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', productoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ProsperarPropuesta_TierraDelFuego/input_vigenciaContrato', 
    'VigenciaId_XmlValue', vigenciaContratoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
    'FormaPagoId_XmlValue', formaPagoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_riesgosCaucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.getText(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/span_tasasFranquiciasAut_b')) == 'No') {
    WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/span_tasasFranquiciasAut_b'))
}

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/li_Coaseguro'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/span_k-switch-handle'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva - CAUCION/select_TipoContratoCoaseguro', 
    'TipoContratoCoaseguroId_XmlValue', TipoContratoCoaseguroId)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/span_Nuevo'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva - CAUCION/Select_Compania', 
    'CompaniaId', CompaniaId)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva - CAUCION/Select_Broker', 
    'BrokerId', BrokerId)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Seleccione_EsPiloto'))

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido1'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido2'), PorcentajeCedido1)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Suma asegurada cedida_k-formatted'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Suma asegurada cedida_SumaAseguradaCedida'), SumaAsegurada)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Prima_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Prima_Prima'), Prima)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Premio_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Premio_Premio'), Premio)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/button_Guardar_Coaseguro'))

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/span_Nuevo'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva - CAUCION/Select_Compania', 
    'CompaniaId', CompaniaId2)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva - CAUCION/Select_Broker', 
    'BrokerId', BrokerId)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido1'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido2'), PorcentajeCedido2)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Suma asegurada cedida_k-formatted'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Suma asegurada cedida_SumaAseguradaCedida'), SumaAseguradaCedida2)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Prima_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Prima_Prima'), Prima)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Premio_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_Premio_Premio'), Premio)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/button_Guardar_Coaseguro'))

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.delay(2)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/buttonCerrarValidaciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/a_k-grid-Editar_grdCoaseguros2'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido1'))

WebUI.sendKeys(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_ cedido_PorcentajeCedido2'), PorcentajeCedido3)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/button_Guardar_Coaseguro'))

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_riesgosCaucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/td_Riesgo_1_4'))

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_OBRA PBLICA_SumaAsegurada'), SumaAsegurada)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_riesgosCaucion'))

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonEmitir'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

