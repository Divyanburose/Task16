package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Launch the URL
		WebDriver driver = new ChromeDriver();
		
		//Pass the URL
		driver.navigate().to("https://www.wikipedia.org/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//search for the query
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
		//Select history from search
	  driver.findElement(By.className("vector-toc-text")).click();
	  
	  //Prints the title of the section
	 String ActualText = driver.findElement(By.id("History")).getText();
	 System.out.println("The title is:"+ActualText);

	 //Close browser window
	 //driver.close();
	}

}
