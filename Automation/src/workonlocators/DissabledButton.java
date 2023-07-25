package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DissabledButton {
public static void main(String[] args) {
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	 WebElement buttonName= driver.findElement(By.name("submit"));
	 if(buttonName.isEnabled())
	 {
		 System.out.println("True - Fail");
		 System.out.println("Submit button is enabled and its verified");
	 }
	 else {
		 System.out.println("False - True");
		 System.out.println("Submit button is disabled and it is verified");
	 }
	driver.manage().window().minimize();
	driver.quit();
}
}
