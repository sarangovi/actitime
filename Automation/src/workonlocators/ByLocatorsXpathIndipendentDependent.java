package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsXpathIndipendentDependent {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14+pro&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+14+pro%7CMobiles&requestId=53cedb44-94cd-4557-aa5c-a5f3c529c8f2&as-searchtext=ipho");
	 WebElement apple = driver.findElement(By.xpath("//li[text()='128 GB ROM'] /../../..//div[text()='APPLE iPhone 14 Pro (Silver, 128 GB)']"));
apple.click();
Thread.sleep(5000);
	 	driver.manage().window().minimize();
	driver.quit();
	}

}
