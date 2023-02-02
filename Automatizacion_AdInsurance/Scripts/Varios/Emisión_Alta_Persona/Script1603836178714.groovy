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

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_SeleccionModulo'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/li_General'))

WebUI.waitForPageLoad(30)

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : false, ('NombreModulo') : 'General'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - General/a_Personas'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03- Ingreso a Consulta Personas')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Consulta Personas')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Personas/_SelectTipoDocumento', 'FilterTipoDocumentoId', 
    TipoDocumentoId)

WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), Verif_NumDoc)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (!(WebUI.verifyElementPresent(findTestObject('Page_Personas/a_Persona_k-button Modificar'), 20, 
    FailureHandling.OPTIONAL))) {
    Utils.markErrorAndStop('ERROR: El número de documento ingresado para verificar, no existe.')
}

WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), Nuevo_NumDoc)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(30)

if (!(WebUI.verifyElementNotPresent(findTestObject('Page_Personas/a_Persona_k-button Modificar'), 
    2, FailureHandling.OPTIONAL))) {
    Utils.markWarning('ERROR: El número de documento ingresado para crear una nueva persona, ya existe.')

    while (!(WebUI.verifyElementNotPresent(findTestObject('Page_Personas/a_Persona_k-button k-button-icontext k-grid-Eliminar'), 
        2, FailureHandling.OPTIONAL))) {
        Nuevo_NumDoc = CustomKeywords.'hs.utils.AltaPersona.getNewDni'(Nuevo_NumDoc)

        WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), Nuevo_NumDoc)

        WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

        WebUI.waitForPageLoad(20)

        WebUI.waitForJQueryLoad(30)
    }
}

WebUI.click(findTestObject('Page_Personas/a_Nuevo'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/_SelectEmpresa'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04- Ingreso a Alta Persona')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Alta Persona')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectEmpresa', 'EmpresaId', EmpresaId)

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectTipoPersona', 'TipoPersonaId', TipoPersonaId)

WebUI.waitForJQueryLoad(20)

WebUI.comment('Verifico si se está creando una persona física o jurídica y lo almaceno en la variable EsPersonaFisica')

if (WebUI.verifyElementVisible(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre2'), FailureHandling.OPTIONAL)) {
    EsPersonaFisica = true
} else {
    EsPersonaFisica = false
}

WebUI.click(findTestObject('Page_Persona/_ActionNuevoDocumento'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/_SelectTipoDocumento'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05- Ingreso a Alta Documento')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Alta Documento')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectTipoDocumento', 'tipoDocumento', 
    TipoDocumentoId)

WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Page_Persona/input_Nmero de Documento_numeroDocumento'), Nuevo_NumDoc)

if (EsPersonaFisica == true) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectSexoDocumento', 'sexoDocumento', 
        SexoDocumentoId)
}

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/_ButtonGuardarDocumento'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (Apellido == 'Katalon') {
    Apellido = CustomKeywords.'hs.utils.AltaPersona.addDateTime'('Katalon')
}

WebUI.setText(findTestObject('Page_Persona/input_Apellido_ApellidoRazonSocial'), Apellido)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectNacionalidad', 'NacionalidadId', 
    NacionalidadId)

if (EsPersonaFisica == true) {
    WebUI.setText(findTestObject('Page_Persona/input_Nombre_Nombre'), Nombre)

    WebUI.setMaskedText(findTestObject('Page_Persona/input_Fecha de nacimiento_FechaNacimiento'), FechaNacimiento)

    WebUI.click(findTestObject('Page_Persona/input_Nombre_Nombre'))

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectSexoPersona', 'SexoId', SexoDocumentoId)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectEstadoCivil', 'EstadoCivilId', 
        EstadoCivilId)
}

WebUI.scrollToElement(findTestObject('Page_Persona/div_Condicin IVA'), 10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectCondicionIVA', 'CondicionIVAId', 
    CondicionIvaId)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Persona/li_Personas Relacionadas'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/span_Personas Relacionadas'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('06- Ingreso a Personas Relacionadas')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Personas Relacionadas')
}

WebUI.click(findTestObject('Page_Persona/li_Domicilio'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/span_Domicilio'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07- Ingreso a Domicilio')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Domicilio')
}

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

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/span_Contacto'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('08- Ingreso a Contacto')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Contacto')
}

WebUI.click(findTestObject('Page_Persona/li_Condicin IIBB'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/span_Condicin IIBB'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('09- Ingreso a Condición IIBB')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Condición IIBB')
}

WebUI.click(findTestObject('Page_Persona/_ActionNuevaCondIIBB'))

WebUI.waitForJQueryLoad(20)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectProvinciaCondicionIIBB', 'ProvinciaId', 
    ProvinciaCondIIBBId)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Persona/_SelectCondIIBB', 'CondicionIIBBId', CondicionIIBBId)

WebUI.click(findTestObject('Page_Persona/a_Condicin Ingresos Brutos_abutton'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Persona/li_Exclusin Impuesto'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Persona/span_Exclusin Impuesto'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('10- Ingreso a Exclusión Impuesto')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No Ingreso a Exclusión Impuesto')
}

WebUI.click(findTestObject('Page_Persona/_ButtonGrabarPersona'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('11- Volvió a Consulta Personas')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No volvió a Consulta Personas')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Personas/_SelectTipoDocumento', 'FilterTipoDocumentoId', 
    TipoDocumentoId)

WebUI.setText(findTestObject('Page_Personas/input_Nro. documento_FilterNumeroDocumento'), Nuevo_NumDoc)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Personas/a_Persona_k-button k-button-icontext k-grid-Eliminar'), 2, 
    FailureHandling.OPTIONAL)) {
    Utils.markPassed('El alta se realizó correctamente')

    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.logInfo('El documento verificado fue: ' + Verif_NumDoc)

    Utils.logInfo('El documento creado fue: ' + Nuevo_NumDoc)

    CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

    CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(Apellido, 'Emisión_Alta_Persona', 1, 21)

    if (((Nuevo_NumDoc) as String).length() <= 8) {
        Verif_NumDoc = Nuevo_NumDoc

        Nuevo_NumDoc = CustomKeywords.'hs.utils.AltaPersona.getNewDni'(Nuevo_NumDoc)

        CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(Verif_NumDoc, 'Emisión_Alta_Persona', 1, 0)

        CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(Nuevo_NumDoc, 'Emisión_Alta_Persona', 1, 1)

        Utils.logInfo('El próximo dni a verificar va a ser: ' + Verif_NumDoc)

        Utils.logInfo('El próximo dni a generar va a ser: ' + Nuevo_NumDoc)
    }
    
    CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

    WebUI.closeBrowser()
} else {
    Utils.markErrorAndStop('ERROR: El alta no se realizó correctamente, comprobar manualmente para que en caso de ser necesario, corrijan los numeros de DNI en el excel')
}