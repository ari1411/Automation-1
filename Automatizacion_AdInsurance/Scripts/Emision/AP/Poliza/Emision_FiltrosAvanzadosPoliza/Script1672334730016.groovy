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

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(1, 1), ('Usuario') : findTestData(
            '_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

// WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))
WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

fechaPropDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('0', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropDesde'), fechaPropDesde)

fechaPropHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('00', true)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropHasta'), fechaPropHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxFechaProp'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

def fechaPropDesdeDate = Date.parse('dd/MM/yyyy', fechaPropDesde)

def fechaPropHastaDate = Date.parse('dd/MM/yyyy', fechaPropHasta)

fechaProp1 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp1'))

fechaProp2 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp2'))

fechaProp3 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_fechaProp3'))

def fechaPropDate1 = Date.parse('dd/MM/yyyy', fechaProp1)

def fechaPropDate2 = Date.parse('dd/MM/yyyy', fechaProp2)

def fechaPropDate3 = Date.parse('dd/MM/yyyy', fechaProp3)

System.out.println(fechaPropDesdeDate)

System.out.println(fechaPropHastaDate)

System.out.println(fechaPropDate1)

System.out.println(fechaPropDate2)

System.out.println(fechaPropDate3)

if (fechaPropDate1 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (fechaPropDate2 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (fechaPropDate3 >= fechaPropDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (fechaPropHastaDate >= fechaPropDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropDesde'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_fechaPropHasta'))

inicioContratoDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('120', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_inicioContratoDesde'), inicioContratoDesde)

inicioContratoHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('0', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_inicioContratoHasta'), inicioContratoHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxInicioContrato'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

def inicioContratoDesdeDate = Date.parse('dd/MM/yyyy', inicioContratoDesde)

def inicioContratoHastaDate = Date.parse('dd/MM/yyyy', inicioContratoHasta)

inicioContrato1 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_inicioContratResults1'))

inicioContrato2 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_inicioContratResults2'))

inicioContrato3 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_inicioContratResults3'))

def inicioContratoDate1 = Date.parse('dd/MM/yyyy', inicioContrato1)

def inicioContratoDate2 = Date.parse('dd/MM/yyyy', inicioContrato2)

def inicioContratoDate3 = Date.parse('dd/MM/yyyy', inicioContrato3)

System.out.println(inicioContratoDesdeDate)

System.out.println(inicioContratoHastaDate)

System.out.println(inicioContratoDate1)

System.out.println(inicioContratoDate2)

System.out.println(inicioContratoDate3)

if (inicioContratoDate1 >= inicioContratoDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (inicioContratoHastaDate >= inicioContratoDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (inicioContratoDate2 >= inicioContratoDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (inicioContratoHastaDate >= inicioContratoDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (inicioContratoDate3 >= inicioContratoDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (inicioContratoHastaDate >= inicioContratoDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_inicioContratoDesde'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_inicioContratoHasta'))

finVigenciaDesde = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('0', false)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaDesde'), finVigenciaDesde)

finVigenciaHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'('180', true)

WebUI.setText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaHasta'), finVigenciaHasta)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

def finVigenciaDesdeDate = Date.parse('dd/MM/yyyy', finVigenciaDesde)

def finVigenciaHastaDate = Date.parse('dd/MM/yyyy', finVigenciaHasta)

finVigencia1 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults1'))

finVigencia2 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults2'))

finVigencia3 = WebUI.getText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_finVigenciaResults3'))

def finVigenciaDate1 = Date.parse('dd/MM/yyyy', finVigencia1)

def finVigenciaDate2 = Date.parse('dd/MM/yyyy', finVigencia2)

def finVigenciaDate3 = Date.parse('dd/MM/yyyy', finVigencia3)

if (finVigenciaDate1 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate1) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (finVigenciaDate2 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate2) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

if (finVigenciaDate3 >= finVigenciaDesdeDate) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('La fecha debe ser mayor o igual al limite configurado en filtros')
}

if (finVigenciaHastaDate >= finVigenciaDate3) {
    System.out.println('Todo bien')
} else {
    Utils.markErrorAndStop('No se puede superar la fecha especificada')
}

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaDesde'))

WebUI.clearText(findTestObject('Emision_FiltrosAvanzadosPoliza/input_finVigenciaHasta'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_tipoEmision'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkBoxManual'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxTipoEmision'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_tipoEmisionResults1'), 'Manual')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_tipoEmisionResults2'), 'Manual')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_tipoEmisionResults3'), 'Manual')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_tipoEmision'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/div_Todos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegocio'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxProrroga'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxProcesoNegocio'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults1'), 'Prórroga')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults2'), 'Prórroga')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegResults3'), 'Prórroga')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planComercial'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxBBVAAP_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxPlanComercial'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planComercialResults1'), 'BBVA AP+')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planComercialResults2'), 'BBVA AP+')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planComercialResults3'), 'BBVA AP+')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_procesoNegocio'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_procesoNegocioTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planComercial'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_planComercialTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_formaPago'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxCupon_li'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planCuotas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkbox1cuotaContado_li'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_vigenciaContrato'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxCuatrim2Prgas_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxFormaPago'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxPlanCuota'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_formaPagoResults1'), 'CUPON')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_formaPagoResults2'), 'CUPON')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_formaPagoResults3'), 'CUPON')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planCuotaResults1'), '1 Cuota-Contado')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planCuotaResults2'), '1 Cuota-Contado')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planCuotaResults3'), '1 Cuota-Contado')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_vigenciaContratoResults1'), 'Cuatrimestral (2 Prgas)')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_vigenciaContratoResults2'), 'Cuatrimestral (2 Prgas)')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_vigenciaContratoResults3'), 'Cuatrimestral (2 Prgas)')

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_formaPago'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_formaPagoTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_planCuotas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_planCuotasTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_vigenciaContrato'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/div_vigenciaContratoTodos'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidadOperativa'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxLaMeridional_li'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursal'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/checkboxCasaCentral_li'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/botonFiltrosAvanzados'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxUnidOperativa'))

WebUI.click(findTestObject('Emision_FiltrosAvanzadosPoliza/opcionCheckboxSucursal'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults1'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults2'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_unidOperativaResults3'), 'La Meridional')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults1'), 'Casa Central')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults2'), 'Casa Central')

WebUI.verifyElementText(findTestObject('Emision_FiltrosAvanzadosPoliza/span_sucursalResults3'), 'Casa Central')

