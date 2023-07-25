package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLocatorsInActiTime {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(3000);
	WebElement usernametextfield=driver.findElement(By.id("username")); 
	usernametextfield.sendKeys("admin");
	Thread.sleep(2000);
	WebElement passwordtextfield=driver.findElement(By.name("pwd"));
	passwordtextfield.sendKeys("manager");
	Thread.sleep(2000);
	WebElement loginchechbox  =driver.findElement(By.id("keepLoggedInCheckBox"));
	loginchechbox.click();
	Thread.sleep(3000);
	WebElement loginbutton =driver.findElement(By.id("loginButton"));
	loginbutton.click();
	Thread.sleep(2000);
	WebElement logoutbutton= driver.findElement(By.id("logoutLink"));
	logoutbutton.click();
	Thread.sleep(2000); 
	driver.quit();
}
}
