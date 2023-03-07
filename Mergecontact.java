package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mergecontact {

	public static void main(String[] args)  {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       driver.findElement(By.linkText("Create Contact")).click();
	       driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	       driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("10595");
	      driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("10596");
	      driver.findElement(By.className("buttonDangerous")).click();
	      Alert alert=driver.switchTo().alert();
	      alert.accept();
	      System.out.println(driver.getTitle());
	}

}
