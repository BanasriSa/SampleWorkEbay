package com.ebay.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
	
	@DataProvider(name="price")
	public static Object[][] getData() throws IOException
	{
		return	ExcelUtility.getDataFromSheet("Price");
	}
	
	@DataProvider(name="User")
	public static Object[][] getDataForUser() throws IOException
	{
		return	ExcelUtility.getDataFromSheet("Product");
	}
	
}