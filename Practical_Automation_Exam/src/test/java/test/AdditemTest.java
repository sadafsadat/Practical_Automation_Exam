package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddItemPage;
import page.DashboardPage;
import util.BrowserFactory;

public class AdditemTest {

	WebDriver driver;
	int generatedNum = generateRandomNumber(999);
	AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	

	String ItemName = "Sadaf" + generatedNum ;
	String DueMonth = "Mar";
	String DueYear = "2023";
	String DueDate = "4";

	@Test
	public void Test1() {
		additem.addCategory();
		additem.addCategorybutton();
		
	}
	@Test
	public void Test101(){
		driver = BrowserFactory.init();
		dashboardpage.VerifyDashboardHeader();
		

		for (int i = 0; i < 5; i++) {
			additem.AddingItem(ItemName);
			additem.DueDay(DueDate);
			additem.DueMonth(DueMonth);
			additem.DueYear(DueYear);
			additem.ClickAdd();
		}
		additem.Toggle();
		// BrowserFactory.tearDown();
	}

	private int generateRandomNumber(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
	public void Test2() {

		driver = BrowserFactory.init();

		AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);
//		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
//		dashboardpage.VerifyDashboardHeader();

		additem.CLICKONSINGLEITEM();
		additem.RemoveItem();
		// BrowserFactory.tearDown();
	}

	@Test
	public void Test3() {
		driver = BrowserFactory.init();

		AddItemPage additem = PageFactory.initElements(driver, AddItemPage.class);

		additem.Toggle();
		additem.RemoveItem();

	}

}
