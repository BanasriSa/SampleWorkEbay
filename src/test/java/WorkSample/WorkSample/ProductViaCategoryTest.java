package WorkSample.WorkSample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.ebay.dataprovider.DataProviders;
import com.ebay.pages.ProductViaCategory;

public class ProductViaCategoryTest extends BaseClass {
	
	
	@Test(description = "Product by Category", dataProvider = "price", dataProviderClass = DataProviders.class )
	
	public void EnterPrice(String minimupPrice, String maximunPrice) 
	{
		ProductViaCategory price=new ProductViaCategory(driver);
		price.selectshopByCategory();
		price.clickCellPhone();
		price.clickcellpNSmartp();
		price.clickSeeAllBrand();
		price.selectscreenSize();
		price.entersize50to54();
		price.entersize45to49();
		price.entersize40to44();
		price.selectPrice();
		ProductViaCategory psearch =price.SelectProduct(minimupPrice, maximunPrice);
		price.minPrice();
		price.maxPrice();
		price.selectLocationfilter();
		price.selectspecificLocation();
		price.clickApply();
		price.verifyFilter();
		price.getFilterTagsCount();
		price.getFilterTagText(0);
		
		System.out.println(minimupPrice);
		System.out.println(maximunPrice);
		Assert.assertTrue(driver.getCurrentUrl().contains("Cell-Phones-Smartphones"), "Item not found");
		
		
		int actualFilterTagsCount = price.getFilterTagsCount();
		  System.out.println("Actual Filter Tags Count: " + actualFilterTagsCount);
        // Assertion to check if all the filters are applied
        Assert.assertEquals(actualFilterTagsCount, 5, "Filter tags are not applied");
    
	}
	
	
	
    
	
	
	
	
}