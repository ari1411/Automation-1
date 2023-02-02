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

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

//WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))
WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/divTablaResultadosPropuestas'), 5)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Object Repository/page_Caucion_/Page_Consulta de movimientos/span_Modificar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Personas'))

numDoc = WebUI.getAttribute(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    'value')

if (numDoc == nDocTomador) {
    Apellido = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'), 'value')

    if (Apellido == ApellidoTomador) {
        Nombre = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre'), 'value')

        if (Nombre == NombreTomador) {
            'Solapa Asegurado'
            WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/input_Asegurado'))

            WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

            WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

            WebUI.delay(2)

            numDoc = WebUI.getAttribute(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
                'value')

            if (numDoc == nDocAsegurado) {
                Apellido = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'), 
                    'value')

                if (Apellido == ApellidoAsegurado) {
                    Nombre = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre'), 'value')

                    if (Nombre == NombreAsegurado) {
                        'Solapa Asegurado'
                        /*WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Propuesta'))

                        WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

                        WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)*/
                    }
                }
            }
        }
    }
}

WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    20, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
        ProductorPrincipal)
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: Los datos de Tomador y/o Asegurado, no coinciden con los del excel')
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/span_Productor principal_k-icon k-clear-value k-i-close'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent(VerificarTextoProductor, false)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Button_CerrarValidaciones'))

WebUI.delay(1)

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(findTestData('_Login').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/a_Consulta de movimientos'))

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

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/_grdConsultaMovimiento'), GlobalVariable.WaitForLoad)

nPoliza = WebUI.getText(findTestObject('Page_Consulta de movimientos/td_Poliza1'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '4')

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Modificacin de propuesta de Endoso - CAUCION - 244362/input_Pliza_txtPolizaOrigen'), 
    nPoliza)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/div_usoEspVacio'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

ProductorPrincipal = WebUI.getText(findTestObject('Page_Modificacin de propuesta de Endoso - CAUCION - 319738/label_ProductorPpal'))

if (ProductorPrincipal != '') {
    Utils.logInfo('El valor es el correcto')
} else {
    Utils.markErrorAndStop('El numero de documento no corresponde al que esta en el excel')
}

WebUI.click(findTestObject('Object Repository/page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

numDoc = WebUI.getText(findTestObject('Page_Modificacin de propuesta de Endoso - CAUCION - 319738/label_lblNumeroDocumento_3'))

print(numDoc)

print(nDocTomadorPoliza)
/*
if (numDoc == nDocTomadorPoliza) {
    'Solapa Asegurado'
    WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/input_Asegurado'))

    WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

    WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

    WebUI.delay(2)

    numDoc = WebUI.getText(findTestObject('Page_Modificacin de propuesta de Endoso - CAUCION - 319738/label_lblNumeroDocumento_2'))

    if (numDoc == nDocAseguradoPoliza) {
        WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Propuesta'))

        WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

        WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
    } else {
        Utils.markErrorAndStop('El numero de documento no corresponde al que esta en el excel')
    }
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('El numero de documento no corresponde al que esta en el excel')
}*/

WebUI.click(findTestObject('page_Caucion_/Page_Modificacin de propuesta de Pliza Nuev_e02143/li_Propuesta'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.navigateToUrl(findTestData('_Login').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/_Select_EstadoCotizacionId_listbox'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

//WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxProuestaIncompleta'))
//WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPolizaPrecondicion)
WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    20)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

// vamos a cambiar este bloque de condicionales por el siguiente codifo, para cumplir con la precondicion de la prueba
// cabe destacar que antes de la operacion refrescar, se insertó un numero de poliza de la prueba que es precondicion de esta
/*
if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults1'), '000000', FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults2'), '000000',
	FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta2'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults3'), '000000',
	FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta3'))
} else if (WebUI.verifyElementText(findTestObject('Emision_AP_ValidacionRefacturacion/span_numEndosoResults4'), '000000',
	FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta4'))
}
*/
WebUI.click(findTestObject('Page_Consulta de propuestas/span_Prosperar'))

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

WebUI.click(findTestObject('Page_Consulta de movimientos/button_Continuar_SelectSubRamo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ProsperarPropuesta_TierraDelFuego/li_emision'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
    'FormaPagoId_XmlValue', formaPagoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), NumeroTarjeta)
*/
MetPagoActual = WebUI.getText(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'))

//MetPagoActual = WebUI.getAttribute(findTestObject('Emision_AP_AltaPropuesta_Endoso/ComboFormaPagoXPath'), 'value')
if (MetPagoActual == 'CUPON') {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Emision_AP_AltaPropuesta_Endoso/comboFormaPago', 
        'FormaPagoId_XmlValue', FormaPagoId)

    WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), nTarjetaVisa)
}

if (MetPagoActual == 'VISA') {
    Utils.logInfo('Ya se encuentra cargada la forma de pago Visa')

    WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero Tarjeta_NumeroFormaPago'), nTarjetaVisa)
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

/*
WebUI.sendKeys(findTestObject('Page_Alta de Endoso - Accidentes personales/a_Calcular'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)
*/
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

String numPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/h3_Nmero de pliza 000010100183'))

numPoliza = (numPoliza - 'Número de póliza: ')

WebUI.click(findTestObject('Page_Alta de Endoso - ACCIDENTES PERSONALES - 583528/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Emision_AP_Poliza_AnulacionPorSaldo/input_poliza'), numPoliza)

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/opcionCheckboxTipoEndoso'))

WebUI.click(findTestObject('Emision_AP_AltaPropuesta_Anulacion/a_PanelColumnas'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/spanEstadoCotizacion'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/checkBoxPropuestaAceptada'))

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText('Emision_AP_AltaPropuesta_Anulacion/spanTipoEndosoResultados1', 'Cambio de forma de pago', FailureHandling.STOP_ON_FAILURE)

