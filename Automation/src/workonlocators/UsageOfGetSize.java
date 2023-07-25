package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
WebElement userNameTextField = driver.findElement(By.id("username"));
Dimension username= userNameTextField.getSize();
System.out.println(username);
int userNameWidth = username.getWidth();
System.out.println("userNameWidth ="+ userNameWidth);
int userNameHeight = username.getHeight();
System.out.println("userNameHeight ="+ userNameHeight);
driver.manage().window().minimize();
driver.quit();


}
}
