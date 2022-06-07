package TestPack;




import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		int a=ele.size();
		System.out.println(a);
		int b=0;
		for(int i=0;i<a;i++)
		{
			String link=ele.get(i).getAttribute("href");
			if(link==null || link.isEmpty())
			{
				System.out.println("url is empty");
			}
			else
			{	
				try {
					URL url=new URL(link);
					HttpURLConnection con=(HttpURLConnection)url.openConnection();
					Thread.sleep(2000);
					
						con.connect();
						int rcode=con.getResponseCode();
						
						if(rcode>=400)
						{
							b++;
							System.out.println(rcode + link+"is broken");
						}
						else
						{
							System.out.println(rcode+link+"is valid");
						}
						
				} catch (Exception e) {
					
				}
		
		}
		
		
	}
	
		System.out.println("number of broken links are"+b);
}
}
		
		
		
		



