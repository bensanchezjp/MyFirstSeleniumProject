package jp.bensanchez.selenium.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddProducts extends CreateAccount {

	WebDriver driver;


	public void AddDress (WebDriver driver){
		
		try {
			
			//Hovers mouse over Women menu
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			
			//Clicks on Summer Dresses submenu
			driver.findElement(By.linkText("Summer Dresses")).click();
			
			WebElement chiffonElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
			Actions chiffonAction = new Actions(driver);
			chiffonAction.moveToElement(chiffonElement).perform();
			
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]")).click();
			
			//Clicks on Continue Shopping button.
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
			
			//Clicks on T-Shirts Link
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
			
			//Hovers over Faded Short Sleeve 
			WebElement fadedShortSleeve = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
			Actions fadedShortSleeveAction = new Actions(driver);
			fadedShortSleeveAction.moveToElement(fadedShortSleeve).perform();
			
			// Adds Faded Short Sleeve T-Shirts to cart
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
			
			//Clicks on the Proceed to Checkout Button
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			
			//Clicks on the Proceed to Checkout Button SHOPPING-CART SUMMARY section
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
			
			//Clicks on the Proceed to Checkout Button Address section
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
			
			//Clicks on the agree to terms check box
			WebElement agreeToTerms = driver.findElement(By.id("cgv"));
			agreeToTerms.click();
			
			//Clicks on the Proceed to checkout Button Shipping Section
			driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
			
			//Clicks on the Pay By Check option
			driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
			
			//Click on Confirm Order button
			driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
			
		

			System.out.println("Hello addDress()!"); // Test to find out if logic reaches addAddress();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	

 }
}