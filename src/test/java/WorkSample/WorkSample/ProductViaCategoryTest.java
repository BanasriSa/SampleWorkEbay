package WorkSample.WorkSample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.ebay.dataprovider.DataProviders;
import com.ebay.pages.ProductViaSearch;
import com.ebay.pages.ProductViaCategory;

public class ProductViaCategoryTest extends BaseClass {
	
	
	@Test(description = "Product by Category", dataProvider = "price", dataProviderClass = DataProviders.class )
	public void EnterPrice(String minimupPrice, String maximunPrice) 
	{
		ProductViaCategory price=new ProductViaCategory(driver);
		ProductViaCategory psearch =price.SelectProduct(minimupPrice, maximunPrice);
		Assert.assertTrue(driver.getCurrentUrl().contains("Cell-Phones-Smartphones"), "Item not found");
	}
	
	
	
}
