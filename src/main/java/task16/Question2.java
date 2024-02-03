package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Launch the URL
		WebDriver driver = new ChromeDriver();
		
   //pass the URL
		driver.navigate().to("https://www.demoblaze.com/");
   
   //Maximize the window
		driver.manage().window().maximize();
		
	//verifies the title of the page
		String ActualTitle = driver.getTitle();
		System.out.println("Title of the page is:"+ActualTitle);
		
		//Compares two strings
		if(ActualTitle.equalsIgnoreCase("STORE")) {
		System.out.println("Page landed on current website");
		}else {
			System.out.println("Page not landed on correct website");
		}
		
		//close the browser window
		driver.close();
	
	}

}
