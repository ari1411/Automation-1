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

/*
WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : true, ('Url') : 'http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/AccionMovimiento?dt=qX1j7kOjCDIyW6fQWL%252BXiVBwghVsoF3c94Qaw2V5eU8dsFwjv1TOsmIxFButwClf6D5Qm0v1n5Fe%252FU6EcXDbYBgwvXe6W3CEGd5wLaNQ8ykp8yZ91XLOJKkvKvSU9HyF%252Br9R6XnhlNk4rPS6So0lstepdFOn6zuplOO6h6NHYX%252BjtK9gVXmV1NSfEpDH%252B7d%252B5Y%252FstPSraopZ%252BLudxNhxk3D7H%252FlnRWQvKeH71iJqodIic9rzG%252BGfPpauUv5mMAEecrpyFSUjI6BiCquPAL0fJA%252F0Kws0sscVWEC%252BOsycen0G0GxfMT49sexhat8ay5WRdpmpBESPRY3meaJkUvwH6Q%253D%253D'
        , ('VerificarNombreModulo') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()
*/
primero = CustomKeywords.'hs.utils.convertString.stringFormatoNumericoSinDecimales'('1.000.000,00')

Utils.logInfo(primero)

segundo = '200000'

Utils.logInfo(segundo)

suma = (primero + segundo)

Utils.logInfo(suma)

tercero = ((primero) as int) + ((segundo) as int)

Utils.logInfo(tercero)

