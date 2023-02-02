import org.apache.poi.hssf.usermodel.HSSFWorkbook
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import net.bytebuddy.implementation.bytecode.constant.NullConstant

class MyTestListener {

	/**
	 * Activated before Test Suite, will do the following stuff:
	 * 
	 * 1. set GlobalVariable.CURRENT_TESTSUITE_NAME with the name of executed Test Suite (without 'Test Suites/' prefix)
	 * 2. set GlobalVariable.REPORT_FOLDER_NAME with yyyyMMdd_hhmmss value when the Test Suite started
	 * 3. set GlobalVariable.WORKBOOK with the instance of HSSFWorkbook
	 */
	@BeforeTestSuite
	def beforeTestSuite(TestSuiteContext testSuiteContext) {
		String testSuiteId = testSuiteContext.getTestSuiteId()  // 'Test Suites/TS_a' for example
		GlobalVariable.CURRENT_TESTSUITE_NAME = testSuiteId.substring(testSuiteId.indexOf('/') + 1)   // 'TS_a' for example
		WebUI.comment("#beforeTestSuite GlobalVariable.CURRENT_TESTSUITE_NAME=${GlobalVariable.CURRENT_TESTSUITE_NAME}")
		//
		Path reportFolderPath = Paths.get(RunConfiguration.getReportFolder())
		GlobalVariable.REPORT_FOLDER_NAME = reportFolderPath.getFileName().toString()
		WebUI.comment("#beforeTestSuite GlobalVariable.REPORT_FOLDER_NAME=${GlobalVariable.REPORT_FOLDER_NAME}")
	}

	/**
	 * Activated before Test Case, will do the following stuff:
	 * 
	 * 1. set GlobalVariable.CURRENT_TESTCASE_NAME with the name of executed Test Case (without 'Test Cases/' prefix)
	 */
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		String testCaseId = testCaseContext.getTestCaseId()   // 'Test Cases/TC1' for example
		GlobalVariable.CURRENT_TESTCASE_NAME = testCaseId.substring(testCaseId.indexOf('/') + 1)   // 'TC1' for example
		if (GlobalVariable.CapturasPantalla_Carpeta == '.') {
			if (GlobalVariable.CURRENT_TESTSUITE_NAME != null &&
			((String)GlobalVariable.CURRENT_TESTSUITE_NAME).length() > 0){
				GlobalVariable.CapturasPantalla_Carpeta = (String)GlobalVariable.CURRENT_TESTSUITE_NAME
			}else{
				if (GlobalVariable.CURRENT_TESTCASE_NAME != null &&
				((String)GlobalVariable.CURRENT_TESTCASE_NAME).length() > 0) {
					GlobalVariable.CapturasPantalla_Carpeta = (String)GlobalVariable.CURRENT_TESTCASE_NAME
				} else {
					throw new IllegalStateException('GlobalVariable.CURRENT_TESTCASE_NAME is null')
				}
			}
		}
		
		GlobalVariable.WaitForLoad = Integer.parseInt(GlobalVariable.WaitForLoadString)
		
		WebUI.comment("#beforeTestCase GlobalVariable.CURRENT_TESTCASE_NAME=${GlobalVariable.CURRENT_TESTCASE_NAME}")
	}

	/*	*//**
	 * Activated after Test Case, will do the following stuff:
	 * 
	 * 1. serialize the HSSFWorkbook object into file
	 * 
	 *//*
	 @AfterTestCase
	 def afterTestCase(TestCaseContext testCaseContext) {
	 closeWorkbook()	
	 WebUI.comment("#afterTestCase closed the workbook")
	 }
	 *//**
	 * has nothing to do
	 *//*
	 @AfterTestSuite
	 def afterTestSuite(TestSuiteContext testSuiteContext) {
	 // not necessary to close the workbook as it is closed by @AfterTestCase
	 WebUI.comment("#afterTestSuite has nothing to do")
	 }
	 */	
}