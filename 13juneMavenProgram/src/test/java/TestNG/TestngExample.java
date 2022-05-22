package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngExample {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\New folder\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver .get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
	}
	

}
