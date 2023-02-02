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

WebUI.enableSmartWait()

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(1, 1), ('Usuario') : findTestData(
            '_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Infraestructura'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Emisin'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Productos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Productos/input_Id_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Productos/input_Id_FilterId'), ProductoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_CboFilterRamoId', 'FilterRamoId', 
    RamoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_CboFilterSubRamoId', 'FilterSubRamoId', 
    SubRamoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Ramos/a_k-grid-Editar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Producto (Modificacin)/li_Vigencias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Producto (Modificacin)/a_k-button-icontext k-grid-Seleccionar'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/li_Riesgos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/span_Seleccione_k-select'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/li_Riesgos_Subproducto'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(1)

if (Click_Editable == 'Si') {
    WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/input_Suscribible_editableHeader'))

    WebUI.delay(1)
}

if (Click_EsBase == 'Si') {
    WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/input_Editable_esBaseHeader'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/a_Centro costo_-_VerDetalle'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(13) 112019 - 31122050/td_Pesos-SumaAseguradaTope'))

WebUI.clearText(findTestObject('Page_Vigencia Vigencia 1(13) 112019 - 31122050/input_Pesos_SumaAseguradaTope'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(13) 112019 - 31122050/td_Pesos-SumaAseguradaTope'))

WebUI.sendKeys(findTestObject('Page_Vigencia Vigencia 1(13) 112019 - 31122050/input_Pesos_SumaAseguradaTope'), SumaAseguradaTope)

WebUI.sendKeys(findTestObject('Page_Vigencia Vigencia 1(13) 112019 - 31122050/input_Pesos_SumaAseguradaTope'), Keys.chord(
        Keys.ENTER))

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/button_Guardar_Detalles'))

WebUI.delay(1)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Vigencia Vigencia 1(26) 112019 - 31122050/a_Guardar_Vigencia'))

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Producto (Modificacin)/button_Grabar_Producto'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Productos/span_Productos'), VerificarTexto)

WebUI.closeBrowser()

