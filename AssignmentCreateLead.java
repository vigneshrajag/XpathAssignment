package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateLead {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Capgemini");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Sri");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Devi");
		WebElement employee = driver.findElementById("createLeadForm_dataSourceId");
		Select employeedropdown = new Select(employee);
		employeedropdown.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("12345");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		industry.sendKeys("Computer Software");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipdropdown = new Select(ownership);
		ownershipdropdown.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingdropdown = new Select(marketing);
		marketingdropdown.selectByIndex(6);
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select statedropdown = new Select(state);
		statedropdown.selectByValue("TX");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sridevic82@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9381035269");
		driver.findElementByXPath("//input[@value=\'Create Lead\']").click();

	}

}
