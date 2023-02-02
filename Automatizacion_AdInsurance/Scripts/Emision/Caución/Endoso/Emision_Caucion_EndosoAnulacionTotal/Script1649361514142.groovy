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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

/*WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/

if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza1')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza2')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza3')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza4')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza5')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza6')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta6'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza7')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta7'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza8')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta8'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza9')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta9'))
} else if (WebUI.getText(findTestObject('Emision_AP_Poliza_Rehabilitacion/span_EstadoPoliza10')) != estadoPolizaIndeseado) {
    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta10'))
} else {
    Utils.logInfo(msgeError)
}

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Anular'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

'20 en HS\r\n164 en Meridional??'
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonEmitir'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

numPolizaNuevo = WebUI.getText(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPolizaNuevo = (numPolizaNuevo - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emi_Cau_EndAnulTotal', 1, 5)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPolizaNuevo, 'Emi_Cau_EndAnulTotal', 1, 6)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numPolizaNuevo)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), numPolizaNuevo)

WebUI.clearText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), 5)

WebUI.verifyElementText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1'), 'Anulacion total por error de emision')

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_1'), 5)

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoResumenDescripcion_1'), 'Anulada')

WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_EstadoPolizaDescripcion_1'), 'Anulada')

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()