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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Consulta de propuestas'))

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

WebUI.click(findTestObject('Emision_Caucion_PropuestaIncompleta_SinDatos/span_nuevaPropuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

String FechaFinVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(DiasFechaFinVigencia, true)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
    FechaFinVigencia)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), prodPrinc)

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSucursal', 
    'SucursalId_XmlValue', sucursal)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_PropuestaIncompleta_CompletandoDatos/input_centroAtencion', 
    'CentroAtencionId_XmlValue', centroAtencion)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    ValorPropuesta_nPolizaRenovadaSISE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    ValorPropuesta_CodAseg)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    ValorPropuesta_NombreAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    ValorPropuesta_ApellidoAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_inputTipoDocumento', 
    'TipoDocumento', ValorPropuesta_TipoDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor08'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nro. Documento_NroDocumento'), 
    ValorPropuesta_nDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion08'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor09'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Direccin_Direccion'), 
    ValorPropuesta_Direccion)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor10'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_input_Sexo', 
    'Sexo', ValorPropuesta_Sexo)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor11'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Telfono_Telefono'), 
    ValorPropuesta_Tel)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion11'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor12'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Mail para poliza electronica_PolizaElectronica'), 
    ValorPropuesta_Mail)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion12'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), 
    GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Prima Informada por el productor_PrimaInformada'), 
    ValorPropuesta_PrimaInformada)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor16'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Poliza SISE_NroPolizaSise'), 
    ValorPropuesta_nPolizaSISE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor17'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/textarea_Observaciones_Observaciones'), 
    ValorPropuesta_Obs)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion17'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor19'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboEquipoTecnico', 
    'EQUIPO', ValorPropuesta_EqTec)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion19'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor21'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RiType_RiType'), ValorPropuesta_RiType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion21'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor22'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MML_MML'), ValorPropuesta_MML)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion22'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_CiaReferida', 
    'CiaReferida', ValorPropuesta_CiaReferida)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion24'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor25'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MARS_MARS'), ValorPropuesta_MARS)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion25'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor26'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MethodofPayment_MethodofPayment'), 
    ValorPropuesta_MetodPayment)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion26'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor27'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RI Type_RIType'), ValorPropuesta_RIType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion27'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor28'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_TreatyCode_TreatyCode'), 
    ValorPropuesta_TreatyCode)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion28'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor29'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AgencyCommissionRate_AgencyCommissionRate'), 
    ValorPropuesta_AgencyComRate)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion29'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/li_validaciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ModificarPropuestaManualmente_EquipoDistribucion/input_comboEquipoDistribucion', 
    'EquipoDistribucionId_XmlValue', equipoDistribucionId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_Caucion_ModificarPropuestaManualmente_EquipoDistribucion/input_comboUsuarioDistribucion', 
    'UsuarioDistribucionId_XmlValue', usuarioDistribucionId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion_ReasignacionMedianteRegla/h4_equipoDistribucion'), 
    equipoDistribucion)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_ModifPropMan_EqDis', 1, 31)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Emision_AP_MonitorDistribucion/a_GestionMonitorDistribucion'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_Caucion_ModificarPropuestaManualmente_EquipoDistribucion/input_checkboxEquipoSuscriptoresCaucion'), 
    1)

WebUI.click(findTestObject('Emision_Caucion_ModificarPropuestaManualmente_EquipoDistribucion/input_checkboxEquipoSuscriptoresCaucion'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_MonitorDistribucion/spanEquipoDistribucion1'), equipoDistrib)

WebUI.verifyElementText(findTestObject('Emision_Caucion_ModificarPropuestaManualmente_EquipoDistribucion/span_numeroCotizacionResults1'), numCotizacion)

