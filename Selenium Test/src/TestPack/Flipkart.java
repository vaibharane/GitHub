package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement mobno=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LogIn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		mobno.sendKeys("8237289209");
		password.sendKeys("vr411996");
		LogIn.click();
		Thread.sleep(1000);
		WebElement vaibhav=driver.findElement(By.xpath("//div[text()='Vaibhav']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(vaibhav).perform();
		WebElement myprofile=driver.findElement(By.xpath("//a[@class='_2kxeIr']"));
		
		a.moveToElement(myprofile).perform();
		a.click().perform();
		
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/account/?rd=0&link=home_account"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
		vaibhav=driver.findElement(By.xpath("//div[text()='Vaibhav']"));
		a.moveToElement(vaibhav).perform();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//div[text()='Logout']"));
		a.moveToElement(logout).click().build().perform();
		
		//2nd test case
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		 mobno=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		 password=driver.findElement(By.xpath("//input[@type='password']"));
		 LogIn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		
		mobno.sendKeys("8237289209");
		password.sendKeys("vr411996");
		LogIn.click();
		Thread.sleep(1000);
		WebElement contactus=driver.findElement(By.xpath("//a[text()='Contact Us']"));

		contactus.click();
		String url1=driver.getCurrentUrl();
		if(url1.equals("https://www.flipkart.com/helpcentre?otracker=undefined_footer_navlinks/"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		vaibhav=driver.findElement(By.xpath("//div[text()='Vaibhav']"));
		a.moveToElement(vaibhav).perform();
		//WebElement logout=driver.findElement(By.xpath("//div[text()='Logout']"));
		logout=driver.findElement(By.xpath("//div[text()='Logout']"));
		a.moveToElement(logout).click().build().perform();
		
		/*WebElement Mobiles=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
		WebElement cart=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		WebElement search=driver.findElement(By.xpath("//input[contains(@title,'Search for products')]"));
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	   /* WebElement viewall=driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[1]"));
		WebElement microphone=driver.findElement(By.xpath("//a[@title='Upto 70% Off']//div[3]"));
		
		viewall.click();
		Thread.sleep(1000);
		microphone.click();
		
		/*WebElement img=driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[2]"));
		Thread.sleep(2000);
		
		img.click();*/
		
		
		//Mobiles.click();
		Thread.sleep(1000);
		/*cart.click();
		Thread.sleep(1000);
		search.sendKeys("laptop");
		Thread.sleep(1000);
		searchbutton.click();
		Thread.sleep(4000);
		
		
		WebElement price=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
		price.click();*/
		
		
		
		
		
		
	}

}
