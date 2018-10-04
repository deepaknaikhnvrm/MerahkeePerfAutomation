package merahkee.cloudmeter;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import elementsandfunctions.LoginPage;
import org.testng.*;

/**
 * Unit test for simple App.
 */
public class MammothTest 
{
	
	@BeforeTest
	public void lauchApp()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Documents\\apache-jmeter-3.3\\apache-jmeter-3.3\\bin\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Documents\\apache-jmeter-3.3\\apache-jmeter-3.3\\bin\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
		System.out.println(LoginPage.lauchapp());
		Assert.assertEquals(LoginPage.lauchapp(),"Returning from lauch app mammoth");
	}
	
	@Test 
	public void clickbutton()
	{
		System.out.println(LoginPage.ClickApp());
		Assert.assertEquals(LoginPage.ClickApp(),"Returning from click app Loging to mammoth");
	}

}