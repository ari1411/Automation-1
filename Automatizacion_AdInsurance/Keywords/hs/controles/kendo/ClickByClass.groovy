package hs.controles.kendo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.JavascriptExecutor


class ClickByClass {
	/**
	 * Click element
	 * @param to Katalon test object
	 */

	@Keyword
	def clickElement(String testObjectId, String elementClass, int Index) {
		KeywordUtil.logInfo("Selecting Title= " + elementClass)

		def elementClass2 = "'"+elementClass+"'";
		def strClick = '$("*[class=' + elementClass2 + ']")[' + Index + '].click()';

		KeywordUtil.logInfo("javascript: " + strClick)

		if (!WebUI.verifyElementPresent(findTestObject(testObjectId), 20, FailureHandling.OPTIONAL)) {
			KeywordUtil.markFailed('ERROR: No existe elemento: ' + testObjectId)
		}
		else {

			((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript(strClick)

			KeywordUtil.markPassed('Selecting...' + elementClass)
		}
	}

	@Keyword
	def clickElement(String testObjectId, String elementClass) {
		KeywordUtil.logInfo("Selecting Title= " + elementClass)

		def elementClass2 = "'"+elementClass+"'";
		def strClick = '$("*[class=' + elementClass2 + ']").click()';

		KeywordUtil.logInfo("javascript: " + strClick)

		if (!WebUI.verifyElementPresent(findTestObject(testObjectId), 20, FailureHandling.OPTIONAL)) {
			KeywordUtil.markFailed('ERROR: No existe elemento: ' + testObjectId)
		}
		else {

			((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript(strClick)

			KeywordUtil.markPassed('Selecting...' + elementClass)
		}
	}
}