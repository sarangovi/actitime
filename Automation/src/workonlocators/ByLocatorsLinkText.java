package workonlocators;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsLinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nbtindia.gov.in/");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.partialLinkText("CONTACT US")).click();
//	driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.quit();
	}

}
