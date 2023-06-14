package WorkSample.WorkSample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.ebay.dataprovider.DataProviders;
import com.ebay.pages.ProductViaSearch;
import com.ebay.pages.ProductViaCategory;

public class ProductViaSearchTest extends BaseClass {
	
	
	@Test(description = "Search product by Category", dataProvider = "price", dataProviderClass = DataProviders.class )
	public void EnterPrice(String minimupPrice, String maximunPrice) 
	{
		ProductViaCategory price=new ProductViaCategory(driver);
		ProductViaSearch psearch =price.SelectProduct(minimupPrice, maximunPrice);
		Assert.assertTrue(driver.getCurrentUrl().contains("Cell-Phones-Smartphones"), "Item not found");
	}
	
	
	
}
