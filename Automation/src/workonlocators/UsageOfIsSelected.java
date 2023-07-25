package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
WebElement maleRadioButton= driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
if(maleRadioButton.isSelected())
{
	System.out.println("Pass");
	System.out.println("Male radio button is selected and it is verified");
	
}
else {
	System.out.println("Fail and it is not selected");
	maleRadioButton.click();

	if(maleRadioButton.isSelected())
	{
		System.out.println("Male radio button is clicked and it is selected now");
	}
	else
	{
		System.out.println("Male radio button is not selected even after clicking it");
	}
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();

}
}
}

