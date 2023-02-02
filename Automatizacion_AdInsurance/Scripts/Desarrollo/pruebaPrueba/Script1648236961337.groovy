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

WebUI.openBrowser(' http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/AccionMovimiento?dt=xo1bIPukyjp1%252FwobP%252FnXZTidC1SN9tW%252Bmwbh5mKKsREIdhgF9Wtc9bZfVue%252FBCJd3eKTy0GuoMIc7PfijvrJmTQ4Voo7xhq916at7fUGYk3QgnNnLsz2YYd%252BbBKjOR0fys96GMdO7hq8cQ8ewlwK6wAnQ9Wv7BwFUuCDSloZ4tyjGquYMsxekJvdnLEtL9HkDKawqIgXkKQ7c1sGiIxb0qcuCnqvExp%252BdLk5o3uvzIFydOYVH6wOdI%252BqmSvm5XwqayyisVXS4TDZNM6wTv6VY7C%252FsQXP4CPHEZN5M%252FHLt9vqQGTzteGN%252FjoVz6rtTSd7xlAlyGInf3p1u6iJw8AY3V8xR0X9HUZpkPb3smmqz%252BzkIdE2xeNXHyQv8BCJ1Ydm')

WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), 'clave')

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/li_RiesgosVehiculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

sumAsegOrig = WebUI.getAttribute(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'), 
    'value')

sumAsegOrig = ((sumAsegOrig) as Float)

sumAsegOrig = (sumAsegOrig * 1.2)

sumAsegOrig = sumAsegOrig.toString()

// WebUI.setText(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'), sumAsegOrig)
WebUI.click(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'))

WebUI.clearText(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'))

WebUI.click(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'))

WebUI.sendKeys(findTestObject('Emision_AutoIndividual_Endoso_AumentoSumaAsegurada/input_sumaAseguradaAuto'), sumAsegOrig)

WebUI.delay(20)

