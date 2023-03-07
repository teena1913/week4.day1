package week4.day1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	String price  = driver.findElement(By.xpath("//span[text()='48,999']")).getText();
	System.out.println(price);
	 driver.findElement(By.linkText("(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click(); 
	///for handling another window 
	 Set<String> wdh=driver.getWindowHandles();
	 List<String> vvv= new ArrayList<String>(wdh);
	 driver.switchTo().window(vvv.get(1));
	 ///for screenshot
	 File nivi = driver.getScreenshotAs(OutputType.FILE);
		File end = new File("./snap/shot.png");
		FileUtils.copyFile(nivi, end);
		driver.findElement(By.id("add-to-cart-button")).click();
		String cartprice =driver.findElement(By.xpath("//span[text()='48,999']")).getText();
		System.out.println(cartprice);
		if(price.equals(cartprice)) {
			System.out.println("same price");
		}
		else {
			System.out.println("different price");
		}
		driver.close();
		
}
}
