package merahkee.cloudmeter;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import elementsandfunctions.LoginPage;

/**
 * Unit test for simple App.
 */
public class MammothTest 
{
	//This Method will launch new crhome instance and gets the provided url
	@BeforeTest
	public void lauchApp()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Documents\\apache-jmeter-3.3\\apache-jmeter-3.3\\bin\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Documents\\apache-jmeter-3.3\\apache-jmeter-3.3\\bin\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
		System.out.println(LoginPage.lauchapp());
	}
	
	@Test 
	public void clickbutton()
	{
		System.out.println(LoginPage.ClickApp());
	}

}
