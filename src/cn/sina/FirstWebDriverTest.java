package cn.sina;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebDriverTest {
	public static void main(String[] args){
		WebDriver driver;
	    String baseUrl;
	    baseUrl ="www.sogou.com";
	    driver =new FirefoxDriver();
	    driver.get(baseUrl+"/");
	    driver.findElement(By.id("query")).sendKeys("����֮·����֮��");
	    driver.findElement(By.id("stb")).click();
	}

}
