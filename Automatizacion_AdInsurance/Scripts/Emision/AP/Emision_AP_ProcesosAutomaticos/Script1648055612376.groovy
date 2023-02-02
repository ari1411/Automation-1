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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_SeleccionModulo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/li_General'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_/input_Usuario_Usuario'), usuario)

WebUI.setText(findTestObject('Object Repository/Page_/input_Contrasea_password'), clave)

WebUI.click(findTestObject('Object Repository/Page_/input_Contrasea_btn btn-primary btn-lg btn-_3dd7a4'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_procesosAutomáticos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.getText(findTestObject('Emision_AP_ProcesosAutomaticos/span_Activo')) != 'Todos') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_ProcesosAutomaticos/input_comboActivo', 
        'FilterActivo', filtroActivoId)

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

// WebUI.verifyElementPresent(findTestObject('Emision_AP_ProcesosAutomaticos/imagen_emisionProrrogasActivoSi'), 1)
url = WebUI.getUrl()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_emisionProrrogas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_instancias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementVisible(findTestObject('Emision_AP_ProcesosAutomaticos/td_condEstadoActivoNo'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_editarInstancia'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa8'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa7'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa6'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa5'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa4'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa3'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa2'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa1'))
	
	WebUI.focus(findTestObject('Emision_AP_ProcesosAutomaticos/div_munecaRusa0'))

    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/input_intervalo'))

    WebUI.sendKeys(findTestObject('Emision_AP_ProcesosAutomaticos/input_intervalo'), Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    /*
    WebUI.delay(1)

    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/div_ventanaEmergente'))

    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/div_ventanaModal'))

    CustomKeywords.'hs.controles.kendo.ClickByClass.clickElement'('Object Repository/Emision_AP_ProcesosAutomaticos/span_activo1.1', 
        'k-switch-container', 0)

    // ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript($("*[class='k-switch-handle']")[0].click())
    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
	*/
    /*
    WebUI.clickOffset(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'), 
        0, -100)

    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/input_activo'))
    */
    WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_opcionesAccidentesPersonales'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

String fechaDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDesdeOtra'(1, false, fechaFinVigenciaOrigen)

String fechaHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDesdeOtra'(1, true, fechaFinVigenciaOrigen)

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/i_Texto_far fa-edit'))

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/span_Fecha_k-widget k-textbox k-state-focused'))

WebUI.setText(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/input_Fecha_InstanciaValor'), 
    fechaDesde + ' 00:00:00')

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/i_Texto_fa fa-check'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/i_Fecha_far fa-edit'))

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/tr_214FechaHastaFecha hasta de la ventanaFe_d06e3a'))

WebUI.setText(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/input_Fecha_InstanciaValor'), 
    fechaHasta + ' 00:00:00')

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/i_Fecha_fa fa-check'))

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_Logs'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(180)

while (WebUI.getText(findTestObject('Emision_AP_ProcesosAutomaticos/td_descripcionGrillaLogs1')) != msgeFinProcesos2) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_refrescarProcesosAutomáticos'))

    WebUI.delay(30)
}

WebUI.delay(3)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_instancias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_editarInstancia'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(2)

//WebUI.click(findTestObject('Page_Proceso automtico EmisionProrrogas/label_Activo'))
WebUI.clickOffset(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'), 
    -135, -325)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.navigateToUrl(consultaMovimientos)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza1)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.clearText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'))

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza2)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado, 
    FailureHandling.STOP_ON_FAILURE)

