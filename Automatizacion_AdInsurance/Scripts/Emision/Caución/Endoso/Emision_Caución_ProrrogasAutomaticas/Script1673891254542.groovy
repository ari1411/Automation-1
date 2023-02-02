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

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(5, 1), ('VerificarNombreModulo') : false
        , ('NombreModulo') : 'General'], FailureHandling.STOP_ON_FAILURE)

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

WebUI.setText(findTestObject('Page_Numerador/input_Nombre_FilterNombre'), 'EmisionProrrogas')

WebUI.click(findTestObject('Emision_Caucion_ABMProducto_Base/a_refrescar'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/input_Ver_detalle_1'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_instancias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

while (WebUI.verifyElementVisible(findTestObject('Emision_AP_ProcesosAutomaticos/td_condEstadoActivoNo_3'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_editarInstancia_3'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.executeJavaScript('window.open();', [])

    WebUI.switchToWindowIndex(1)

    WebUI.navigateToUrl('https://www.google.com/search?q=ACTIVA+el+proceso+automatico')

    WebUI.delay(2)

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.delay(1)

    //WebUI.click(findTestObject('Page_Proceso automtico EmisionProrrogas/label_Activo'))
    WebUI.clickOffset(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'), 
        -135, -325, FailureHandling.OPTIONAL)

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_Logs'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(180)

WebUI.setText(findTestObject('Emision_AP_ProcesosAutomaticos/input_FilterDescripcion_Log'), TxtFiltro_Log)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_refrescarProcesosAutomáticos'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

while (!(WebUI.verifyTextPresent(Msj_GeneraPoliza1, false, FailureHandling.OPTIONAL))) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_refrescarProcesosAutomáticos'))

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.delay(2)
}

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

PolizaGenerada = WebUI.getText(findTestObject('Emision_AP_ProcesosAutomaticos/td_DescripcionGrillaLogs_1'))

PolizaGenerada = (PolizaGenerada - Msj_GeneraPoliza1)

PolizaGenerada = (PolizaGenerada - Msj_GeneraPoliza2)

Utils.logInfo(PolizaGenerada)

WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/li_instancias'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

while (WebUI.verifyElementVisible(findTestObject('Emision_AP_ProcesosAutomaticos/td_condEstadoActivoSi_3'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ProcesosAutomaticos/a_editarInstancia_3'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.executeJavaScript('window.open();', [])

    WebUI.switchToWindowIndex(1)

    WebUI.navigateToUrl('https://www.google.com/search?q=DESACTIVA+el+proceso+automatico')

    WebUI.delay(2)

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.delay(1)

    //WebUI.click(findTestObject('Page_Proceso automtico EmisionProrrogas/label_Activo'))
    WebUI.clickOffset(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'), 
        -135, -325, FailureHandling.OPTIONAL)

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Emision_AP_ProcesosAutomaticos/Page_Proceso automtico EmisionProrrogas/button_Grabar'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
}

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : true, ('VerificarNombreModulo') : true], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), PolizaGenerada)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), tipoEndosoDeseado, 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

