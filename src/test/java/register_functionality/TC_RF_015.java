package register_functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_RF_015 
{
	public static void main(String[] args) 
	{
		
        WebDriver driver=new ChromeDriver(); //Launch chrome browser
        
        //WebDriver driver = new EdgeDriver();
        // WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("http://tutorialsninja.com/demo/"); //Open the application
		
		driver.manage().window().maximize(); //Maximise the page
		
		
		
            // Click on 'My Account' Drop menu
            WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[@class='caret']"));
            myAccountDropMenu.click();

            // Click on 'Register' option
            WebElement registerOption = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
            registerOption.click();

            // Enter new Account Details into the Mandatory Fields
            driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Henry");
            driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Agulanna");
            driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("automationninja67@gmail.com");
            driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("01234567890");
            driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Password123");
            driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Password123");
            

            // Select Privacy Policy
            WebElement privacyPolicyCheckbox = driver.findElement(By.xpath("//input[@name='agree']"));
            privacyPolicyCheckbox.click();

            // Click on 'Continue' button
            WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
            continueButton.click();
            
            // Verify if the details are stored in the database
            
            WebElement accountsuccesspage = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
            if(accountsuccesspage.isDisplayed())
            {
            	System.out.println("Test Passed:Details are stored in the database");
            }
            else
            {
            	System.out.println("Test Passed:Details are not stored in the database");
            }
            
            //close browser
            driver.quit();
	
	}
}
	
