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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Ramos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Ramos/input_Id_FilterId'), RamoId)

WebUI.click(findTestObject('Object Repository/Page_Ramos/a_Refrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementText(findTestObject('Emision_AP_ActivacionRamo/td_celdaPropuestaHabilitada'), 'No', FailureHandling.OPTIONAL)) {
	WebUI.scrollToElement(findTestObject('Object Repository/Page_Ramos/a_k-grid-Editar'), GlobalVariable.WaitForLoad)
	
	WebUI.click(findTestObject('Object Repository/Page_Ramos/a_k-grid-Editar'))
	
	WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)
	
	WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
	
	WebUI.click(findTestObject('Object Repository/Page_Ramo (Modificacin)/label_Propuesta habilitada'))
	
	CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()
	
	WebUI.click(findTestObject('Object Repository/Page_Ramo (Modificacin)/button_Grabar'))
	
	WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)
	
	WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
	
	WebUI.setText(findTestObject('Object Repository/Page_Ramos/input_Id_FilterId'), RamoId)
	
	WebUI.click(findTestObject('Object Repository/Page_Ramos/a_Refrescar'))
	
	WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)
	
	WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
	
	WebUI.verifyElementText(findTestObject('Emision_AP_ActivacionRamo/td_celdaPropuestaHabilitada'), 'Si', FailureHandling.OPTIONAL)
}

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

