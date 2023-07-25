package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class UseOfGetLocation {
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
	WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	Point	LocationOfUsername = driver.findElement(By.id("email")).getLocation();
	System.out.println("LocationOfUsername ="+ LocationOfUsername);
	 Point passwordLocation = driver.findElement(By.id("passContainer")).getLocation();
	 System.out.println("passwordLocation ="+ passwordLocation);
	 driver.manage().window().minimize();
	 driver.quit();
	
	}

}
