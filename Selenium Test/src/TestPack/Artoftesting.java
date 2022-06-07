package TestPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Artoftesting {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//Syystem.out.print
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		int a=ele.size();
		System.out.println(a);
		int l=0;
		for(int i=0;i<a;i++)
		{
			
			System.out.println(i+1);
			String link=ele.get(i).getAttribute("href");
			System.out.println(link);
			
			if(link==null || link.isEmpty())
			{
				System.out.println("url is empty");
			}
			else
			{
				URL url=new URL(link);
			
				HttpURLConnection con=(HttpURLConnection )url.openConnection();
				//urlconnection  concrete
				con.connect();
				int rcode=con.getResponseCode();
				System.out.println(rcode);
				
				if(rcode>=400)
				{
					l++;
					
					System.out.println(rcode+link+" is broken link");
				}
				else
				{
					System.out.println(rcode+link+" is valid");
				}
				
				
			}
			
			
		}
	//	System.out.println(l);
		
		
		
		
		
	}

}
