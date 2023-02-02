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

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_ConsultaMovimiento/a_consulta de movimientos'))

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

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/* Queremos que el movimiento tenga un numero de poliza para setearlo en la propuesta que venimos trabajando
 Ademas no queremos que el estado de poliza sea "Anulada" para evitar el error "no es posible emitir una poliza nueva o prórroga con
prima o premio inferior a igual a cero" */
if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados1')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados1')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados2')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados2')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados3')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados3')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados4')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados4')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados5')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados5')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados6')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados6')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados7')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados7')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados8')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados8')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados9')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados9')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))
} else if ((WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados10')) !=
numPolizaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanEstadoPolizaResultados10')) !=
estadoPolizaIndeseado)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))
} else {
	Utils.logInfo(msgeErrorFaltaPropuestas2)
}

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/botonReplicarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

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

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), 1)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso/a_Emitir'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
