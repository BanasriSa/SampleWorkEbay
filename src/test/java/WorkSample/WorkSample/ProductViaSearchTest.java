package WorkSample.WorkSample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.ebay.dataprovider.DataProviders;
import com.ebay.pages.ProductViaCategory;
import com.ebay.pages.ProductViaSearch;

public class ProductViaSearchTest extends BaseClass {
	
	
	@Test(description = "Product by Search", dataProvider = "product", dataProviderClass = DataProviders.class )
	public void EnterProductToSearch(String productsearch) throws InterruptedException 
	{
		ProductViaSearch price=new ProductViaSearch(driver);
		ProductViaSearch psearch =price.enterProduct(productsearch);
		Assert.assertTrue(driver.getTitle().contains("MacBook"), "Page not found");
	}
}
