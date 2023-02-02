package hs.controles.kendo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.JavascriptExecutor


class ClickByFor {
	@Keyword
	def clickElement(String testObjectId, String elementFor) {
		KeywordUtil.logInfo("Selecting For=" + elementFor + ")")

		def elementFor2 = "'"+elementFor+"'";
		def strClick = '$("label[for=' + elementFor2 + ']").click()';

		KeywordUtil.logInfo("javascript: " + strClick)

		/*if (!WebUI.verifyElementPresent(findTestObject(testObjectId), 20, FailureHandling.OPTIONAL)) {
		 KeywordUtil.markFailed('ERROR: No existe elemento: ' + testObjectId)
		 }
		 else {*/

		((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript(strClick)

		KeywordUtil.markPassed('Selecting...' + elementFor)
	}
}

