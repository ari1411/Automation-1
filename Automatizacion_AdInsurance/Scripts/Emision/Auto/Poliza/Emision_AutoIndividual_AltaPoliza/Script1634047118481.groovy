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
            3, 1), ('VerificarNombreModulo') : true, ('NombreModulo') : 'Emisión'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Gestin'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

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

WebUI.click(findTestObject('Page_Consulta de movimientos/span_Nuevo'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), ProductorPrincipal)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'))

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectProducto', 
    'ProductoId_XmlValue', Producto)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectSubProducto', 
    'SubProductoId_XmlValue', SubProducto)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Autos/li_Personas'))

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 
    'TipoDocumentoId_XmlValue', TipoDocumentoId)

WebUI.setText(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Autos/input_Nmero de documento_NumeroDocumento.St_f6b89f'), 
    Documento)

WebUI.click(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Autos/li_Personas'))

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/li_RiesgosVehiculo'))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Marca_MarcaAutoId.XmlValue_input'), 
    Marca)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Marca_MarcaAutoId.XmlValue_input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Modelo_ModeloAutoId.XmlValue_input'), 
    Modelo)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Modelo_ModeloAutoId.XmlValue_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Ao_Anio.XmlValue_input'), 
    Anio)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Kilometraje', 
    'KilometrajeAutoId_XmlValue', Kilometraje)

WebUI.scrollToElement(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/input_Suma asegurada_k-numeric-wrap k-state-_a41a9d'), 
    GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Page_Modificacin de Pliza Nueva - Autos - 106633/input_Suma asegurada_k-numeric-wrap k-state-_a41a9d'))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Suma asegurada_SumaAsegurada.DecimalValue'), 
    SumaAsegurada)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Destino', 
    'DestinoAutoId_XmlValue', Destino)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Carroceria', 
    'CarroceriaAutoId_XmlValue', Carroceria)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_Provincia', 
    'ProvinciaIdAuto_XmlValue', Provincia)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'), 
    GlobalVariable.WaitForLoad)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'), 
    Localidad)

WebUI.delay(Integer.parseInt(EsperaLocalidad))

WebUI.sendKeys(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Localidad_LocalidadIdAuto.XmlValue_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_C. P._CodigoPostalAuto_input'), 
    CodigoPostal)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Patente_Patente.StringValue'), 
    Patente)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Motor_Motor.StringValue'), 
    Motor)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/input_Chasis_Chasis.StringValue'), 
    Chasis)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_ClausulaAjuste', 
    'ClausulaAjusteAutoId_XmlValue', ClausulaAjuste)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/div_Datos del propietario'), 
    GlobalVariable.WaitForLoad)

WebUI.click(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/div_Datos del propietario'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_TipoDocumento', 
    'TipoDocumentoIdPersonaAuto_XmlValue', TipoDocumento)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 107880/input_N documento_NumeroDocumentoPersonaAut_5e3238'), 
    NumDocumento)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 107880/input_Apellido_ApellidoPersonaAuto.StringValue'), 
    Apellido)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 107880/input_Nombre_NombrePersonaAuto.StringValue'), 
    Nombre)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_NacionalidadPersonaAuto', 
    'NacionalidadIdPersonaAuto_XmlValue', Nacionalidad)

WebUI.setText(findTestObject('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 107880/input_Fecha nacimiento_FechaNacimientoPerso_04199a'), 
    FechaNacimiento)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_SexoPersonaAuto', 
    'SexoIdPersonaAuto_XmlValue', Sexo)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Object Repository/Page_Modificacin de Pliza Nueva - Autos - 106633/_input_EstadoCivil', 
    'EstadoCivilIdPersonaAuto_XmlValue', EstadoCivil)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_ButtonCalcular'))

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), GlobalVariable.WaitForLoad)

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Presupuestada'), 'Estado: Presupuestada')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonEmitir', 'lnkEmitir')

WebUI.waitForPageLoad(GlobalVariable.WaitForLoad)

WebUI.waitForJQueryLoad(GlobalVariable.WaitForLoad)

nCotizacion = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de cotizacin 106516'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nCotizacion)

nPoliza = WebUI.getText(findTestObject('Object Repository/Page_Alta de propuesta de Pliza Nueva - Aut_28a071/h3_Nmero de propuesta 934'), 
    FailureHandling.STOP_ON_FAILURE)

Utils.logInfo(nPoliza)

nCotizacion = (nCotizacion - 'Número de cotización: ')

Utils.logInfo(nCotizacion)

nPoliza = (nPoliza - 'Número de póliza: ')

Utils.logInfo(nPoliza)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

CustomKeywords.'hs.utils.HSSFSupport.openWorkbook'('Variables.xls')

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nCotizacion, 'Emision_AutoIndividual_AltaPoli', 1, 30)

CustomKeywords.'hs.utils.HSSFSupport.updateSheet'(nPoliza, 'Emision_AutoIndividual_AltaPoli', 1, 31)

CustomKeywords.'hs.utils.HSSFSupport.closeWorkbook'('Variables.xls')

WebUI.closeBrowser()

