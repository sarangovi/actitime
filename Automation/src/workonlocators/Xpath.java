package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/");
//	driver.findElement(By.className("transparent")).click();
//	driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();
//	driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
//	driver.findElement(By.xpath("//button[@class='transparent']")).click();
//	driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
//	driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
	driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();

//	driver.findElement(By.className("loginRegister")).click();
	Thread.sleep(3000);
	driver.quit();
	
}
}
