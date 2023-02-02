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

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : false, ('Url') : findTestData(
            '_Login').getValue(1, 1), ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(
            3, 1), ('VerificarNombreModulo') : true, ('NombreModulo') : 'Emisión'], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/span_Cotizacin_k-numeric-wrap k-state-defau_ed4460'))

WebUI.setText(findTestObject('Object Repository/Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), NumeroCotizacion)

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_CotizacionId'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_CotizacionId'), NumeroCotizacion)

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k_0cde73'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/span_Replicar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

String FechaFinVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(DiasFechaFinVigencia, true)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
    FechaFinVigencia)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
    GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/button_Guardar_lnkGuardarAcciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

nCotizacion = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de cotizacin 106516'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nCotizacion)

nPropuesta = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de propuesta 934'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nPropuesta)

nCotizacion = (nCotizacion - 'Número de cotización: ')

Utils.logInfo(nCotizacion)

nPropuesta = (nPropuesta - 'Número de propuesta: ')

Utils.logInfo(nPropuesta)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_AutoIndividual_ReplicaP', 1, 4)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPropuesta, 'Emision_AutoIndividual_ReplicaP', 1, 5)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_c6f968/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/span_Cotizacin_k-numeric-wrap k-state-defau_ed4460'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacion)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Consulta de propuestas/a_Refrescar'))

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/td_CotizacionId'), nCotizacion)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

