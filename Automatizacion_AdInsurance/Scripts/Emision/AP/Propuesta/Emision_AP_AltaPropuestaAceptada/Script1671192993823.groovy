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

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor11'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_input_Sexo',
'Sexo', ValorPropuesta_Sexo)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion11'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor12'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Telfono_Telefono'),
ValorPropuesta_Tel)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion12'),
FailureHandling.STOP_ON_FAILURE)

/*
WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Mail para poliza electronica_PolizaElectronica'),
ValorPropuesta_Mail)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), FailureHandling.STOP_ON_FAILURE)
*/

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'),
GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor16'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Prima Informada por el productor_PrimaInformada'),
ValorPropuesta_PrimaInformada)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Poliza SISE_NroPolizaSise'),
ValorPropuesta_nPolizaSISE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion19'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor20'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/textarea_Observaciones_Observaciones'),
ValorPropuesta_Obs)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion20'))

/*
WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor20'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboEquipoTecnico',
'EQUIPO', ValorPropuesta_EqTec)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion20'))
*/

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor22'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RiType_RiType'), ValorPropuesta_RiType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion22'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor23'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MML_MML'), ValorPropuesta_MML)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion23'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor25'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_CiaReferida',
'CiaReferida', ValorPropuesta_CiaReferida)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion25'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor26'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MARS_MARS'), ValorPropuesta_MARS)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion26'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor27'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MethodofPayment_MethodofPayment'),
ValorPropuesta_MetodPayment)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion27'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor28'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RI Type_RIType'), ValorPropuesta_RIType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion28'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor29'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_TreatyCode_TreatyCode'),
ValorPropuesta_TreatyCode)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion29'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor30'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AgencyCommissionRate_AgencyCommissionRate'),
ValorPropuesta_AgencyComRate)


WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion30'))

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


/*
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
*/

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()


numCotizacion0 = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion0 = (numCotizacion0 - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion0, 'Emision_AP_AltaPropAceptada', 1, 27)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()
