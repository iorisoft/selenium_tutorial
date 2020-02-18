package Demo;

import java.awt.SystemTray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.- Open the WebBrowser
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//2.- Navigate to the web Application
		//http://sdettraining.com/trguitransactions/AccountManagement.aspx
		driver.manage().window().maximize();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		Thread.sleep(1000);
		System.out.println("Se Introdujo el usuario");
		//3.-Enter Email Address
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("test@test.com");
		Thread.sleep(1000);
		System.out.println("Se Introdujo el password");
		//4.-Enter Password
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("test123");
		Thread.sleep(1000);
		System.out.println("Se hizo click");
		//5.-Click Login
		driver.findElement(By.id("MainContent_btnLogin")).click();
		Thread.sleep(1000);
		//6.-Get confirmation
		String mensaje	= driver.findElement(By.id("conf_message")).getText();
		System.out.println("Se confirmo el Acceso "+ mensaje);
		
		String titulopagina = driver.getTitle();
		System.out.println(titulopagina);
		/*if (titulopagina !="SDET Training | Account Management") 
		{
			System.out.println("Error en el titulo de la pagina");
		}*/
		
		//7.-Close the Browser
		driver.quit();

	}

}
