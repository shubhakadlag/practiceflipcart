package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation
{
	
	public static WebDriver driver=null;
	//blounch
	public static void browserLounch(Object[]inputParameter)
	{
		try {
		String strBrowserName=(String) inputParameter[0];
		String strExe=(String) inputParameter[1];
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
		 
			System.setProperty("webdriver.chrome.driver", strExe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
		}else if(strBrowserName.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", strExe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	//openApp
	public static void openApplication(Object[]inputParameter)
	{
		try
		{

		String strUrl=(String) inputParameter[0];
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//clickOnElement
	public static void clickOnElement(Object[]inputParameter)
	{
		try
		{
		String xpath=(String) inputParameter[0];
		driver.findElement(By.xpath(xpath)).click();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// moveToElement
	public static void moveToElement(Object[]inputParameter)
	{

		try
		{
		String xpath=(String) inputParameter[0];
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//senkeys
	public static void Sendkeys(Object[]inputParameter) 
	{

		try
		{
		String xpath=(String) inputParameter[0];
		String strValue=(String) inputParameter[1];
		driver.findElement(By.xpath(xpath)).sendKeys(strValue);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	//validate login
	public static void validateLogin(Object[]inputParameter)
	{
		try {
		String givenText=(String) inputParameter[0];
		String xpath=(String) inputParameter[1];
		String text=driver.findElement(By.xpath(xpath)).getText();
		if(givenText.equalsIgnoreCase(text))
		{
			System.out.println("Text case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		}catch(Exception e)
		{
			System.out.println("Test case fail");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
