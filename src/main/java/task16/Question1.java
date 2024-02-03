package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v119.page.Page.NavigateResponse;
import org.openqa.selenium.devtools.v119.page.model.NavigatedWithinDocument;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Launch the browser
		WebDriver driver = new FirefoxDriver();
		
		//pass the URL
		driver.navigate().to("https://www.google.co.in/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//prints the URL of current page
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current url is:"+currenturl);
		
		//reloads the page
		driver.navigate().refresh();
		
		//closes the browser
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
