package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExLocatorLogin {
	public static void main(String[] args)  throws Throwable{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	WebElement loginButton = driver.findElement(By.name("login"));
		//WebElement loginButton =driver.findElement(By.name("login"));
		//driver.quit();
	loginButton.click();
	
	}
}
