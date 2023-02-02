package hs.utils

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


class convertString {

	@Keyword
	def stringFormatoNumerico(String numString){

		String numFloat;

		// 1.000.000,00

		numFloat = (numString - '.')

		// numFloat = 1.000000,00
		// numString = 1.000.000,00

		while (numString != numFloat) {
			numString = numFloat

			// numFloat = 1.000000,00
			// numString = 1.000000,00

			numFloat = (numString - '.')

			// numFloat = 1000000,00
			// numString = 1.000000,00
		}

		numString = numString.replace(',', '.')

		// numString = 1000000.00

		return numString
	}

	@Keyword
	def stringFormatoNumericoSinDecimales(String numString){

		String numFloat;

		// 1.000.000,00

		numFloat = (numString - '.')

		// numFloat = 1.000000,00
		// numString = 1.000.000,00

		while (numString != numFloat) {
			numString = numFloat

			// numFloat = 1.000000,00
			// numString = 1.000000,00

			numFloat = (numString - '.')

			// numFloat = 1000000,00
			// numString = 1.000000,00
		}

		numString = numString.replace(',00', '')

		// numString = 1000000

		return numString
	}

	@Keyword
	def stringFormatoNumericoInverso(String numOriginal){
		if(numOriginal.length()<=3) {
			return(numOriginal + ',00')
		}else if(numOriginal.length()<=6) {
			String numOriginalA;
			String numOriginalB;
			numOriginalB = numOriginal[-3] + numOriginal[-2] + numOriginal[-1]
			numOriginalA = numOriginal - numOriginalB
			return (numOriginalA + '.' + numOriginalB + ',00')
		}else if(numOriginal.length()<=9) {
			String numOriginalA;
			String numOriginalB;
			String numOriginalC;
			numOriginalC = numOriginal[-3] + numOriginal[-2] + numOriginal[-1]
			numOriginalB = numOriginal[-6] + numOriginal[-5] + numOriginal[-4]
			numOriginalA = numOriginal - numOriginalC
			numOriginalA = numOriginalA - numOriginalB
			return (numOriginalA + '.' + numOriginalB + '.' + numOriginalC + ',00')
		}else if(numOriginal.length()<=12) {
			String numOriginalA;
			String numOriginalB;
			String numOriginalC;
			String numOriginalD;
			numOriginalD = numOriginal[-3] + numOriginal[-2] + numOriginal[-1]
			numOriginalC = numOriginal[-6] + numOriginal[-5] + numOriginal[-4]
			numOriginalB = numOriginal[-9] + numOriginal[-8] + numOriginal[-7]
			numOriginalA = numOriginal - numOriginalD
			numOriginalA = numOriginalA - numOriginalC
			numOriginalA = numOriginalA - numOriginalB
			return (numOriginalA + '.' + numOriginalB + '.' + numOriginalC + '.' + numOriginalD + ',00')
		}else {
			return('numero demasiado grande')
		}
	}
}