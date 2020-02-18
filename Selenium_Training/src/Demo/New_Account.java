package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class New_Account {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name ="Maria";
		String email = "maria@test.com";
		String password = "maria123";
		String country = "Germany";
		String phoneNumber ="123456789";
		String gender = "female";
		boolean weeklyEmail= true;
		boolean monthlyEmail=false;
		boolean OcasionalEmail=false;
		//variable Browsertype
		String browsertype="chrome";
		//variable Webdriver
		WebDriver driver = null;
		
		//1.- Create a Webdriver
		driver= Utilities.DriverFactory.open(browsertype);
		
		
		
		//2.-Navigate to account management page and click new account
		driver.manage().window().maximize();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/a")).click();
		WebElement nameElement= driver.findElement(By.id("MainContent_txtFirstName"));
		WebElement emailElement= driver.findElement(By.id("MainContent_txtEmail"));
		WebElement phoneElement= driver.findElement(By.id("MainContent_txtHomePhone"));
		WebElement passwordElement= driver.findElement(By.id("MainContent_txtPassword"));
		WebElement verifyPasswordElement= driver.findElement(By.id("MainContent_txtVerifyPassword"));
		WebElement countryElement = driver.findElement(By.id("MainContent_menuCountry"));
		WebElement weeklyCheckbox= driver.findElement(By.id("MainContent_checkWeeklyEmail"));
		WebElement submitElement = driver.findElement(By.id("MainContent_btnSubmit"));
		Thread.sleep(2000);
		//3.- fill out the form
		nameElement.sendKeys(name);
		Thread.sleep(1000);
		emailElement.sendKeys(email);
		Thread.sleep(1000);
		phoneElement.sendKeys(phoneNumber);
		Thread.sleep(1000);
		if(gender.equalsIgnoreCase("Male"))
		{ 
			driver.findElement(By.id("MainContent_Male")).click();
		}
		else 
		{
			driver.findElement(By.id("MainContent_Female")).click();
		}
		
		Thread.sleep(1000);
		passwordElement.sendKeys(password);
		Thread.sleep(1000);
		verifyPasswordElement.sendKeys(password);
		Thread.sleep(1000);
		countryElement.sendKeys(country);
		Thread.sleep(1000);
		if(weeklyEmail)
		{
			if(!weeklyCheckbox.isSelected())
			{
				weeklyCheckbox.click();
			}
			
			
			//MainContent_checkMonthlyEmail
			//MainContent_checkUpdates
			
		}else 
		{
			if(weeklyCheckbox.isSelected())
			{
				weeklyCheckbox.click();
			}
		}
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		Thread.sleep(1000);
		submitElement.click();
		Thread.sleep(2000);
		//4.- get confirmation
		String confirmacion = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		String expected= "Customer information added successfully";
		if(confirmacion.equals(expected))
		{
			System.out.println("LA ALTA SE REALIZO CON EXITO");
		}else 
		{
			System.out.println("TEST FAILED");
		}
		//5.- close the browser
		driver.quit();
	}

}
