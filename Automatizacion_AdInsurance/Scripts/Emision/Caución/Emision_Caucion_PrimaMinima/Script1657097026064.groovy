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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/span_Tomadores'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), nDocTomador)

WebUI.click(findTestObject('Object Repository/Page_Tomadores/a_Refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Ramos/a_k-grid-Editar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementNotPresent(findTestObject('Page_Tomadores (Modificacin)/input_Comisin _RespetaPrimaMinima_Value_True'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Tomadores (Modificacin)/input_Prima mnima anual _k-formatted-value k-input'))

    WebUI.clearText(findTestObject('Page_Tomadores (Modificacin)/input_Prima mnima anual _PrimaMinima'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Tomadores (Modificacin)/input_Prima mnima anual _k-formatted-value k-input'))

    WebUI.sendKeys(findTestObject('Page_Tomadores (Modificacin)/input_Prima mnima anual _PrimaMinima'), MontoPrimaMinima)

    WebUI.click(findTestObject('Emision_Caucion_RevisionSelladoUSD/span_respetaPrimaMinima'))

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Page_Tomadores (Modificacin)/button_GrabarTomador'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/span_Nuevo'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoId)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

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

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/td_Riesgo_1_4'))

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_DesempenoActProf_SumaAsegurada'))

WebUI.clearText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_DesempenoActProf_SumaAsegurada'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva - CAUCION/td_Riesgo_1_4'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva - CAUCION/input_DesempenoActProf_SumaAsegurada'), MontoSumaAseg)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_riesgosCaucion'))

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.delay(2)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent(TxtValidacion, false)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

