package seleniumtask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='History']")).click();
		
		Thread.sleep(2000);
		
        System.out.println(driver.getTitle());

	}

}
