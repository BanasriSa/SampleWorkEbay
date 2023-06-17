package WorkSample.WorkSample;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.ebay.pages.addCutomerPage;

import io.opentelemetry.api.logs.Logger;
import net.bytebuddy.asm.Advice.This;

public class addCustomerTest extends BaseClass{
	
	@Test
	public void addCat() {
		
		addCutomerPage cp=new addCutomerPage(driver);
		
		cp.selectshopByCategory();
		System.out.println("Clicked on shop by category");
		
		cp.clickCellPhone();
		System.out.println("Cell Phones & Accessories");
		
		cp.clickcellpNSmartp();
		System.out.println("Cell Phones & Smartphones");
		
		cp.clickSeeAllBrand();
		System.out.println("See All");
		
		cp.selectscreenSize();
		System.out.println("Select filter as screen size,");
		
		
		cp.selectPrice();
		System.out.println("Select filter as Price");
		
		cp.selectLocationfilter();
		System.out.println("Select filter as Location");
		
		cp.selectspecificLocation();
		System.out.println("Select location as US");
		
		cp.clickApply();
		
			
		
	}
	
	
	
}
