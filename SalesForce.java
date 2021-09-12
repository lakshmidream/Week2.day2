package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("LastName");
		driver.findElement(By.name("UserEmail")).sendKeys("test@gmail.com");
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select jobTitleobj=new Select(jobTitle);
		jobTitleobj.selectByIndex(2);
		
		driver.findElement(By.name("CompanyName")).sendKeys("KekranMekran");
		WebElement compEmp = driver.findElement(By.name("CompanyEmployees"));
		Select comEmpObj=new Select(compEmp);
		comEmpObj.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']//following-sibling::div")).click();
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countryObj=new Select(country);
		countryObj.selectByVisibleText("United States");
		countryObj.selectByVisibleText("United States");
		
		
		WebElement state = driver.findElement(By.name("CompanyState"));
		Select stateobj=new Select(state);
		stateobj.selectByValue("MT");
		
		
		
		

	}

}
