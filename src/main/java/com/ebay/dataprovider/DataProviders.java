package com.ebay.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
	
	@DataProvider(name="price")
	public static Object[][] getDataForPrice() throws IOException
	{
		return	ExcelUtility.getDataFromSheet("Price");
	}
	
	@DataProvider(name="product")
	public static Object[][] getDataForSearch() throws IOException
	{
		return ExcelUtility.getDataFromSheet("Product");
	}
	
}