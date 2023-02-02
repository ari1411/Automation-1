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

WebUI.callTestCase(findTestCase('Varios/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/href_Gestion'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_Consulta de propuestas'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a consulta de propuestas')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta de propuestas')
}

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin desde_FechaHoraEmisionFROM'), '')

String FechaEmiHasta = CustomKeywords.'hs.utils.GetDate.GetFechaDMA'(15, true)

WebUI.setText(findTestObject('Page_Consulta de propuestas/input_Fecha emisin hasta_FechaHoraEmisionTO'),
	FechaEmiHasta)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/_grdConsultaMovimiento'), 3)

WebUI.waitForJQueryLoad(20)

'Verifica que no traiga ningun registro cuando no hay ningun filtro cargado'
if (!(WebUI.verifyElementNotPresent(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    3, FailureHandling.OPTIONAL))) {
    Utils.markErrorAndStop('Query trae registros teniendo todos los filtros vacios')
}

WebUI.scrollToPosition(0, 0)

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Consulta de movimientos/_FilterRamoId', 'RamoId', 
    RamoId)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Refrescar'))

WebUI.scrollToElement(findTestObject('Page_Consulta de propuestas/_grdConsultaMovimiento'), 3)

WebUI.waitForJQueryLoad(20)

'Verifica si funciona el filtro Ramo'
if (!(WebUI.verifyElementPresent(findTestObject('Page_Consulta de propuestas/a_Grupo endoso_k-button k-button-icontext k-grid-Mostrarmen k-font-icon'), 
    3, FailureHandling.OPTIONAL))) {
    Utils.markErrorAndStop('Query no trae registros teniendo activo el filtro Ramo')
}

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Consulta de propuestas/a_Propuesta'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Alta de Pliza Nueva/_LoaderBaseAbm'), 60)

WebUI.waitForJQueryLoad(10)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio'), 20, 
    FailureHandling.OPTIONAL)) {
    Utils.markPassed('03 - Entro a alta de propuesta')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla alta de propuesta')
}

'En caso de que se cargue la pantalla de Nueva Propuesta con algun otro Proceso Negocio que no sea Póliza Nueva, lo modifica para poder continuar con la comparación'
if (!(WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 
    'Póliza Nueva [1]', FailureHandling.OPTIONAL))) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
        'cboProcesoNegocioId', '1')

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)
}

'Compara la grilla de Póliza Nueva con los datos cargados en el excel'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Póliza Nueva [1]', 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 3)

    WebUI.doubleClick(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'))

    try {
        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
            PolizaNvaDescripcionFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'), 
            PolizaNvaValorFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
            PolizaNvaDescripcionFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'), 
            PolizaNvaValorFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'), 
            PolizaNvaDescripcionFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'), 
            PolizaNvaValorFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'), 
            PolizaNvaDescripcionFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'), 
            PolizaNvaValorFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
            PolizaNvaDescripcionFila5)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'), 
            PolizaNvaValorFila5)

        if (PolizaNvaValorFila6 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
                PolizaNvaDescripcionFila6)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'), 
                PolizaNvaValorFila6)
        }
        
        if (PolizaNvaValorFila7 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), 
                PolizaNvaDescripcionFila7)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'), 
                PolizaNvaValorFila7)
        }
    }
    catch (def ex) {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: Algun/os dato/s del proceso negocio Póliza Nueva no coincide, comparar la screenshot con los datos cargados en el excel')
    } 
    
    WebUI.scrollToPosition(0, 0)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '5')

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

'Compara la grilla de Anulación con los datos cargados en el excel'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Anulación [5]', 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 3)

    WebUI.doubleClick(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'))

    try {
        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
            AnulacionDescripcionFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'), 
            AnulacionValorFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
            AnulacionDescripcionFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'), 
            AnulacionValorFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'), 
            AnulacionDescripcionFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'), 
            AnulacionValorFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'), 
            AnulacionDescripcionFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'), 
            AnulacionValorFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
            AnulacionDescripcionFila5)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'), 
            AnulacionValorFila5)

        if (AnulacionValorFila6 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
                AnulacionDescripcionFila6)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'), 
                AnulacionValorFila6)
        }
        
        if (AnulacionValorFila7 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), 
                AnulacionDescripcionFila7)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'), 
                AnulacionValorFila7)
        }
    }
    catch (def ex) {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: Algun/os dato/s del proceso negocio Anulación no coincide, comparar la screenshot con los datos cargados en el excel')
    } 
    
    WebUI.scrollToPosition(0, 0)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '4')

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

'Compara la grilla de Endoso con los datos cargados en el excel'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Endoso [4]', 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 3)

    WebUI.doubleClick(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'))

    try {
        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
            EndosoDescripcionFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'), 
            EndosoValorFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
            EndosoDescripcionFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'), 
            EndosoValorFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'), 
            EndosoDescripcionFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'), 
            EndosoValorFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'), 
            EndosoDescripcionFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'), 
            EndosoValorFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
            EndosoDescripcionFila5)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'), 
            EndosoValorFila5)

        if (EndosoValorFila6 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
                EndosoDescripcionFila6)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'), 
                EndosoValorFila6)
        }
        
        if (EndosoValorFila7 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), 
                EndosoDescripcionFila7)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'), 
                EndosoValorFila7)
        }
    }
    catch (def ex) {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: Algun/os dato/s del proceso negocio Endoso no coincide, comparar la screenshot con los datos cargados en el excel')
    } 
    
    WebUI.scrollToPosition(0, 0)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '6')

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

'Compara la grilla de Prórroga con los datos cargados en el excel'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Prórroga [6]', 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 3)

    WebUI.doubleClick(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'))

    try {
        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
            ProrrogaDescripcionFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'), 
            ProrrogaValorFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
            ProrrogaDescripcionFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'), 
            ProrrogaValorFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'), 
            ProrrogaDescripcionFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'), 
            ProrrogaValorFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'), 
            ProrrogaDescripcionFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'), 
            ProrrogaValorFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
            ProrrogaDescripcionFila5)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'), 
            ProrrogaValorFila5)

        if (ProrrogaValorFila6 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
                ProrrogaDescripcionFila6)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'), 
                ProrrogaValorFila6)
        }
        
        if (ProrrogaValorFila7 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), 
                ProrrogaDescripcionFila7)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'), 
                ProrrogaValorFila7)
        }
    }
    catch (def ex) {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: Algun/os dato/s del proceso negocio Prórroga no coincide, comparar la screenshot con los datos cargados en el excel')
    } 
    
    WebUI.scrollToPosition(0, 0)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', '2')

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

'Compara la grilla de Renovación con los datos cargados en el excel'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Renovación [2]', 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.scrollToElement(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_Table_grdDatosPropuesta'), 3)

    WebUI.doubleClick(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/th_grdDatosPropuesta_Valor'))

    try {
        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion01'), 
            RenovacionDescripcionFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor01'), 
            RenovacionValorFila1)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion02'), 
            RenovacionDescripcionFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor02'), 
            RenovacionValorFila2)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion03'), 
            RenovacionDescripcionFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor03'), 
            RenovacionValorFila3)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion04'), 
            RenovacionDescripcionFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor04'), 
            RenovacionValorFila4)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion05'), 
            RenovacionDescripcionFila5)

        WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor05'), 
            RenovacionValorFila5)

        if (RenovacionValorFila6 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion06'), 
                RenovacionDescripcionFila6)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor06'), 
                RenovacionValorFila6)
        }
        
        if (RenovacionValorFila7 != '') {
            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Descripcion07'), 
                RenovacionDescripcionFila7)

            WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/td_grdDatosPropuesta_Valor07'), 
                RenovacionValorFila7)
        }
    }
    catch (def ex) {
        CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

        Utils.markErrorAndStop('ERROR: Algun/os dato/s del proceso negocio Prórroga no coincide, comparar la screenshot con los datos cargados en el excel')
    } 
    
    WebUI.scrollToPosition(0, 0)
}

CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectProcesoNegocio', 
    'cboProcesoNegocioId', ProcesoNegocioId)

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

'En caso de seleccionar el proceso negocio Anulacion procede de esta forma'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Anulación [5]', 
    FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Pliza_txtPolizaOrigen'), NumeroPolizaOrigen)

    WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Nmero de propuesta_NumeroPropuesta.StringValue'))

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
        'cboGrupoEndosoId', GrupoEndosoId)

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboTipoEndoso', 
        'cboTipoEndosoId', TipoEndosoId)
}

'En caso de seleccionar el proceso negocio Endoso procede de esta forma'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Endoso [4]', 
    FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Pliza_txtPolizaOrigen'), NumeroPolizaOrigen)

    WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Nmero de propuesta_NumeroPropuesta.StringValue'))

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
        'cboGrupoEndosoId', GrupoEndosoId)

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboTipoEndoso', 
        'cboTipoEndosoId', TipoEndosoId)
}

'En caso de seleccionar el proceso negocio Póliza Nueva procede de esta forma'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Póliza Nueva [1]', 
    FailureHandling.OPTIONAL)) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo', 
        'cboSubRamoId', SubRamoId)

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), 
        ProductorPrincipal)

    WebUI.click(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_FilterProductorPrincipal'))
}

'En caso de seleccionar el proceso negocio Prorroga procede de esta forma'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Prórroga [6]', 
    FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Pliza_txtPolizaOrigen'), NumeroPolizaOrigen)

    WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/input_Nmero de propuesta_NumeroPropuesta.StringValue'))

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboGrupoEndoso', 
        'cboGrupoEndosoId', GrupoEndosoId)

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Endoso - Caucin/_SelectCboTipoEndoso', 
        'cboTipoEndosoId', TipoEndosoId)
}

'En caso de seleccionar el proceso negocio Renovación procede de esta forma'
if (WebUI.verifyElementText(findTestObject('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboProcesoNegocio'), 'Renovación [2]', 
    FailureHandling.OPTIONAL)) {
    CustomKeywords.'hs.controles.kendo.DropDownListBox.selectElement'('Page_Alta de propuesta de Pliza Nueva - Caucin/_SelectCboSubRamo', 
        'cboSubRamoId', SubRamoId)

    WebUI.waitForPageLoad(20)

    WebUI.waitForJQueryLoad(20)

    WebUI.setText(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_ProductorPrincipal'), 
        ProductorPrincipal)

    WebUI.click(findTestObject('Page_Modificacin de propuesta de Pliza Nueva - Caucin - 98761/input_FilterProductorPrincipal'))
}

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Guardar_lnkGuardarAcciones'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Aceptar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Modificar'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('04 - Se generó correctamente la propuesta')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No se generó la propuesta')
}

WebUI.click(findTestObject('Page_Alta de propuesta de Endoso - Caucin/button_Modificar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Modificacin de propuesta de Endoso - Caucin - 98761/label_24800097708039'), 
    20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('05 - Entro a modificar propuesta')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla modificar propuesta')
}

NumeroPropuestaCreada = WebUI.getText(findTestObject('Page_Modificacin de propuesta de Endoso - Caucin - 98761/label_24800097708039'))

Utils.logInfo('Se genero la propuesta N° ' + NumeroPropuestaCreada)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/span_SeleccionModulo'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_AdInsurance - Emisin/li_General'))

WebUI.waitForPageLoad(30)

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : false, ('NombreModulo') : 'General'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))

WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

WebUI.click(findTestObject('Page_AdInsurance - General/a_Numeradores'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Numerador/input_Nombre_FilterNombre'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('07 - Entro a consulta Numeradores')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla consulta Numeradores')
}

WebUI.setText(findTestObject('Page_Numerador/input_Nombre_FilterNombre'), 'PROPUESTA')

WebUI.setText(findTestObject('Page_Numerador/input_Observacin_FilterObservacion'), FiltroObservacionNumerador)

WebUI.click(findTestObject('Page_Personas/a_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Page_Numerador/a_k-grid-Editar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Numerador (Modificacin)/li_Valores'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a modificar Numerador')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a pantalla modificar Numerador')
}

WebUI.click(findTestObject('Page_Numerador (Modificacin)/li_Valores'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

if (WebUI.verifyElementPresent(findTestObject('Page_Numerador (Modificacin)/input_Valor_ValorFiltro'), 20, FailureHandling.OPTIONAL)) {
    Utils.markPassed('02 - Entro a solapa Valores')
} else {
    CustomKeywords.'hs.utils.Screenshots.takeScreenshot'()

    Utils.markErrorAndStop('ERROR: No llego a solapa Valores')
}

WebUI.setText(findTestObject('Page_Numerador (Modificacin)/input_Valor_ValorFiltro'), NumeroPropuestaCreada)

WebUI.click(findTestObject('Page_Numerador (Modificacin)/span_Refrescar'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.verifyElementText(findTestObject('Page_Numerador (Modificacin)/td_S'), 'Sí')

WebUI.delay(1)

WebUI.closeBrowser()

