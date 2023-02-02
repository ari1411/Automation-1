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

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

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

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPolizaPrevio)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), "0")

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados1')) != campoNulo)) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados2')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados3')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados4')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados5')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados6')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados6')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados7')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados7')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados8')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados8')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados9')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados9')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))
} else if ((WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados10')) != campoNulo) && (WebUI.getText(
    findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados10')) != campoNulo)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))
} else {
    Utils.logInfo(msgeErrorFaltaPropuestas2)
}*/

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/botonReplicarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

//*[@id='loaderBaseAbm' and @style='display: none;']
WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Prorroga/spanEstadoEmisionPoliza'), 'Estado: Presupuestada')

/*WebUI.click(findTestObject('Emision_AP_RevisionSelladoUSD/li_calculo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoCotizacion'), estadoCotizacion)

