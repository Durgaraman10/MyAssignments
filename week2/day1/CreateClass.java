package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateClass {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.className("inputLogin")).sendKeys("democsr");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.className("inputBox")).sendKeys("Durga10");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.id("numberEmployees")).sendKeys("10");
		 driver.findElement(By.className("inputBox")).sendKeys("LeafTaps");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("Page Title is :" +driver.getTitle());
		 
		 driver.close();
		 // TODO Auto-generated method stub

	}

}
