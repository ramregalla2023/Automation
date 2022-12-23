package javawithseleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumclass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramre\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Register.html");
         driver.manage().window().maximize();
         
         //Tag and attribute(for first and last name)
         driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Ram");
         driver.findElement(By.cssSelector("input[ng-model=LastName]")).sendKeys("regalla");
        
         //Tag name
         //driver.findElement(By.tagName("textarea")).sendKeys("Hyderabad");
        
         //Tag and attribute
         driver.findElement(By.cssSelector("textarea[ng-model=Adress]")).sendKeys("Hyderabad");
         
         
         
         //driver.findElement(By.id("checkbox3")).click();
         
       //driver.findElement(By.className("form-control ng-pristine ng-untouched ng-valid")).sendKeys("Ram@123");
         
        // driver.findElement(By.id("firstpassword")).sendKeys("ram1");
        //driver.findElement(By.id("secondpassword")).sendKeys("ram1");
         
        
        /* Select listbox=new Select(driver.findElement(By.id("yearbox")));
         listbox.selectByValue("1931");
         Select listbox1=new Select(driver.findElement(By.id("Skills")));
         listbox1.selectByValue("Python");*/
         
         
	}

}
