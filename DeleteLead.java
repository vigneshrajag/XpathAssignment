package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("sridevic82@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement lead = driver.findElementByXPath("(//table[@class=\"x-grid3-row-table\"]//a)[1]");
		String txtLeadId = lead.getText();
		lead.click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@class=\"x-form-element\"]/input[@name=\"id\"]").sendKeys(txtLeadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement email = driver.findElementByXPath("//div[@class='x-paging-info']");

		String textemail = email.getText();

		System.out.println(textemail);

	}

}
