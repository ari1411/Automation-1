package hs.utils
import com.kms.katalon.core.annotation.Keyword
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.configuration.RunConfiguration
import org.apache.poi.hssf.usermodel.HSSFRow
import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


class HSSFSupport {

	// The folder to store Excel files
	private final Path storageDir = Paths.get(RunConfiguration.getProjectDir()).resolve('Excel files')

	/**
	 * create an instance of HSSFWorkbook (Apache POI Workbook)
	 * and store it into GlobalVariable.WORKBOOK
	 */
	void openWorkbook() {
		while(GlobalVariable.UsingExcel == true) {
			delay(2)
			WebUI.comment("#openWorkbook waiting 2 seconds")
		}
		GlobalVariable.UsingExcel == true

		if (GlobalVariable.WORKBOOK == null) {
			String excelFileName = resolveExcelFileName()
			Path excelPath = storageDir.resolve(excelFileName)
			HSSFWorkbook wb
			if (Files.exists(excelPath)) {
				Files.createDirectories(excelPath.getParent())
				FileInputStream fis = new FileInputStream(excelPath.toFile())
				wb = new HSSFWorkbook(fis)
			} else {
				wb = new HSSFWorkbook()
			}
			GlobalVariable.WORKBOOK = wb
			WebUI.comment("#openWorkbook opened Excel file at ${excelPath.toString()}")
		} else {
			WebUI.comment("#openWorkbook GlobalVariable.WORKBOOK was found not null")
		}
	}
	@Keyword
	void openWorkbook(String fileName) {
		while(GlobalVariable.UsingExcel == true) {
			delay(2)
			WebUI.comment("#openWorkbook waiting 2 seconds")
		}
		GlobalVariable.UsingExcel == true

		if (GlobalVariable.WORKBOOK == null) {
			Path excelPath = storageDir.resolve(fileName)
			HSSFWorkbook wb
			if (Files.exists(excelPath)) {
				Files.createDirectories(excelPath.getParent())
				FileInputStream fis = new FileInputStream(excelPath.toFile())
				wb = new HSSFWorkbook(fis)
			} else {
				wb = new HSSFWorkbook()
			}
			GlobalVariable.WORKBOOK = wb
			WebUI.comment("#openWorkbook opened Excel file at ${excelPath.toString()}")
		} else {
			WebUI.comment("#openWorkbook GlobalVariable.WORKBOOK was found not null")
		}
	}

	/**
	 * serialize the HSSFWorkbook object into file
	 */
	void closeWorkbook() {
		if (GlobalVariable.WORKBOOK != null) {
			String excelFileName = resolveExcelFileName()
			Path excelPath = storageDir.resolve(excelFileName)
			Files.createDirectories(excelPath.getParent())
			FileOutputStream fos = new FileOutputStream(excelPath.toFile())
			HSSFWorkbook wb = (HSSFWorkbook)GlobalVariable.WORKBOOK
			wb.write(fos)
			fos.flush()
			fos.close()
			WebUI.comment("#closeWorkbook closed Excel file at ${excelPath.toString()}")
		} else {
			WebUI.comment("#closeWorkbook GlobalVariable.WORKBOOK was found null")
		}
		GlobalVariable.UsingExcel = false
	}

	@Keyword
	void closeWorkbook(String fileName) {
		if (GlobalVariable.WORKBOOK != null) {
			Path excelPath = storageDir.resolve(fileName)
			Files.createDirectories(excelPath.getParent())
			FileOutputStream fos = new FileOutputStream(excelPath.toFile())
			HSSFWorkbook wb = (HSSFWorkbook)GlobalVariable.WORKBOOK
			wb.write(fos)
			fos.flush()
			fos.close()
			WebUI.comment("#closeWorkbook closed Excel file at ${excelPath.toString()}")
		} else {
			WebUI.comment("#closeWorkbook GlobalVariable.WORKBOOK was found null")
		}
		GlobalVariable.UsingExcel = false
	}

	/**
	 * resolve Excel file name
	 *
	 * When you invoked a Test Suite, then Excel file will be named in the format of
	 *     <Test Suite name>.<Test Suite Report folder name>
	 * for example
	 *     TS_a.20180901_180938.xls
	 *
	 * When you invoked a Test Case, then Excel file will be named in the format of
	 *     <Test Case name>.xls
	 * for example
	 *     TC1.xls
	 *
	 * @return
	 */
	String resolveExcelFileName() {
		String currentTestSuiteName
		String reportFolderName
		String currentTestCaseName
		if (GlobalVariable.CURRENT_TESTSUITE_NAME != null &&
		((String)GlobalVariable.CURRENT_TESTSUITE_NAME).length() > 0) {
			currentTestSuiteName = (String)GlobalVariable.CURRENT_TESTSUITE_NAME
			if (GlobalVariable.REPORT_FOLDER_NAME != null &&
			((String)GlobalVariable.REPORT_FOLDER_NAME).length() > 0) {
				reportFolderName = (String)GlobalVariable.REPORT_FOLDER_NAME
				return "${currentTestSuiteName}.${reportFolderName}.xls"     // 'TS_a.20180901_180938.xls'
			} else {
				throw new IllegalStateException("GlobalVariable.REPORT_FOLDER_NAME is null")
			}
		} else {
			if (GlobalVariable.CURRENT_TESTCASE_NAME != null &&
			((String)GlobalVariable.CURRENT_TESTCASE_NAME).length() > 0) {
				currentTestCaseName = (String)GlobalVariable.CURRENT_TESTCASE_NAME
				return "${currentTestCaseName}.xls"
			} else {
				throw new IllegalStateException('GlobalVariable.CURRENT_TESTCASE_NAME is null')
			}
		}
	}


	static HSSFSheet findSheet(String sheetName) {
		HSSFWorkbook workbook = (HSSFWorkbook)GlobalVariable.WORKBOOK

		if (workbook.getSheet(sheetName) != null) {
			return workbook.getSheet(sheetName)
		} else {
			return workbook.createSheet(sheetName)
		}
	}


	@Keyword
	void updateSheet(String sentence, String sheetName, int rowNumber, int columnNumber) {

		HSSFSheet sheet = findSheet(sheetName)
		HSSFRow row = sheet.getRow(rowNumber)
		if(row == null) row = sheet.createRow(rowNumber)
		row.createCell(columnNumber).setCellValue(sentence)
	}

	@Keyword
	void updateExcel(String sentence, String fileName, String sheetName, int rowNumber, int columnNumber) {
		openWorkbook(fileName)
		updateSheet(sentence, sheetName, rowNumber, columnNumber)
		closeWorkbook(fileName)
	}
}