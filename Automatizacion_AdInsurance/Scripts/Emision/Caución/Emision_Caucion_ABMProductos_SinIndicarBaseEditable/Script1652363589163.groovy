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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Infraestructura'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Emisin'))

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_producto'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ABMProducto_Base/input_ramoId', 
    'FilterRamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ABMProducto_Base/input_subRamoId', 
    'FilterSubRamoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_refrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_editarActividadProfesion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/li_vigencias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_seleccionar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/li_Riesgo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ABMProducto_Base/input_comboSubproductoInfraestructuraCaucion', 
    'SubProductoCbo', subProductoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_verDetalle'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/td_sumaAseguradaTopeXpath'))

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/td_sumaAseguradaTopeGrilla'))

//WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/input_sumaAseguradaTope0')) //esto laramente no resultó, pero queda como vestigio
WebUI.clearText(findTestObject('Emision_Caucion_ABMProducto_Base/input_sumaAseguradaTope1'))

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/td_sumaAseguradaTopeXpath'))

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/td_sumaAseguradaTopeGrilla'))

WebUI.sendKeys(findTestObject('Emision_Caucion_ABMProducto_Base/input_sumaAseguradaTope1'), sumaAseguradaTope)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/button_guardarActividadProfesion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/input_checkboxEditableTitulo'))

WebUI.click(findTestObject('Emision_Caucion_ABMProductos_SinIndicarBaseEditable/input_checkboxEsBaseTitulo'))

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_guardarDetalle'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementVisible(findTestObject('Emision_Caucion_ABMProducto_Base/span_errorDebeTenerRiesgoBase'))

