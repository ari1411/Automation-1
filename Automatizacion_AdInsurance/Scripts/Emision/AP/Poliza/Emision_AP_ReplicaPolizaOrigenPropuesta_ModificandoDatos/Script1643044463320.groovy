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

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotPrecond)

// WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), numEndosoDeseado)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

// WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'), '18/01/2022 00:00')

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

/*
if ((WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados1')) != 
numPropuestaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados1')) != 
numPolizaNulo)) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados1'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if ((WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados2')) != 
numPropuestaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados2')) != 
numPolizaNulo)) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados2'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if ((WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados3')) != 
numPropuestaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados3')) != 
numPolizaNulo)) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados3'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if ((WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados4')) != 
numPropuestaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados4')) != 
numPolizaNulo)) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados4'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
} else if ((WebUI.getText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_SinModificarDatos/span_numeroPropuestaResultados5')) != 
numPropuestaNulo) && (WebUI.getText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/spanNumPolizaResultados5')) != 
numPolizaNulo)) {
    numPolizaOriginal = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/spanNumPolizaResultados5'))

    WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta5'))
}
*/

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/botonReplicarPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPolizaPrecond, 'Emi_AP_RepPolOrProp_ModifDatos', 1, 10)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')
*/

/*WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/buttonContinuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/comboFormaPago', 
    'FormaPagoId_XmlValue', formaPago)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), numeroTarjeta)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

dniTomadorOriginal = WebUI.getAttribute(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    'value')

//apellidoTomadorOriginal = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputApellidoRazonSocial'), 'value')
//apellidoTomadorOriginal = (apellidoTomadorOriginal - ' ')
WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    dniTomadorNuevo)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/a_Ver asegurados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowTitle('Consulta de asegurados')

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/menuDatosAsegurado'))

if (WebUI.verifyElementPresent(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/li_modificarAsegurado'))
} else if (WebUI.verifyElementPresent(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_ModificarAsegurado'))
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

apellidoAseguradoOriginal = WebUI.getAttribute(findTestObject('Page_Asegurado (Nuevo)/input_Apellido_Apellido'), 'value')

dniAseguradoOriginal = WebUI.getAttribute(findTestObject('Page_Asegurado (Nuevo)/input_Nro. documento_NumeroDocumento'), 
    'value')

WebUI.setText(findTestObject('Page_Asegurado (Nuevo)/input_Nro. documento_NumeroDocumento'), dniAseguradoNuevo)

WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/div_clickAfuera'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*if (dniAseguradoOriginal != dniAseguradoNuevo) {
    !(WebUI.verifyElementText(findTestObject('Page_Asegurado (Nuevo)/input_Apellido_Apellido'), apellidoAseguradoOriginal //es probable que esto no pase, ya que tal vez no se actualice el value de este campo
        ))
}*/
WebUI.click(findTestObject('Page_Asegurado (Nuevo)/button_Guardar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.closeWindowTitle('Consulta de asegurados')

WebUI.switchToWindowIndex(0)

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

numPolizaNuevo = WebUI.getText(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPolizaNuevo = (numPolizaNuevo - 'Número de póliza: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numPolizaNuevo, 'Emi_AP_RepPolOrProp_ModifDatos', 1, 11)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numPolizaNuevo)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(3)

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

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), numEndosoDeseado)

WebUI.setText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/inputNumPoliza'), numPolPrecond)

WebUI.clearText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/labelNumeroDocumentoTomador'), dniTomadorOriginal)

//WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_Prorroga/labelNumeroDocumentoTomador'), apellidoTomadorOriginal)
WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/a_Ver asegurados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowTitle('Consulta de asegurados')

WebUI.verifyElementText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/td_apellidoAsegurado'), 
    apellidoAseguradoOriginal)

WebUI.verifyElementText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/td_dniAsegurado'), dniAseguradoOriginal)

WebUI.closeWindowTitle('Consulta de asegurados')

WebUI.switchToWindowIndex(0)

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

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/inputNumeroEndoso'), numEndosoDeseado)

WebUI.setText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/inputNumPoliza'), numPolizaNuevo)

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/li_consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/labelNumeroDocumentoTomador'), dniTomadorNuevo)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/a_Ver asegurados'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.switchToWindowTitle('Consulta de asegurados')

/*WebUI.verifyElementText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/td_apellidoAsegurado'),
	apellidoAseguradoNuevo)*/
WebUI.verifyElementText(findTestObject('Emision_AP_ReplicaPolizaOrigenPropuesta_ModificandoDatos/td_dniAsegurado'), dniAseguradoNuevo)

