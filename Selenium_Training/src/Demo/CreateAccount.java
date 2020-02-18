package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1.- Create a Webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//2.-Navigate to account management page and click new account
		driver.manage().window().maximize();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/a")).click();
		Thread.sleep(2000);
		//3.- fill out the form
		driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Filete");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys("filete@test.com");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("1245789630");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_Male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("filete123");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("filete123");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_menuCountry")).sendKeys("Germany");
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		Thread.sleep(2000);
		
		//4.- get confirmation
		String confirmacion = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println("Confirmation "+ confirmacion);
		//5.- close the browser
		driver.quit();
		
		
		
		
	}

}
