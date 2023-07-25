package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofIsEnnabled {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	//Identify the male radio button
	WebElement maleRadiobutton = driver.findElement(By.xpath("//label[text()='Male']"));
	//check the enability Of the male radio button
	if (maleRadiobutton.isEnabled()) {
		System.out.println("Boolean True");
		System.out.println("Pass: The Male Radio Button is enabled and it is verified.");
	}else {
		System.out.println("Boolean False");
		System.out.println("Fail: The Male Radio Buttoin is disabled and it is verified.");
	}
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}

}

