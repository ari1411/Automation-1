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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://adinsuranceqa.ddns.net/AdInsurance/Emision/Account/Login?ReturnUrl=%2FAdInsurance%2FEmision%2FGestion%2FMovimiento%2FAccionMovimiento%3Fdt%3DwV8nuLAPZDoNEI2RyO5cQc%25252BUiEKC%25252BaOtGb7ozatz9Q72eVvPdvNPhe9YJWP9GsbLDmzKJIHupwVyP0e36Oya9EF5Xh%25252F37JhmawJTaFSnSUXi6ZLTOuAQ%25252BfucQ%25252FjyTnhFHx1IQ0u2Kba8Ic5Ik%25252FEAMRvQ%25252B%25252BiuaT%25252Fq3xvs3g4haADyQ7PaDzUf3GZ4rrcwQfA3GV1VozXvXRqrWMYz7m54GcrGYZXBzxHREj7TOHhXblw66hwOOGyXOBQGdPzkYeliwVmgcYlB29O7T4VB1Rckx%25252BuI7DP7SfYUauivdNk1gXCf5VyFYS3O%25252Bl6gRyaUxMvoB0SEWAQNWJz45Go9ksdQ2STa%25252FChe4xQVEI2xf5PMo2UH1zBqY78kb%25252BYnXFy14ZI4')

WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), 'automation')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Contrasea_password'), 'x8YlipdcAoUuB2dag9h+Rg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_Contrasea_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Emision_Transporte_GenerarPresupuesto/li_riesgosTransporte'))

WebUI.click(findTestObject('Emision_Transportes_Endoso_DeclaracionDeViaje/button_nuevaDeclaracionViaje'))

WebUI.focus(findTestObject('Emision_Transporte_Endoso_AumentoSumaAsegurada/tr_transitoAereo'))

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/td_Transito areo_grdRiesgoTransporte_active_cell'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/input_Transito areo_SumaAseguradaTransportada'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - Transporte de Mercaderas/div_Fecha iniciokendo.syncReady(function()j_626703'))

WebUI.closeBrowser()

