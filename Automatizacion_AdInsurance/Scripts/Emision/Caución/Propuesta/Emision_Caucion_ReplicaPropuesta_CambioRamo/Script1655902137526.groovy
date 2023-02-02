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

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacionPre)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_CotizacionId'), GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Replicar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_CboRamo', 
    'cboRamo', NuevoRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_CboSubramo', 
    'cboSubramo', NuevoSubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_Caucion_ReplicaPropuesta_RamoInactivo/button_continuarReplica'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '1')

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo', 
    'cboSubRamoId', '2')

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

String FechaFinVigencia = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(DiasFechaFinVigencia, true //15 dias despues
    )

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Fecha de fin de vigencia_FechaFinVige_96944a'), 
    FechaFinVigencia)

WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion10'), 
    GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor10'))

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_FechaNacimiento'), ValorPropuesta_FechaNac)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor13'))

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Autos/input_Actividad'), ValorPropuesta_ActAP)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion13'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor14'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElementByName'('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_AmbitoCobertura', 
    'AmbitoCobertura', ValorPropuesta_AmbitoCobertura)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion14'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    ProductorPrincipal)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/span_Productor principal_k-icon k-clear-value k-i-close'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyTextPresent(VerificarTextoProductor, false)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Button_CerrarValidaciones'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    ProductorPrincipal)

WebUI.delay(2)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.sendKeys(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Autos/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

Apellido = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'), 'value')

print(Apellido)

if (Apellido == ApellidoTomador) {
    Nombre = WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre'), 'value')

    print(Nombre)

    if (Nombre == NombreTomador) {
        WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/li_Validaciones'))
    }
}

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/textarea_Bitcora_txtNuevaBitacora'), 
    TextoBitacora)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/a_Bitcora_lnkNuevaBitacora'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/textarea_Bitcora_txtNuevaBitacora'), 
    TextoBitacora)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/a_Bitcora_lnkNuevaBitacora'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/textarea_Bitcora_txtNuevaBitacora'), 
    TextoBitacora)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/a_Bitcora_lnkNuevaBitacora'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Guardar_lnkGuardarAcciones'))

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/button_Aceptar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - ACC_18c2ab/h4_Estado de movimiento Propuesta incompleta'), 
    EstadoMovimiento)

nCotizacion = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de cotizacin 106516'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nCotizacion)

nPropuesta = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de propuesta 934'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nPropuesta)

nCotizacion = (nCotizacion - 'Número de cotización: ')

Utils.logInfo(nCotizacion)

nPropuesta = (nPropuesta - 'Número de propuesta: ')

Utils.logInfo(nPropuesta)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emis_Cau_ReplicaProp_CambioRamo', 1, 14)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPropuesta, 'Emis_Cau_ReplicaProp_CambioRamo', 1, 15)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : true, ('Url') : findTestData(
            '_Login').getValue(5, 1), ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(
            3, 1), ('VerificarNombreModulo') : true, ('NombreModulo') : 'General'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - General/a_Numeradores'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Numerador/input_Nombre_FilterNombre'), FiltroNombreNumerador)

WebUI.setText(findTestObject('Page_Numerador/input_Observacin_FilterObservacion'), FiltroObservacionNumerador)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Numerador/a_k-grid-Editar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Numerador (Modificacin)/li_Valores'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Numerador (Modificacin)/input_Valor_ValorFiltro'), nPropuesta)

WebUI.click(findTestObject('Page_Numerador (Modificacin)/span_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.verifyElementText(findTestObject('Page_Numerador (Modificacin)/td_S'), 'Sí')

WebUI.delay(1)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.clearText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Consulta de propuestas/input_Cotizacin_k-formatted-value k-input'))

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Cotizacin_CotizacionId'), nCotizacion)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_Ramo', 
    'RamoId', NuevoRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Consulta de propuestas/_Cbo_SubRamo', 
    'SubramoId', NuevoSubRamoId)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuestaAceptada_GuardarEmitida/botonRefrescar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.scrollToElement(findTestObject('Page_Consulta de movimientos/td_CotizacionId'), GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Emision_AP_ModificacionPropuesta_PolizaNueva/menuPropuesta1'))

WebUI.click(findTestObject('Page_Consulta de propuestas/span_Consultar'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(ProductorPrincipal, false)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/li_Personas'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(ApellidoTomador, false)

WebUI.verifyTextPresent(NombreTomador, false)

WebUI.click(findTestObject('Page_Alta de propuesta de Pliza Nueva - Accidentes personales/li_Validaciones'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyTextPresent(TextoBitacora, false)

WebUI.closeBrowser()

