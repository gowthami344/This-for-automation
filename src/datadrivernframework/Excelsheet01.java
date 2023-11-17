package datadrivernframework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet01 {

	public static void main(String[] args)throws Exception{
	FileInputStream fis=new FileInputStream
			("C:\\Selenium folder\\excel sheet");

	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getsheet("sheet1");
	
}}
