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

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : 'http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/AccionMovimiento?dt=80aqsKZKlbf8zfKzRoHCJxPkIoqjtQ64YM4Kv1c83V%252FThV6uLwWUildmyT2bCoFr5YijcwQ3YXdWNksQO2qgqukmC1pTujSdP%252FrNtWl9fp6%252F7B5UFUCMShem37IO%252FflyVuioCrbBd978Igy33OvCE%252Fk49kgJ4xtwCKDMuoLx3AACSdRiiAkxp9q25HREHVFGbJG7v5ufk9924a3STINrtXZEWvZqmbBK8UNrcUyIFOdRwX4%252Bpuf%252BtOx99GINjKDbv32cUxBCOvcSmmU%252F4i%252FqZF1ypVICGoNLb6MT5%252BTT8RfcuypJU5xenLU5PaZYuApBXnppjXeL1MUWVy29bLrw3Z8Uegpuq%252FR7JZXORGecKR33HBtsZ1T%252BTJdkEXgtey%252Ff%252BC5vjNgjCS5gxF1ahTw%252Fjw%253D%253D'
        , ('VerificarNombreModulo') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

