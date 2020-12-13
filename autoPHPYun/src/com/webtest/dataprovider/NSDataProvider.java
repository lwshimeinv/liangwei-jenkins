package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	@Test(dataProvider = "excel")
	public void getData(String a, String b) {
		System.out.print(a + " " + b);
	}
	
	@DataProvider(name="excel3")
	public Object[][] getExcelDada3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx","Sheet1");
	}
	
	
	@DataProvider(name="excel4")
	public Object[][] getExcelDada4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel6")
	public Object[][] getExcelDada6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel6.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel7")
	public Object[][] getExcelDada7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel7.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel8")
	public Object[][] getExcelDada8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel8.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel9")
	public Object[][] getExcelDada9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel9.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel19")
	public Object[][] getExcelDada19() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel19.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel20")
	public Object[][] getExcelDada20() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel20.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel21")
	public Object[][] getExcelDada21() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel21.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel22")
	public Object[][] getExcelDada22() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel22.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel23")
	public Object[][] getExcelDada23() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel23.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel24")
	public Object[][] getExcelDada24() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel24.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel25")
	public Object[][] getExcelDada25() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel25.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel26")
	public Object[][] getExcelDada26() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel26.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel32")
	public Object[][] getExcelDada32() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel32.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel33")
	public Object[][] getExcelDada33() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel33.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel46")
	public Object[][] getExcelDada46() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel46.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel47")
	public Object[][] getExcelDada47() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel47.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel48")
	public Object[][] getExcelDada48() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel48.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel49")
	public Object[][] getExcelDada49() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel49.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel50")
	public Object[][] getExcelDada50() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel50.xlsx","Sheet1");
	}
}
