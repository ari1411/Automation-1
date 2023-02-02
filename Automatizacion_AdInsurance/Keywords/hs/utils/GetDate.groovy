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
import com.kms.katalon.core.util.KeywordUtil as Utils

import internal.GlobalVariable

public class GetDate {

	//Obtiene una fecha sumando o restando X cantidad de dias a la fecha actual.

	@Keyword
	String GetFechaDMA(String Days, Boolean EsSuma){

		Utils.logInfo(Days)

		int numero = Days as Integer

		if(!EsSuma){
			numero = numero * -1
		}

		Date Fecha = new Date() + numero

		String fecha = Fecha.format('dd/MM/yyyy')

		Utils.logInfo(fecha)

		return fecha
	}
	String GetFechaDMA(int Days, Boolean EsSuma){
		int numero = Days

		if(!EsSuma){
			numero = numero * -1
		}

		Date Fecha = new Date() + numero

		String fecha = Fecha.format('dd/MM/yyyy')

		Utils.logInfo(fecha)

		return fecha
	}

	@Keyword
	String GetFechaActualDMA_H0(){
		Date hoyDate = new Date()

		String hoy = hoyDate.format('dd/MM/yyyy')

		hoy = hoy + " 00:00"

		return hoy
	}

	@Keyword
	String GetFechaActualDMA_H0_mas3(){
		Date hoyDate = new Date()

		Date hoyMas3Date = hoyDate + 3

		String hoyMas3 = hoyMas3Date.format('dd/MM/yyyy')

		return hoyMas3
	}

	@Keyword
	String GetFechaDesdeOtra(String Days, Boolean EsSuma, String fechaOriginal){

		Utils.logInfo(Days)

		int numero = Days as Integer

		if(!EsSuma){
			numero = numero * -1
		}

		/*
		 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy")
		 Date dataFormateada = formato.parse(fechaOriginal)
		 */

		//def fechaOrigDate = new SimpleDateFormat("dd/MM/yyyy").parse(fechaOriginal)

		def fechaOrigDate = Date.parse("dd/MM/yyyy", fechaOriginal)

		Date Fecha = fechaOrigDate + numero

		String fecha = Fecha.format('dd/MM/yyyy')

		Utils.logInfo(fecha)

		return fecha
	}
	String GetFechaDesdeOtra(int Days, Boolean EsSuma, String fechaOriginal){
		int numero = Days

		if(!EsSuma){
			numero = numero * -1
		}

		def fechaOrigDate = Date.parse("dd/MM/yyyy", fechaOriginal)

		Date Fecha = fechaOrigDate + numero

		String fecha = Fecha.format('dd/MM/yyyy')

		Utils.logInfo(fecha)

		return fecha
	}
}
