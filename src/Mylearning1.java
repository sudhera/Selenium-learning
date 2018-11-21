
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mylearning1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Sudhera\\chromedriver.exe");
		driver = new ChromeDriver();


driver.get("https://phptravels.com/demo/");
driver.manage().window().maximize();
Thread.sleep(5000);
if(driver.findElement(By.id("onesignal-popover-cancel-button")).isDisplayed()){
		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
}
else{
	System.out.println("element not present");
}
if(driver.findElement(By.className("mc-closeModal")).isDisplayed()){
	driver.findElement(By.className("mc-closeModal")).click();
	
}
else{
	System.out.println("subscribe functionality not exist");
}

//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//driver.navigate().to("http://www.phptravels.net");


	}

}
