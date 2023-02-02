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

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Infraestructura'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Comercial'))

WebUI.click(findTestObject('Object Repository/Page_AdInsurance - Emisin/a_Agentes'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agentes/input_Persona_FilterPersona'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a consulta de agentes')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta de agentes')
}

WebUI.setText(findTestObject('Object Repository/Page_Agentes/input_Persona_FilterPersona'), Persona_NvoAgente)

WebUI.click(findTestObject('Object Repository/Page_Agentes/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (!(WebUI.verifyElementNotPresent(findTestObject('Page_Agentes/a_S_k-button k-button-icontext k-grid-Eliminar'), 3, FailureHandling.OPTIONAL))) {
    Utils.markErrorAndStop('ERROR: El agente ingresado ya existe')
}

WebUI.click(findTestObject('Object Repository/Page_Agentes/a_Nuevo'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agente (Nuevo)/input_Persona_PersonaId_input'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a alta de agente')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de agente')
}

WebUI.setText(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Persona_PersonaId_input'), Persona_NvoAgente)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Agente (Nuevo)/_SelectFilterPersona'))

WebUI.setText(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Matrcula_Matricula'), Matricula)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Agente (Nuevo)/_SelectCategoriaSSN', 'CategoriaSSNId', 
    CategoriaSSNId)

if (CodigoExterno == '') {
    CodigoExterno = CustomKeywords.'hs.utils.AltaPersona.addDateTime'('KTL')
}

WebUI.setText(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Cdigo Externo_CodigoExterno'), CodigoExterno)

WebUI.click(findTestObject('Page_Agente (Nuevo)/input_Matrcula_Matricula'))

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Agente (Nuevo)/button_Grabar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agente (Nuevo)/input_Persona_PersonaId_input'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Entro a modificación de agente')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.logInfo('ERROR: En caso de que la pantalla sea blanca, es posiblemente que el código externo se esté repitiendo')

    Utils.markErrorAndStop('ERROR: No llego a pantalla modificación de agente')
}

WebUI.click(findTestObject('Page_Agente (Nuevo)/li_Grupo Afinidad'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agente (Nuevo)/span_Grupo Afinidad -'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05 - Entro a solapa grupo afinidad')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a solapa grupo afinidad')
}

WebUI.click(findTestObject('Object Repository/Page_Agente (Nuevo)/li_Subramos'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agente (Nuevo)/span_SubRamos -'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('06 - Entro a solapa subramo')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a solapa subramo')
}

WebUI.click(findTestObject('Page_Agente (Nuevo)/span_Nuevo_Subramo'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Agente (Nuevo)/label_Permite Emitir'))

'Aca selecciono AP y caucion que funcionan para seleccionar poder probar el Agente en una nueva poliza. En caso de querer usar los pasos originales del video, poner en false'
if (true) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Productor (Modificacin)/select_12345678910Ms paginas'), 
        '11', true)

    int nPagina = 1

    int nCheck = 0

    boolean BuscarSubRamo1 = true

    boolean BuscarSubRamo2 = true

    while (BuscarSubRamo1 & BuscarSubRamo2) {
        while (BuscarSubRamo1) {
            if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_01'), Ramo1, 
                FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_01'), 
                SubRamo1, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_01'))

                nCheck = 1

                BuscarSubRamo1 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_02'), 
                Ramo1, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_02'), 
                SubRamo1, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_02'))

                nCheck = 2

                BuscarSubRamo1 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_03'), 
                Ramo1, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_03'), 
                SubRamo1, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_03'))

                nCheck = 3

                BuscarSubRamo1 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_04'), 
                Ramo1, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_04'), 
                SubRamo1, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_04'))

                nCheck = 4

                BuscarSubRamo1 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_05'), 
                Ramo1, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_05'), 
                SubRamo1, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_05'))

                nCheck = 5

                BuscarSubRamo1 = false

                break
            }
            
            nPagina++

            WebUI.click(findTestObject('Page_Productor (Modificacin)/_a_k-link k-pager-nav_PagSig'))
        }
        
        Utils.logInfo((('subramo encontrado en la pagina ' + nPagina.toString()) + ', en la fila ') + nCheck.toString())

        while (BuscarSubRamo2) {
            if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_01'), Ramo2, 
                FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_01'), 
                SubRamo2, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_01'))

                nCheck = 1

                BuscarSubRamo2 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_02'), 
                Ramo2, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_02'), 
                SubRamo2, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_02'))

                nCheck = 2

                BuscarSubRamo2 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_03'), 
                Ramo2, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_03'), 
                SubRamo2, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_03'))

                nCheck = 3

                BuscarSubRamo2 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_04'), 
                Ramo2, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_04'), 
                SubRamo2, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_04'))

                nCheck = 4

                BuscarSubRamo2 = false

                break
            } else if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_Ramo_05'), 
                Ramo2, FailureHandling.OPTIONAL) & WebUI.verifyElementText(findTestObject('Object Repository/Page_Productor (Modificacin)/_td_SubRamo_05'), 
                SubRamo2, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Page_Productor (Modificacin)/_input_checkgroup_05'))

                nCheck = 5

                BuscarSubRamo2 = false

                break
            }
            
            nPagina++

            WebUI.click(findTestObject('Page_Productor (Modificacin)/_a_k-link k-pager-nav_PagSig'))
        }
        
        Utils.logInfo((('subramo encontrado en la pagina ' + nPagina.toString()) + ', en la fila ') + nCheck.toString())
    }
} else {
    WebUI.click(findTestObject('Page_Agente (Nuevo)/_CheckboxSubramoCaucion'))

    WebUI.click(findTestObject('Page_Agente (Nuevo)/_CheckboxSubramoAP'))
}

WebUI.click(findTestObject('Page_Agente (Nuevo)/button_AceptarSubramos'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Object Repository/Page_Agente (Nuevo)/i_Activo_fa fa-edit'))

WebUI.setText(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Accidentes personales_VigenciaDesde'), CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(
        CantDiasAntesVigenciaDesdeAP, false))

WebUI.sendKeys(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Accidentes personales_VigenciaDesde'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Agente (Nuevo)/i_Activo_fa fa-check'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Object Repository/Page_Agente (Nuevo)/i_S_fa fa-edit'))

WebUI.setText(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Accidentes personales_VigenciaDesde'), CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(
        CantDiasAntesVigDesdeCaucion, false))

WebUI.sendKeys(findTestObject('Object Repository/Page_Agente (Nuevo)/input_Accidentes personales_VigenciaDesde'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Agente (Nuevo)/i_S_fa fa-check'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Agente (Nuevo)/li_Distribucin'))

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agente (Nuevo)/span_Distribucin -'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('06 - Entro a solapa distribución')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a solapa distribución')
}

WebUI.click(findTestObject('Page_Agente (Nuevo)/span_Nuevo_Distribucin'))

WebUI.setText(findTestObject('Page_Agente (Nuevo)/input_Vigencia Desde_distribVigenciaDesde'), CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(
        CantDiasDespuesVigDesdeDistrib, true))

WebUI.click(findTestObject('Page_Agente (Nuevo)/input_Distribucin_productor'))

WebUI.verifyElementText(findTestObject('Page_Agente (Nuevo)/td_PorcentajeComisin'), PorcentajeComision)

WebUI.scrollToElement(findTestObject('Page_Agente (Nuevo)/button_AceptarDistribucion'), 3)

WebUI.click(findTestObject('Page_Agente (Nuevo)/button_AceptarDistribucion'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Agente (Nuevo)/button_Grabar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Agentes/input_Persona_FilterPersona'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07 - Volvió a consulta de agentes')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No volvió a consulta de agentes')
}

WebUI.setText(findTestObject('Object Repository/Page_Agentes/input_Persona_FilterPersona'), Persona_NvoAgente)

WebUI.click(findTestObject('Object Repository/Page_Agentes/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (!(WebUI.verifyElementPresent(findTestObject('Page_Agentes/a_S_k-button k-button-icontext k-grid-Eliminar'), 3, FailureHandling.OPTIONAL))) {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: El agente no se creo correctamente')
}

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de movimientos'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Consulta de movimientos/_FilterRamoId'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('08 - Entro a consulta de movimientos')
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
    Utils.markPassed('09 - Entro a alta de póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de póliza')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoDocumento', 'TipoDocumentoId_XmlValue', 
    TipoDocumentoId_tomador)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Nmero de documento_NumeroDocumento'), CUIL_CUIT_tomador)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/div_Nmero de documentokendo.syncReady(funct_946f82'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (TipoPersonaId >= 1) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectTipoPersona', 'TipoPersonaId_XmlValue', 
        TipoPersonaId)
}

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.ClickByTitle.clickElement'('/Page_Alta de Pliza Nueva/_SolapaAsegurado', 'Asegurado')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectRolPersonaOrigen'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('10 - Entro a solapa Asegurado')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Asegurado')
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectRolPersonaOrigen', 'RolPersonaOrigenId', 
    '3')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCopiar', 'lnkCopiarPersona')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.delay(1)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuEmision', 'Emision')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('11 - Entro a solapa Emisión')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Emisión')
}

WebUI.setText(findTestObject('Page_Alta de Pliza Nueva/input_Productor principal_ProductorId.XmlVa_41d96e'), Persona_NvoAgente)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'), 5)

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/_SelectFilterProductor'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectProducto', 'ProductoId_XmlValue', 
    ProductoId)

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(30)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectVigenciaContrato', 'VigenciaId_XmlValue', 
    VigenciaContratoId)

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectFormaPago', 'FormaPagoId_XmlValue', 
    FormaPagoId)

WebUI.waitForJQueryLoad(10)

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_MenuRiesgos', 'RiesgosCaucion')

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/_CeldaSumaAseguradaObraPublica'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('12 - Entro a solapa Riesgos Caución')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla solapa Riesgos Caución')
}

WebUI.click(findTestObject('Object Repository/Page_Alta de Pliza Nueva - Caucin/span_No_k-switch-handle'))

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Incompleta'), 'Estado: Incompleta')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonCalcular', 'lnkCalcular')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

WebUI.verifyElementText(findTestObject('Page_Alta de Pliza Nueva/span_Estado Presupuestada'), 'Estado: Presupuestada')

CustomKeywords.'hs.controles.kendo.ClickByID.clickElement'('/Page_Alta de Pliza Nueva/_ButtonEmitir', 'lnkEmitir')

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('14 - Emitio póliza')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No emitió póliza')
}

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Continuar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'), 10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir'))

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(120)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/span_Todos_k-icon k-i-arrow-60-down'), 60)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('/Page_Alta de Pliza Nueva/_SelectDestinatario', 'cboDestinatarios', 
    '2')

WebUI.click(findTestObject('Page_Alta de Pliza Nueva/button_Imprimir_1'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(120)

WebUI.delay(10)

CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

WebUI.closeBrowser()

