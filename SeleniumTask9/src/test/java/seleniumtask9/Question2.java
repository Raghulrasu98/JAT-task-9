package seleniumtask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		String actualtitle= driver.getTitle();
		
		String expectedtitle= "STOR" ;
		
		if (actualtitle.equals(expectedtitle)) {
			
			System.out.println("title of the page is verfied as STORE ");
			System.out.println("page landed on the correct website ");
			
		}

			else { System.out.println("page not landed on the correct website");
				
			}
		
		
				

	}

}
