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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/span_Tomadores'))

WebUI.waitForPageLoad(20)

WebUI.sendKeys(findTestObject('Page_Consulta de movimientos/a_Ad_sidebar-toggle'), '[Enter]')

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a consulta Tomadores')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta Tomadores')
}

WebUI.setText(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), NroDocumento)

WebUI.click(findTestObject('Object Repository/Page_Tomadores/a_Refrescar'))

WebUI.waitForJQueryLoad(20)

if (!(WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Tomadores/a_Persona-Editar'), 10, FailureHandling.OPTIONAL))) {
    WebUI.takeScreenshot()

    Utils.markErrorAndStop('ERROR: El número de documento ingresado ya es tomador')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores/a_Nuevo'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores (Nuevo)/input_Nro. documento_FilterNumeroDocumento'), 
    5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03- Llego a la selección del nuevo tomador')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la selección del futuro tomador')
}

WebUI.setText(findTestObject('Object Repository/Page_Tomadores (Nuevo)/input_Nro. documento_FilterNumeroDocumento'), NroDocumento)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Nuevo)/a_Refrescar'))

WebUI.waitForJQueryLoad(20)

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Tomadores (Nuevo)/td_DNI_SeleccionarTomador'), 5, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page_Tomadores (Nuevo)/td_DNI_SeleccionarTomador'))
} else {
    Utils.markErrorAndStop('ERROR: No existe ninguna persona con el número de documento ingresado')
}

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Nuevo)/button_Continuar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores (Modificacin)/span_Tomadores (Modificacin)'), 
    5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04- Llegó a la modificación del tomador')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la modificación del tomador')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/span_Comisin _k-numeric-wrap k-state-defaul_072805'))

WebUI.setText(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Comisin'), Comision)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/i_Comisin required'))

WebUI.scrollToElement(findTestObject('Page_Tomadores (Modificacin)/input_Prima mnima anual _k-formatted-value k-input'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Prima mnima anual _k-formatted-value k-input'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Prima mnima anual _PrimaMinima'), PrimaMinimaAnual)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/i_Comisin required'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Balances'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores (Modificacin)/span_Balances'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05- Llegó a solapa Balances')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa balances')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/span_Sobre patrimonio neto _k-numeric-wrap _3a05c5'))

WebUI.setText(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Sobre patrimonio neto _PatrimonioNeto'), 
    PatrimonioNeto)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Sobre manifestacin de bienes _k-forma_a64d4b'))

WebUI.setText(findTestObject('Object Repository/Page_Tomadores (Modificacin)/input_Sobre manifestacin de bienes _Manifes_364202'), 
    ManifestacionBienes)

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/span_Balances'))

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Calificacin'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Tomadores (Modificacin)/span_Calificacin'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('06- Llegó a la solapa Calificación')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa Calificación')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Informacin'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Tomadores (Modificacin)/span_Informacin Adicional'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07- Llegó a la solapa Información Adicional')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa Información Adicional')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Despachantes'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Tomadores (Modificacin)/span_Despachantes'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('08- Llegó a la solapa Despachantes')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa Despachantes')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Adjuntos'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Tomadores (Modificacin)/span_Adjuntos'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('09- Llegó a la solapa Adjuntos')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa Adjuntos')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/li_Cmulo'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Tomadores (Modificacin)/span_Cmulo'), 5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('10- Llegó a la solapa Cúmulo')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a la solapa Cúmulo')
}

WebUI.click(findTestObject('Object Repository/Page_Tomadores (Modificacin)/button_Grabar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), 
    5, FailureHandling.OPTIONAL)) {
    Utils.markPassed('11- Volvió a consulta Tomadores')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llegó a consulta Tomadores')
}

WebUI.setText(findTestObject('Object Repository/Page_Tomadores/input_Nro. Documento_FilterNumeroDocumento'), NroDocumento)

WebUI.click(findTestObject('Object Repository/Page_Tomadores/a_Refrescar'))

WebUI.waitForJQueryLoad(20)

if (!(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tomadores/a_Persona-Editar'), 10, FailureHandling.OPTIONAL))) {
    WebUI.takeScreenshot()

    Utils.markErrorAndStop('ERROR: El tomador no fue creado correctamente')
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Consulta de movimientos/_FilterRamoId'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('12 - Entro a consulta de movimientos')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta de movimientos')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterSubRamoId', 'SubramoId', 
    SubRamoId)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/span_Nuevo'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectTipoDocumento'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('13 - Entro a alta de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de póliza')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoId)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), NroDocumento)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/input_Nombre_Nombre'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.getAttribute(findTestObject('Page_Alta de Pliza Nueva/input_Apellido_ApellidoRazonSocial'), 'value').toUpperCase() == 
Apellido.toUpperCase()) {
    Utils.markPassed('14- El tomador fue creado y verificado correctamente')

    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    WebUI.closeBrowser()
} else {
    Utils.markErrorAndStop('ERROR: No funciona el tomador creado')
}

