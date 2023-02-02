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

WebUI.callTestCase(findTestCase('Emision/Caución/Propuesta/Emision_Caucion_PropuestaIncompleta_CompletandoDatos'), [('RamoId') : findTestData(
            'Emision_Caucion_PropuestaIncompleta_SinDatos').getValue(1, 1), ('SubRamoId') : findTestData('Emision_Caucion_PropuestaIncompleta_SinDatos').getValue(
            2, 1), ('ValorPropuesta_ApellidoAseg') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            10, 1), ('prodPrinc') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(3, 1), ('sucursal') : findTestData(
            'Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(4, 1), ('centroAtencion') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            5, 1), ('DiasFechaFinVigencia') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            6, 1), ('ValorPropuesta_nPolizaRenovadaSISE') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            7, 1), ('ValorPropuesta_CodAseg') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            8, 1), ('ValorPropuesta_NombreAseg') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            9, 1), ('ValorPropuesta_TipoDoc') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            11, 1), ('ValorPropuesta_nDoc') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            12, 1), ('ValorPropuesta_Direccion') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            13, 1), ('ValorPropuesta_FechaNac') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            14, 1), ('ValorPropuesta_Sexo') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            15, 1), ('ValorPropuesta_Tel') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            16, 1), ('ValorPropuesta_Mail') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            17, 1), ('ValorPropuesta_PrimaInformada') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            18, 1), ('ValorPropuesta_nPolizaSISE') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            19, 1), ('ValorPropuesta_Obs') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            20, 1), ('ValorPropuesta_RiType') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            21, 1), ('ValorPropuesta_MML') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            22, 1), ('ValorPropuesta_CiaReferida') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            23, 1), ('ValorPropuesta_MARS') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            24, 1), ('ValorPropuesta_MetodPayment') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            25, 1), ('ValorPropuesta_RIType') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            26, 1), ('ValorPropuesta_TreatyCode') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            27, 1), ('ValorPropuesta_AgencyComRate') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(
            28, 1), ('TipoDocumento') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(29, 
            1), ('nDocTomador') : findTestData('Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(30, 1), ('nDocAsegurado') : findTestData(
            'Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(31, 1), ('estadoMovimiento') : findTestData(
            'Emision_Caucion_PropuestaIncompleta_CompletandoDatos').getValue(32, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Modificar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), prodPrinc)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Emision_AP_AltaPropuesta_Anulacion/inputProductorPrincipal'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/_button_GuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento)

numCotizacion = WebUI.getText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h3NumeroCotizacion'))

numCotizacion = (numCotizacion - 'Número de cotización: ')

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(numCotizacion, 'Emision_Cauc_ModifPropIncomplet', 1, 3)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('variables.xls')

Utils.logInfo(numCotizacion)

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), numCotizacion)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'), 1)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Modificar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

hoy_mas3 = CustomKeywords.'hs.utils.GetDate.GetFechaActualDMA_H0_mas3'()

String FechaFinVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(DiasFechaFinVigencia, true)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
    FechaFinVigencia)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Pliza RENOVADA SISE ()_NumerodePolizaRENOVADASISE'), 
    ValorPropuesta_nPolizaRenovadaSISE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Cdigo Asegurado_CodigoAsegurado'), 
    ValorPropuesta_CodAseg)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nombre_AseguradoNombre'), 
    ValorPropuesta_NombreAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Apellido_AseguradoApellido'), 
    ValorPropuesta_ApellidoAseg)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_inputTipoDocumento', 
    'TipoDocumento', ValorPropuesta_TipoDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor08'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nro. Documento_NroDocumento'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion08'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor08'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Nro. Documento_NroDocumento'), 
    ValorPropuesta_nDoc)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion08'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor09'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Direccin_Direccion'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion09'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor09'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Direccin_Direccion'), 
    ValorPropuesta_Direccion)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor10'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/_input_Sexo', 
    'Sexo', ValorPropuesta_Sexo)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor11'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Telfono_Telefono'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion11'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor11'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Asegurado Telfono_Telefono'), 
    ValorPropuesta_Tel)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion11'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor12'))

WebUI.clearText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Mail para poliza electronica_PolizaElectronica'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion12'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor12'))

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Mail para poliza electronica_PolizaElectronica'), 
    ValorPropuesta_Mail)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion12'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Prima Informada por el productor_PrimaInformada'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Prima Informada por el productor_PrimaInformada'), 
    ValorPropuesta_PrimaInformada)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor16'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Poliza SISE_NroPolizaSise'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor16'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Numero de Poliza SISE_NroPolizaSise'), 
    ValorPropuesta_nPolizaSISE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion16'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor17'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/textarea_Observaciones_Observaciones'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion17'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor17'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/textarea_Observaciones_Observaciones'), 
    ValorPropuesta_Obs)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion17'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion19'), 
    1)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor20'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RiType_RiType'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion20'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor20'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RiType_RiType'), ValorPropuesta_RiType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor21'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MML_MML'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion21'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor21'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MML_MML'), ValorPropuesta_MML)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion21'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor23'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_CiaReferida', 
    'CiaReferida', ValorPropuesta_CiaReferida)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion23'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MARS_MARS'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion24'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor24'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MARS_MARS'), ValorPropuesta_MARS)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion24'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor25'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MethodofPayment_MethodofPayment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion25'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor25'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_MethodofPayment_MethodofPayment'), 
    ValorPropuesta_MetodPayment)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion25'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor26'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RI Type_RIType'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion26'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor26'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_RI Type_RIType'), ValorPropuesta_RIType)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion26'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor27'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_TreatyCode_TreatyCode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion27'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor27'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_TreatyCode_TreatyCode'), 
    ValorPropuesta_TreatyCode)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion27'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor28'))

WebUI.clearText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AgencyCommissionRate_AgencyCommissionRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion28'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor28'))

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AgencyCommissionRate_AgencyCommissionRate'), 
    ValorPropuesta_AgencyComRate)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion28'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96', 
    'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocTomador)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - CAUCION/input_Asegurado'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/div_Tipo de documento  Codigo Unico de Iden_37db96', 
    'TipoDocumentoId_XmlValue', TipoDocumento)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    nDocAsegurado)

WebUI.click(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonAceptarGuardarMovimiento'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/h4EstadoMovimiento'), estadoMovimiento2)

