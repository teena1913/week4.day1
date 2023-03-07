package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0z26yihdqx7sopv3l0z1xei3h124712.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> wind = driver.getWindowHandles();
		List<String> vind= new ArrayList<String>(wind);
		driver.switchTo().window(vind.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(vind.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> cc = driver.getWindowHandles();
		List<String> dd= new ArrayList<String>(cc);
		Thread.sleep(2000);
		driver.switchTo().window(dd.get(2));
		driver.close();
		driver.switchTo().window(dd.get(1));
		driver.close();
		driver.switchTo().window(dd.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> ee = driver.getWindowHandles();
		List<String> ff= new ArrayList<String>(ee);
		Thread.sleep(2000);
		driver.switchTo().window(ff.get(3));
		driver.close();
		driver.switchTo().window(ff.get(2));
		driver.close();
		driver.switchTo().window(ff.get(1));
		driver.close();
		driver.switchTo().window(ff.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> gg = driver.getWindowHandles();
		List<String> hh= new ArrayList<String>(gg);
		System.out.println(hh.size());
		Thread.sleep(2000);
		driver.quit();
	}

}
