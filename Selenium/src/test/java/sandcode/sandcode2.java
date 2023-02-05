package sandcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sandcode2 {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get(" https://z3t0c9.csb.app/");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit. SECONDS);
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/input")).sendKeys("validusername@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/input")).sendKeys("valid password");
	  
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button"));
	  login.click();
	  
	  
	   
	  
  }
}
