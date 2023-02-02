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

WebUI.openBrowser('http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/AccionMovimiento?dt=Sp0OZgn46Z1XCsxH4%252Fmg42kq1yDrUNdn8aYaYwAiMzX%252FiiV8I5VdflYJcamyET94NQ6GRhwB2%252Fx1sOFI7H4oAWL%252FSOBi%252F6Qx7QBND%252FRYyssGaXClVuHoS0blVBVCb9tetAv09QvkZsyBCrshRU6KMNW5BdIUzBUh96SCzum9JzuT%252FqYVAkhFOk0mefnbfFin6%252FAVdPqORbhAllJ6OeHiUDo8spLHJC1vb3lpVoN14zELHRnC7xBqDAxhrholNJj11mEQcfIT6Qy2w5zI9rOnL2Av31PLw5E%252BfHp11%252BJqcj74OwtSbOByrun8mpmhkZIx%252BNOTWJtPiu7w2zC1syCrUg%253D%253D')

WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), 'clave')

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/span_subProducto(contenedor)'))

WebUI.sendKeys(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/span_subProducto(contenedor)'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_ReplicaPoliza_DosGruposAsegurados/span_subProducto(contenedor)'), Keys.chord(Keys.ENTER))

