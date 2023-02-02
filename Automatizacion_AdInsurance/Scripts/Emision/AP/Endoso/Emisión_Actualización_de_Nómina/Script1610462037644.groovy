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

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : false, ('Url') : findTestData(
            '_Login').getValue(1, 1), ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(
            3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(60)

if (SubRamoId > 0) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
        SubRamoId)

    WebUI.waitForJQueryLoad(60)
}

if (((nPoliza) as int) > 0) {
    WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), nPoliza)
}

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), '0')

String FechaInicioVigenciaFROM = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(VigenciaDesde, false)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Inicio vigencia desde_FechaInicioVigenciaFROM'), FechaInicioVigenciaFROM)

String FechaInicioVigenciaTO = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(VigenciaHasta, true)

WebUI.setText(findTestObject('Page_Consulta de movimientos/input_Inicio vigencia hasta_FechaInicioVigenciaTO'), FechaInicioVigenciaTO)

// WebUI.click(findTestObject('Page_Consulta de propuestas/span_Todos_k-select'))
WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Endoso_ActualizacionNomina/span_estadoCotizacion'))

WebUI.click(findTestObject('Page_Consulta de movimientos/input_Emitida 14_EstadoCotizacionId'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/span_Vigente_1'), 20)

if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_Vigente_1'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_Vigente_2'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_2'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_Vigente_3'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_3'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_Vigente_4'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_4'))
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de movimientos/span_Vigente_5'), 'Vigente', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_5'))
} else {
    Utils.markErrorAndStop('ERROR: No se encontró una póliza vigente entre las primeras 5 filas. En caso de necesitar verificar en más filas, avisar al desarrollador')
}

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Endosar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(30)

'20 en HS\r\n164 en Meridional??'
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Ver asegurados'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Emision_AP_PrecondicionAltaPolizasparaProrrogar/button_altaAsegurado'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Asegurado (Nuevo)/_TipoDocumentoAsegurado', 'TipoDocumentoAseguradoId', 
    TipoDocumentoAseguradoId)

WebUI.waitForJQueryLoad(30)

WebUI.setText(findTestObject('Page_Asegurado (Nuevo)/input_Nro. documento_NumeroDocumento'), DNI)

WebUI.focus(findTestObject('Page_Asegurado (Nuevo)/input_Ingreso a la nmina_FechaIngreso'))

WebUI.waitForJQueryLoad(30)

if (WebUI.getAttribute(findTestObject('Page_Asegurado (Nuevo)/input_Apellido_Apellido'), 'value', FailureHandling.OPTIONAL) == 
'') {
    Utils.markErrorAndStop('El DNI ingresado no es válido')
}

String apellidoAsegurado = WebUI.getAttribute(findTestObject('Page_Asegurado (Nuevo)/input_Apellido_Apellido'), 'value')

WebUI.setText(findTestObject('Page_Asegurado (Nuevo)/input_Ingreso a la nmina_FechaIngreso'), CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(
        IngresoCantDiasAntes, false))

WebUI.scrollToElement(findTestObject('Page_Asegurado (Nuevo)/div_Grupos de actividad definidos en el movimiento'), 5)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Asegurado (Nuevo)/_SelectTipoBeneficiario', 'TipoBeneficiario', 
    TipoBeneficiarioId)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Asegurado (Nuevo)/_SelectGruposActividadDefinidos', 
    'MovimientoActividadId', MovimientoActividadId)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Asegurado (Nuevo)/button_Guardar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

String cantAsegurados = '0'

if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido1'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion1'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion1'), 'Alta')

    cantAsegurados = '1'
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido2'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion2'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion2'), 'Alta')

    cantAsegurados = '2'
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido3'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion3'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion3'), 'Alta')

    cantAsegurados = '3'
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido4'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion4'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion4'), 'Alta')

    cantAsegurados = '4'
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido5'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion5'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion5'), 'Alta')

    cantAsegurados = '5'
} else {
    Utils.markErrorAndStop('ERROR: No se encontró el apellido entre las primeras 5 filas al asegurado agregado. En caso de necesitar verificar en más filas, avisar al desarrollador')
}

Utils.logInfo('La cantidad de asegurados actual es: ' + cantAsegurados)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/button_Cerrar'))

WebUI.focus(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas(2)_k-formatted-value k-input'))

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas_k-formatted-value k-input'), 
    cantAsegurados)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/label_Cantidad de vidas'))

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

String numeroPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numeroPoliza = (numeroPoliza - 'Número de póliza: ')

Utils.logInfo(numeroPoliza)

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/input_Tipo endoso id_chkTipoEndosoDescripcion'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Columnas'))

WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), numeroPoliza)

WebUI.clearText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Consulta de movimientos/span_Actualizacin de nmina'), 5)

if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Consulta de movimientos/span_Actualizacin de nmina'), 
    'Actualización de nómina', FailureHandling.OPTIONAL)) {
    String numeroEndoso = WebUI.getText(findTestObject('Object Repository/Page_Consulta de movimientos/span_00002'))

    int Endoso = ((numeroEndoso) as int)

    numeroEndoso = ((Endoso) as String)

    Utils.logInfo(numeroEndoso)

    if (numeroEndoso == '1') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_2'))
    } else if (numeroEndoso == '2') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_3'))
    } else if (numeroEndoso == '3') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_4'))
    } else if (numeroEndoso == '4') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_5'))
    } else if (numeroEndoso == '5') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_6'))
    } else if (numeroEndoso == '6') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_7'))
    } else if (numeroEndoso == '7') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_8'))
    } else if (numeroEndoso == '8') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_9'))
    } else if (numeroEndoso == '9') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_10'))
    } else if (numeroEndoso == '10') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_11'))
    } else if (numeroEndoso == '11') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_12'))
    } else if (numeroEndoso == '12') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_13'))
    } else if (numeroEndoso == '13') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_14'))
    } else if (numeroEndoso == '14') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_15'))
    } else if (numeroEndoso == '15') {
        WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_16'))
    } else {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: La cantidad de endosos es mayor a 15. Avisar al desarrollador para que permita validar mayor cantidad de endosos')
    }
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No se genero un nuevo endoso por la actualización de nómina')
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/span_Endosar'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboGrupoEndoso', 'cboGrupoEndoso', 
    GrupoEndosoId)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndoso', 'cboTipoEndoso', 
    TipoEndosoId)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Consulta de movimientos/_cboTipoEndosoCausa', 'cboTipoEndosoCausa', 
    TipoEndosoCausaId)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Consulta de movimientos/_ButtonContinuarSeleccionEndoso'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Ver asegurados'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_Consulta de asegurados/a_Fin de contrato_k-button k-button-icontex_f1d6f0'))

WebUI.click(findTestObject('Object Repository/Page_Consulta de asegurados/span_Eliminar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.setText(findTestObject('Object Repository/Page_Asegurado (Baja)/input_Egreso de la nmina_FechaEgreso'), CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(
        EgresoCantDiasDespues, true))

WebUI.click(findTestObject('Object Repository/Page_Asegurado (Baja)/label_KATALON20210202045204874'))

apellidoAsegurado = WebUI.getText(findTestObject('Object Repository/Page_Asegurado (Baja)/label_KATALON20210202045204874'))

WebUI.click(findTestObject('Object Repository/Page_Asegurado (Baja)/button_Eliminar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido1'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion1'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion1'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido2'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion2'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion2'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido3'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion3'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion3'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido4'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion4'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion4'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido5'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion5'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion5'), 'Baja')
} else {
    Utils.markErrorAndStop('ERROR: No se encontró el apellido entre las primeras 5 filas, al asegurado eliminado. En caso de necesitar verificar en más filas, avisar al desarrollador')
}

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/button_Cerrar'))

int numAsegurados = ((cantAsegurados) as int)

numAsegurados = (numAsegurados - 1)

cantAsegurados = ((numAsegurados) as String)

WebUI.focus(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas(2)_k-formatted-value k-input'))

WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/input_Cantidad de vidas_k-formatted-value k-input'), 
    cantAsegurados)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/label_Cantidad de vidas'))

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Emitir'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

numeroPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numeroPoliza = (numeroPoliza - 'Número de póliza: ')

Utils.logInfo(numeroPoliza)

WebUI.click(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.setText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Pliza_Poliza'), numeroPoliza)

WebUI.clearText(findTestObject('Object Repository/Page_Consulta de movimientos/input_Nmero endoso_NumeroEndoso'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Refrescar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Consulta de movimientos/span_Actualizacin de nmina'), 5)

if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Consulta de movimientos/span_Actualizacin de nmina'), 
    'Actualización de nómina', FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Consulta de movimientos/a_Moneda_1'))
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No se genero un nuevo endoso por la actualización de nómina')
}

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Consultar'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/li_Riesgos'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Ver asegurados'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido1'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion1'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion1'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido2'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion2'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion2'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido3'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion3'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion3'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido4'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion4'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion4'), 'Baja')
} else if (WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Apellido5'), apellidoAsegurado, FailureHandling.OPTIONAL)) {
    WebUI.scrollToElement(findTestObject('Page_Consulta de asegurados/td_Accion5'), 5)

    WebUI.verifyElementText(findTestObject('Page_Consulta de asegurados/td_Accion5'), 'Baja')
} else {
    Utils.markErrorAndStop('ERROR: No se encontró el apellido entre las primeras 5 filas, al asegurado eliminado. En caso de necesitar verificar en más filas, avisar al desarrollador')
}

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

Utils.markPassed('La prueba finalizó correctamente')

WebUI.closeBrowser()

