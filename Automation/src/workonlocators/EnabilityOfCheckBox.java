package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabilityOfCheckBox {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement loginCheckBox=  driver.findElement(By.id("keepLoggedInCheckBox"));
	if(loginCheckBox.isEnabled())
	{
		System.out.println("KeepmeloggedInCheckBox is Enabled and it is verified");
	}
	else
	{
		System.out.println("KeepmeloggedInCheckBox is not Enabled and it is verified");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
