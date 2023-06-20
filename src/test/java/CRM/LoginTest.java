package CRM;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.base.BaseClass;
import com.atmosol.pagesCRM.CRMLoginpage;
import com.atmosol.pagesCRM.HomePage;
import com.ebay.dataprovider.DataProviders;
import com.atmosol.pagesCRM.CRMLoginpage;

public class LoginTest extends BaseClass {
	CRMLoginpage loginpage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void pagecall() {
		loginpage = new CRMLoginpage(driver);
	}

	@Test(description = "Page Title", priority = 3)
	public void loginPageTitle() {
		loginpage.validatePageTitle();
		String title = loginpage.validatePageTitle();
		System.out.println(title);
		Assert.assertNotSame(title, "Free CRM  - CRM software for customer relationship management, sales, and support.");

	}

	@Test(description = "Page Logo", priority = 2)
	public void loginLogo() {
		boolean flag = loginpage.velidateLogo();
		Assert.assertTrue(flag);
	}

	@Test(description = "Login", priority = 1, dataProvider = "crmlogin", dataProviderClass = DataProviders.class)

	public void enterCredential1(String username, String password) {
		loginpage = new CRMLoginpage(driver);

		CRMLoginpage hpage = loginpage.Login(username, password);
		loginpage.clicklogin();

	}
}
