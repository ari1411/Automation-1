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
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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

WebUI.callTestCase(findTestCase('Varios/Login'), [('Url') : findTestData('_Login').getValue(5, 1), ('VerificarNombreModulo') : false], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - General/a_Personas'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(30)

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('http://www0.unsl.edu.ar/~jolguin/cuit.php?tipo=Sociedades&dni=&cuit=&Calcula=Calcula')

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('CalculoDeCUIT/input_DNI'), NumDoc)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('CalculoDeCUIT/input_Calcular'))

WebUI.waitForJQueryLoad(20)

CUIT = WebUI.getAttribute(findTestObject('CalculoDeCUIT/input_CUIT_CUIL'), 'value')

WebUI.waitForJQueryLoad(20)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

CUIT = CustomKeywords.'hs.utils.AltaPersona.removeHyphensForCuit'(CUIT)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Personas/_SelectTipoDocumento', 'FilterTipoDocumentoId', 
    TipoDocumentoId)

WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), CUIT)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(30)

if (!(WebUI.verifyElementNotPresent(findTestObject('Page_Personas/a_Persona_k-button Modificar'), 2, FailureHandling.OPTIONAL))) {
    Utils.markWarning('ERROR: El número de documento ingresado para crear una nueva persona, ya existe.')

    while (!(WebUI.verifyElementNotPresent(findTestObject('Page_Personas/a_Persona_k-button Modificar'), 2, FailureHandling.OPTIONAL))) {
        NumDoc = CustomKeywords.'hs.utils.AltaPersona.getNewDni'(NumDoc)

        WebUI.executeJavaScript('window.open();', [])

        WebUI.switchToWindowIndex(1)

        WebUI.navigateToUrl('http://www0.unsl.edu.ar/~jolguin/cuit.php?tipo=Sociedades&dni=&cuit=&Calcula=Calcula')

        WebUI.waitForJQueryLoad(20)

        WebUI.setText(findTestObject('CalculoDeCUIT/input_DNI'), NumDoc)

        WebUI.waitForJQueryLoad(20)

        WebUI.click(findTestObject('CalculoDeCUIT/input_Calcular'))

        WebUI.waitForJQueryLoad(20)

        CUIT = WebUI.getAttribute(findTestObject('CalculoDeCUIT/input_CUIT_CUIL'), 'value')

        WebUI.waitForJQueryLoad(20)

        WebUI.closeWindowIndex(1)

        WebUI.switchToWindowIndex(0)

        CUIT = CustomKeywords.'hs.utils.AltaPersona.removeHyphensForCuit'(CUIT)

        WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), CUIT)

        WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

        WebUI.waitForPageLoad(20)

        WebUI.waitForJQueryLoad(30)
    }
}

WebUI.click(findTestObject('Page_Personas/a_Nuevo'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectEmpresa', 'EmpresaId', EmpresaId)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectTipoPersona', 'TipoPersonaId', TipoPersonaId)

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Persona/_ActionNuevoDocumento'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectTipoDocumento', 'tipoDocumento', 
    TipoDocumentoId)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/input_Nmero de Documento_numeroDocumento'), CUIT)

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Persona/_ButtonGuardarDocumento'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (RazonSocial == 'Katalon') {
    RazonSocial = CustomKeywords.'hs.utils.AltaPersona.addDateTime'('Katalon')
}

WebUI.setText(findTestObject('Page_Persona/input_Apellido_ApellidoRazonSocial'), RazonSocial)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectNacionalidad', 'NacionalidadId', 
    RadicacionId)

WebUI.scrollToElement(findTestObject('Page_Persona/div_Condicin IVA'), 10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectCondicionIVA', 'CondicionIVAId', 
    CondicionIvaId)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/Input_Ocupacion-Actividad'), Ocupacion_Actividad)

WebUI.waitForJQueryLoad(20)

WebUI.sendKeys(findTestObject('Page_Persona/Input_Ocupacion-Actividad'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Persona/li_Personas Relacionadas'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionNuevaPersonaRelacionada'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/Span_Select_PersonasRelacionadas'))

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/input_Persona_Relacionada'), PersonaRelacionada)

WebUI.waitForJQueryLoad(20)

WebUI.sendKeys(findTestObject('Page_Persona/input_Persona_Relacionada'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Page_Persona/input_Persona_Relacionada'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/input_RelPers_PorcentajeParticipacion1'))

WebUI.sendKeys(findTestObject('Page_Persona/input_RelPers_PorcentajeParticipacion2'), PorcentajeParticipacionPersRel)

WebUI.click(findTestObject('Page_Persona/span_Personas Relacionadas'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionGuardarRelacionPersona'))

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Persona/li_Domicilio'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionNuevoDomicilio'))

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectTipoDomicilio', 'tipoDomicilioList', 
    TipoDomicilioId)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectPaisDomicilio', 'paisDomicilioId', 
    PaisDomicilioId)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectProvinciaDomicilio', 'provinciaDomicilioId', 
    ProvinciaDomicilioId)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/input_Localidad_cmbLocalidad_input'), LocalidadDomicilio)

WebUI.delay(1)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_SelectFiltroLocalidadDomicilio'))

WebUI.setText(findTestObject('Page_Persona/input_Calle_calleDomicilio'), Calle)

WebUI.setText(findTestObject('Page_Persona/input_Altura_alturaDomicilio'), Altura)

WebUI.click(findTestObject('Page_Persona/_ButtonGuardarDomicilio'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/li_Contacto'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionNuevoContacto'))

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Persona/_SelectTipoContacto', 
    'TipoContactoId', TipoContactoId)

Valor_TipoContacto = (RazonSocial + '@gmail.com')

WebUI.setText(findTestObject('Page_Persona/input_ValorEmail'), Valor_TipoContacto)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionGuardarContacto'))

WebUI.waitForJQueryLoad(20)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Persona/li_Condicin IIBB'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionNuevaCondIIBB'))

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectProvinciaCondicionIIBB', 'ProvinciaId', 
    ProvinciaCondIIBBId)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectCondIIBB', 'CondicionIIBBId', CondicionIIBBId)

WebUI.click(findTestObject('Page_Persona/a_Condicin Ingresos Brutos_abutton'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/li_Exclusin Impuesto'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ActionNuevaExclusion'))

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Persona/_SelectImpuestoId', 'ImpuestoId', 
    ImpuestoId)

VigenciaDesdeImp = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(VigenciaDesdeImp, true)

VigenciaHastaImp = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(VigenciaHastaImp, true)

WebUI.setText(findTestObject('Page_Persona/input_VigenciaDesde'), VigenciaDesdeImp)

WebUI.setText(findTestObject('Page_Persona/input_VigenciaHasta'), VigenciaHastaImp)

WebUI.setText(findTestObject('Page_Persona/input_ExclusionProvincia'), ExclusionProvincia)

WebUI.waitForJQueryLoad(20)

WebUI.sendKeys(findTestObject('Page_Persona/input_ExclusionProvincia'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/input_Ramo'), RamoExclusion)

WebUI.waitForJQueryLoad(20)

WebUI.sendKeys(findTestObject('Page_Persona/input_Ramo'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Persona/input_Orden1'))

WebUI.sendKeys(findTestObject('Page_Persona/input_Orden2'), Orden)

WebUI.click(findTestObject('Page_Persona/input_PorcentajeExclusion1'))

WebUI.sendKeys(findTestObject('Page_Persona/input_PorcentajeExclusion2'), PorcentajeExclusion)

WebUI.click(findTestObject('Page_Persona/_ButtonAgregarExclusion'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Persona/li_Adjuntos'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ButtonAgregarAdjuntos'))

WebUI.waitForJQueryLoad(20)

WebUI.uploadFile(findTestObject('Page_Persona/_ButtonAgregarArchivo'), RutaAdjunto)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ButtonGuardarAdjunto'))


WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/Check_EsPublico_1'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ButtonGrabarPersona'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Personas/_SelectTipoDocumento', 'FilterTipoDocumentoId', 
    TipoDocumentoId)

WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), CUIT)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Personas/a_Persona_k-button Modificar'), 2, FailureHandling.OPTIONAL)) {
    Utils.markPassed('El alta se realizó correctamente')

    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.logInfo('El documento creado fue: ' + NumDoc)

    Utils.logInfo('El CUIT creado fue: ' + CUIT)

    CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

    CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(RazonSocial, 'General_Personas_AltaPersJuridi', 1, 30)

    NumDoc = CustomKeywords.'hs.utils.AltaPersona.getNewDni'(NumDoc)

    CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(NumDoc, 'General_Personas_AltaPersJuridi', 1, 1)

    CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(CUIT, 'General_Personas_AltaPersJuridi', 1, 2)

    Utils.logInfo('El próximo dni va a ser: ' + NumDoc)

    CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

    WebUI.closeBrowser()
} else {
    Utils.markErrorAndStop('ERROR: El alta no se realizó correctamente, comprobar manualmente para que en caso de ser necesario, corrijan los numeros de DNI en el excel')
}

