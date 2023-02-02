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
import java.text.DecimalFormat as DecimalFormat

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

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Endosar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(1)

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/tbody_riesgos'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/tr_riesgos'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/td_desempeñoXpath'))

while (WebUI.verifyElementNotPresent(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/td_desempeñoEditable'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/td_desempeñoXpath'))
}

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/span_despempActivProfesion1'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/span_despempActivProfesion2'))

/*
WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.clearText(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

*/
WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

sumAsegurada1 = WebUI.getAttribute(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'), 
    'value')

sumAsegurada0 = WebUI.getAttribute(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/input_desempActivProfesion0'), 'value') // formato '1,000.00'

sumAseguradaFloat = ((sumAsegurada1) as Float)

sumAseguradaFloat = (sumAseguradaFloat * 1.2)

nuevaCifraString = sumAseguradaFloat.toString()

print(nuevaCifraString)


WebUI.clearText(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/tbody_riesgos'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/tr_riesgos'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/td_desempeñoXpath'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/span_despempActivProfesion1'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/span_despempActivProfesion2'))

/*
WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.clearText(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

*/
WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'))

WebUI.sendKeys(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/Page_Alta de Endoso - CAUCION/input_DESEMPEO DE ACTIVIDAD O PROFESIN_Suma_60883a'),
	nuevaCifraString)

/*
WebUI.click(findTestObject('Emision_Caucion_Endoso_AumentoSumaAsegurada/td_celdaSumaAseguradaDesempeño'))

WebUI.sendKeys(findTestObject('Page_Alta de Pliza Nueva - ACCIDENTES PERSONALES/input_Muerte Accidental_SumaAsegurada'),
	SumaAseguradaPublica)

WebUI.sendKeys(findTestObject('Page_Alta de Pliza Nueva - ACCIDENTES PERSONALES/input_Muerte Accidental_SumaAsegurada'),
	Keys.chord(Keys.ENTER))
   */
WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonEmitir', 'lnkEmitir')

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

nCotizacion = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de cotizacin 106516'),
	FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nCotizacion)

nPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de propuesta 934'),
	FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nPoliza)

nCotizacion = (nCotizacion - 'Número de cotización: ')

Utils.logInfo(nCotizacion)

nPoliza = (nPoliza - 'Número de póliza: ')

Utils.logInfo(nPoliza)

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_Caucion_Endoso_AuSumAse', 1, 7)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_Caucion_Endoso_AuSumAse', 1, 8)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

// WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), nPoliza)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'))

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), 5)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), 'Aumento de suma asegurada')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()