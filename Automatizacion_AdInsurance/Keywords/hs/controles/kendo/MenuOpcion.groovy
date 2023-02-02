package hs.controles.kendo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import internal.GlobalVariable

public class MenuOpcion {
	@Keyword
	def clickOpcion(String solapa, String itemMenu) {
		def strUrl = '/adinsurance/Emision/' + solapa + '/' + itemMenu;
		def strSelec = WebUI.concatenate(['$("a[href*=', '\'', strUrl, '\'', ']")[0].click()'] as String[], FailureHandling.STOP_ON_FAILURE);
		KeywordUtil.logInfo("javascript: " + strSelec);
		((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript(strSelec)
		KeywordUtil.markPassed('menu...' + strSelec)
	}

	@Keyword
	def clickOpcion(String solapa, String itemMenu, String parametros) {
		//KeywordUtil.logInfo("Selecting Id=" + idDropdown + ", Code=" + selectCode)

		def strUrl = '/adinsurance/Emision/' + solapa + '/' + itemMenu + '?' + parametros;
		def strSelec = WebUI.concatenate(['$("a[href*=', '\'', strUrl, '\'', ']")[0].click()'] as String[], FailureHandling.STOP_ON_FAILURE);
		KeywordUtil.logInfo("javascript: " + strSelec);
		((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript(strSelec)
		KeywordUtil.markPassed('menu...' + strSelec)

	}
}
