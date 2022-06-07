package TestPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Testclass {
	
	
	
	static void date() throws IOException
	{
		
		
        DateFormat format=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date systemdate=new Date();
		
		String d=format.format(systemdate);
		System.out.println(d);
		
		System.out.println("test123"+d);
	
	
		
	}
	public static String getexcelsheetdata(String x,int y,int z) throws EncryptedDocumentException, IOException
	{
		String data;
		
		String path="E:\\New folder\\Demo.xlsx";
		FileInputStream file=new FileInputStream(path);
		Cell cell=WorkbookFactory.create(file).getSheet(x)
		.getRow(y).getCell(z);
		try
		{
			data=cell.getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double d=cell.getNumericCellValue();
			int a=(int)d;
			data=Integer.toString(a);
			
			
		}
		return data;
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		
	/*	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);*/
		

		String data=Testclass.getexcelsheetdata("Sheet1",1, 1);
		System.out.println(data);
		 /* DateFormat format=new SimpleDateFormat("dd-mm-yyyy hh mm ss");
			
			Date systemdate=new Date();
			
			String d=format.format(systemdate);
			System.out.println(d);
			
			System.out.println("test123"+d);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\New folder\\testdate"+ d +".jpeg");
		FileHandler.copy(source, dest);
		
		/*List<WebElement> links=driver.findElements(By.xpath("//a"));
		int size=links.size();
		System.out.println(size);


		for(int i=0;i<size;i++)
		{
			String txt=links.get(i).getAttribute("href");
			System.out.println(i);
			System.out.println(txt);
		}
		
		
		
		
		List<WebElement> images=driver.findElements(By.xpath("//img"));
		int m=images.size();
		System.out.println(m);
		
		for(int x=0;x<m;x++)
		{
			String src=images.get(x).getAttribute("src");
			System.out.println(src);
		}
		
		/*WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement logInbutton=driver.findElement(By.xpath("//button[@value='1']"));
		WebElement createnewAcc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		/*DateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
		Date systemdate=new Date();
		
		String d=df.format(systemdate);
		System.out.println(d);
		Thread.sleep(2000);
		String c="abc";
		//Testclass.date();
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\New folder\\test"+ c +".jpeg");
		FileHandler.copy(source, dest);
		
		String path="E:\\New folder\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		//String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(value);
		
		/*Workbook book=WorkbookFactory.create(file);
		String value1=book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		double numeric=book.getSheet("Sheet1").getRow(6).getCell(1).getNumericCellValue();
		System.out.println(numeric);
		
		Date date=book.getSheet("Sheet1").getRow(7).getCell(1).getDateCellValue();
		System.out.println(date);
		
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet("Sheet1");
	    Row row=sheet.getRow(4);
		Cell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		System.out.println(value);
		
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet("Sheet1");
	    Row row=sheet.getRow(1);
	    int lr=sheet.getLastRowNum();
	    int lc=row.getLastCellNum();
	    System.out.println(lr);
	    System.out.println(lc);
		Cell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		System.out.println(value);
		for(int i=0;i<=lr;i++)
		{
			for(int j=0;j<lc;j++)
			{
				row=sheet.getRow(i);
				cell=row.getCell(j);
				value=cell.getStringCellValue();
				System.out.print(value+",    ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	

		
		/*TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\New folder\\test124.jpeg");
		FileHandler.copy(source, dest);
		
		
		
		
		
	/*	String text=logInbutton.getText();
		System.out.println(text);
		
		String value=user.getAttribute("aria-label");
		System.out.println(value);
		
		user.sendKeys("mock9");
		user.clear();
		Thread.sleep(1000);
		user.sendKeys("grp9");
		password.sendKeys("xyz");
		logInbutton.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		//WebElement user1=driver.findElement(By.xpath("//input[@type='text']"));
		//WebElement password1=driver.findElement(By.xpath("//input[@type='password']"));
		
		createnewAcc.click();
		
		Thread.sleep(2000);
		
		WebElement newpassword=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		WebElement fname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobno=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		fname.sendKeys("umesh");
		surname.sendKeys("vadapure");
		mobno.sendKeys("8237289209");
		newpassword.sendKeys("abc");
		
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select d=new Select(date);
		d.selectByIndex(4);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		//s.selectByIndex(4);
		s.selectByValue("6");
		//s.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByIndex(1);
		
		WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result=male.isSelected();
		System.out.println(result);
		Thread.sleep(2000);
		
		WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		female.click();
		Thread.sleep(1000);
		
		WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		custom.click();
		
		WebElement pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		boolean result1=pronoun.isDisplayed();
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		//Thread.sleep(3000);
		
		/*driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Dimension d=new Dimension(200, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Point p=new Point(500,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
	
		
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		WebElement frame=driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
		
		driver.switchTo().frame(frame);
		
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryit.click();*/
		
		
		
	}

}
