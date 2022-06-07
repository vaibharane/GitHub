package TestPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/default.asp");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		
	
	/*	WebElement learnhtml=driver.findElement(By.xpath("(//a[text()='Learn HTML'])[2]"));
		learnhtml.click();
		Thread.sleep(1000);
		
		WebElement tables=driver.findElement(By.xpath("//a[text()='HTML Tables']"));
		tables.click();
		Thread.sleep(1000);*/
		
		List<WebElement>ele=driver.findElements(By.xpath("//table[@id='customers']//td"));
		int s=ele.size();
		for(int i=0;i<s;i++)
		{
			String x=ele.get(i).getText();
			System.out.println(x);
		}
		
		
		/*List<WebElement> elements=driver.findElements(By.xpath("//table[@id='customers']//td"));
		int a=elements.size();
		System.out.println(a);
	
		for(int i=0;i<a;i++)
		{
			String text=elements.get(i).getText();
			System.out.println(text);
		}
		
		for(int i=2;i<=7;i++)
		{
		  List<WebElement> elements=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));
		 int b=  elements.size();
		 System.out.println("Row"+(i-1)+"     Cell"+b);
		 for(int j=0;j<b;j++)
		 {
			String s= elements.get(j).getText();
			System.out.print(s+", ");
		 }
		 System.out.println();
		  
		}	*/
	}

}
