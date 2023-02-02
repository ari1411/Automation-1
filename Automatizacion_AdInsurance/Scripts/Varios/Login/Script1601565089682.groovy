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

if (NuevaVentana) {
    if (!(VerificarEstaAbierto)) {
        WebUI.openBrowser(Url)
    } else {
        try {
            WebUI.navigateToUrl(Url)
        }
        catch (def BrowserNotOpenedException) {
            WebUI.openBrowser(Url)
        } 
    }
}

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

if (WebUI.verifyElementPresent(findTestObject('Page_/input_Usuario_Usuario'), 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), Usuario)

    WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), Clave)

    WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

    WebUI.waitForPageLoad(20)
} else {
    Utils.logInfo('No cargó pantalla Login')
}

if (VerificarNombreModulo) {
	
    if (WebUI.verifyElementPresent(findTestObject('Page_/span_NombreModulo'), 3, FailureHandling.OPTIONAL)) {
        if (WebUI.verifyElementText(findTestObject('Page_/span_NombreModulo'), NombreModulo, FailureHandling.OPTIONAL)) {
            Utils.markPassed('01 - Entro a Menu')
        } else {
            Utils.markFailedAndStop('ERROR: No ingreso al modulo ' + NombreModulo)
        }
    } else {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'('')

        Utils.markFailedAndStop('ERROR: No llego a Page_Menu')
    }
}

