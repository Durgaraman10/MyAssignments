package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.className("inputLogin")).sendKeys("democsr");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Durga");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raman");
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cts");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leadaccount");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("Page Title is :" +driver.getTitle());
		 driver.close();

}
	
	
}
