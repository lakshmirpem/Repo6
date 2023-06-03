package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ptest9 
{
	public WebDriver driver;
@Test
public void reetu()
{
	
	String Browser = System.getProperty("browser");
	String URL = System.getProperty("url");
	if(Browser.equalsIgnoreCase("chrome")) 
	{
		driver=new ChromeDriver();
	}else if(Browser.equalsIgnoreCase("Firefox")) 
	{
		driver=new FirefoxDriver();
	}driver.get(URL);
}
}
