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

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : 'http://adinsuranceqa.ddns.net/AdInsurance/general/Gestion/ProcesoAutomatico/VerVisualizador/1'
        , ('VerificarNombreModulo') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_instancias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementVisible(findTestObject('Emision_AP_ProcesosAutomaticos/td_condEstadoActivoNo'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_editarInstancia'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.delay(2)

    //  WebUI.sendKeys(findTestObject('Emision_AP_ProcesosAutomaticos/span_switch_activo'), Keys.chord(Keys.SPACE))
    WebUI.executeJavaScript('input[name="Activo"][0].click()', null)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

