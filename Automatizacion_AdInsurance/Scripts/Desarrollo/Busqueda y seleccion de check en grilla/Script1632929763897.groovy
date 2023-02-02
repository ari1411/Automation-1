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

WebUI.callTestCase(findTestCase('Varios/Login'), [('NuevaVentana') : true, ('VerificarEstaAbierto') : false, ('Url') : 'http://adinsuranceqa.ddns.net/AdInsurance/Emision/Infraestructura/Productor/Update/39237'
        , ('Usuario') : findTestData('_Login').getValue(2, 1), ('Clave') : findTestData('_Login').getValue(3, 1), ('VerificarNombreModulo') : false], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

'Busqueda y seleccion de check en grilla'
if (false) {
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
}
'CERRAR PESTAÑA Y MIRAR POR 2 SEG EL PDF'
if(false){
	WebUI.closeWindowIndex(0)
	
	WebUI.switchToWindowIndex(0)
	
	WebUI.waitForPageLoad(60)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.delay(2)
	
	WebUI.closeBrowser()
}
'SELECCION DE GESTION Y CONSULTA DE MOVIMIENTOS EN EL MAIN SIN USAR EL MOUSEOVER'
if(false){
	WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))
	
	WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Gestin'))

   WebUI.click(findTestObject('Object Repository/Page_Consulta de movimientos/a_Ad_sidebar-toggle'))
   
   WebUI.click(findTestObject('Page_AdInsurance - Emisin/_Action_Gestión'))

}