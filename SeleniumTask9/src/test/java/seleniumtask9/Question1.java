package seleniumtask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjP3KjU5YSPAxUWV2wGHQRhEjoQPAgI");	
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
