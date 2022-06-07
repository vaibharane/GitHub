package TestPack;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement tryityourself=driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryityourself.click();
		Thread.sleep(2000);
		
		
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		
		String addrofchild=add.get(1);
		
		//driver.getWindowHandles();
		
		driver.switchTo().window(addrofchild);
		Thread.sleep(4000);
		
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(2000);
		

		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryit.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement x=driver.findElement(By.xpath("//a[@id='menuButton']"));
		x.click();

		ArrayList<String> z=new ArrayList<String>(driver.getWindowHandles());
		String b=z.get(0);
		driver.switchTo().window(b);
		

		Thread.sleep(2000);
		
		WebElement css=driver.findElement(By.xpath("//a[text()='CSS']"));
		css.click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert
		
		
		
		
		
	}

}
