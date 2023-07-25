package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userNameTextField =driver.findElement(By.id("username"));
		Point usernameLocation = userNameTextField.getLocation();
		System.out.println(userNameTextField);
		int usernameStart= usernameLocation.getX();
		System.out.println("usernameStart ="+ usernameStart);
		int usernameStarty= usernameLocation.getY();
		System.out.println("usernameStarty =" + usernameStarty);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
