package week2.day2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']//following::a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SEP12");
		driver.findElement(By.name("lastname")).sendKeys("sep11lastname");
		driver.findElement(By.xpath("//div[@id='fullname_error_msg']//following::input[1]")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		driver.findElement(By.xpath("//div[text()='Re-enter email address']//following-sibling::input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//label[text()='Female']//following-sibling::input")).click();
		
		WebElement dOBDay = driver.findElement(By.id("day"));
		Select dropdownDate=new Select(dOBDay);
		dropdownDate.selectByVisibleText("7");
		
		WebElement dobMonth = driver.findElement(By.id("month"));
		Select  dateOfBirthMonth=new Select(dobMonth);
		dateOfBirthMonth.selectByIndex(6);
		
		WebElement dobYear = driver.findElement(By.id("year"));
		Select dateOfBirthYear=new Select(dobYear);
		dateOfBirthYear.selectByValue("1986");
		
		
		
	}

}
