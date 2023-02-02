package hs.utils

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as Utils

public class AltaPersona {

	@Keyword
	String getNewDni(String Dni){
		int dni = Integer.parseInt(Dni)
		String newDNI = dni + 1
		return newDNI
	}

	@Keyword
	String addDateTime(String Prefix){
		Date date = new Date()
		String now = date.format('yyyyMMddhhmmssS')
		String text = Prefix + now
		return text
	}

	@Keyword
	String removeHyphensForCuit(String Text) {
		Text = Text.replace(' ', '')
		Text = Text.replace('-', '')
		if(Text.length() == 11) return Text
		else return Utils.markErrorAndStop('ERROR: El número ingresado no es correcto')
	}
}
