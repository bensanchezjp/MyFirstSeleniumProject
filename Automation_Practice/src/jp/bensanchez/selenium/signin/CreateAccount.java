package jp.bensanchez.selenium.signin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	
	WebDriver driver;

	// Populates the Create An Account Form
	public void populateForm(WebDriver driver) {
		try {
			driver.navigate().to("http://www.automationpractice.com");
			driver.findElement(By.className("login")).click();

			driver.findElement(By.cssSelector("#email_create")).sendKeys("a1b40@de1f.hij");

			driver.findElement(By.cssSelector("#email_create")).sendKeys(Keys.TAB);

			driver.findElement(By.cssSelector("#SubmitCreate")).click();
			driver.findElement(By.id("uniform-id_gender1")).isEnabled();

			WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]"));
			radioButton.click();

			// Fills out Customer First Name text box and enters TAB key to authenticate.
			driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Selenium");
			driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(Keys.TAB);

			// Fills out Customer Last Name text box
			driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Automator");
			driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(Keys.TAB);

			// enters TAB key to authenticate.
			driver.findElement(By.cssSelector("#email")).sendKeys(Keys.TAB);

			// Fills out Customer Password text box in cleartext
			driver.findElement(By.cssSelector("#passwd")).sendKeys("selenium123");
			driver.findElement(By.cssSelector("#passwd")).sendKeys(Keys.TAB);

			// Selects Customer's Day of Birth
			Select dayDropDown = new Select(driver.findElement(By.id("days")));
			dayDropDown.selectByIndex(20);

			// Selects Customer's Month of Birth
			Select monthDropDown = new Select(driver.findElement(By.id("months")));
			monthDropDown.selectByIndex(1);

			// Selects Customer's Year of Birth
			Select yearDropDown = new Select(driver.findElement(By.id("years")));
			yearDropDown.selectByIndex(35);

			// Customer sign's up for newsletter
			WebElement newsLetterCheckBox = driver.findElement(By.id("newsletter"));
			newsLetterCheckBox.click();

			// Customer agrees to Receive special offers from our partners!
			WebElement specialOffersCheckBox = driver.findElement(By.id("optin"));
			specialOffersCheckBox.click();

			driver.findElement(By.id("address1")).sendKeys("123 Selenium Drive");
			driver.findElement(By.id("address1")).sendKeys(Keys.TAB);

			driver.findElement(By.id("address2")).sendKeys("2-G");
			driver.findElement(By.id("address2")).sendKeys(Keys.TAB);

			driver.findElement(By.id("city")).sendKeys("Selenium City");
			driver.findElement(By.id("city")).sendKeys(Keys.TAB);

			Select stateDropDown = new Select(driver.findElement(By.id("id_state")));
			stateDropDown.selectByIndex(5);

			driver.findElement(By.id("postcode")).sendKeys("90210");

			driver.findElement(By.id("phone_mobile")).sendKeys("987-654-3210");

			driver.findElement(By.id("submitAccount")).click();
			
			AddProducts myDress = new AddProducts();
			myDress.AddDress(driver);
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void closeBrowser() {

		try {

			Thread.sleep(2000);
			driver.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//CreateAccount myObj = new CreateAccount();
		InvokeBrowser invokeB = new InvokeBrowser();
		invokeB.invokeBrowser();
	
		
	
}
	}
