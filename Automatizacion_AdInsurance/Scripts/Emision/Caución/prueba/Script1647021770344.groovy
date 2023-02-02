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

WebUI.openBrowser('http://adinsuranceqa.ddns.net/AdInsurance/Emision/Gestion/Movimiento/AccionMovimiento?dt=bjNIMm%252BD9GPcH2cEKL5obqTCEad8Mf7b%252BD8f3TBPUhk3LT4ClAJm%252FWb2nUbuT%252BK4lYPMwl1ZUZNWHGciuB90%252FptOlB6tQhc6a62oASPWOoWBZrGCBbUsvae8ttwvbyBx4PUD2J77T3OGO3mjqJTBTlr0x7Z%252BPxJd%252BbnfuE3aHeK4U%252Futied0Vixhg2xTFjOaCROR1aNM3ftR2QmDFfSe%252F79HRQsiwxMslhXMnbVEfsIUwMr2JoGxmpE16AjivpN%252F%252FozSgGXMluUcskSTQAlC9rOAX2WTDefae5TUMCI2hqy1NivGqQ9am6wISkyXRa6pG57oXkFX6Mo5xSJGIcCCuvzi2Ihz23hBBAZSzjEEX8Dv2qW7Uvh3mO1qfb1J%252F4LT')

WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), 'clave')

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    '6092021')

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    '6092021')

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    'Lali')

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    'Esposito')

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), FailureHandling.STOP_ON_FAILURE)

