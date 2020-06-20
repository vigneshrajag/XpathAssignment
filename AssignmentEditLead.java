package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEditLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class=\'x-form-element\']/input[@name=\'companyName\'])[2]").sendKeys("CTS");
		driver.findElementByXPath("//button[text()='Find Leads']");
		Thread.sleep(3000);

		WebElement write = driver.findElementByXPath("(//table[@class=\"x-grid3-row-table\"]//a)[1]");

		write.click();
		driver.findElementByLinkText("Edit").click();
		WebElement name = driver.findElementById("updateLeadForm_companyName");
		String text = name.getText();
		System.out.println(text);
		name.clear();
		name.sendKeys("TCS");
		driver.findElementByXPath("//input[@value=\'Update\']").click();
		WebElement company = driver.findElementById("viewLead_companyName_sp");
		String cmpname = company.getText();
		System.out.println(cmpname);

	}

}
