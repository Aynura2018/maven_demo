package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
 WebDriver driver;
	@Test
  public void mavenTest() {
		WebElement search_box =driver.findElement(By.name("q"));
		search_box.sendKeys("porsche" + Keys.ENTER);

		Assert.assertTrue(driver.getTitle().contains("porsche"));  
	  
  }
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver","C:\\selenium_libs\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:\\google.com");
		
	}
	
	@AfterTest

	public void afterTest() {
	driver.quit();
}
}
