package sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PERSONAL\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.molconsolidation.com/QASTARlink/");
		driver.manage().window().maximize();
		
		
		
		By id = By.id("txtPassword");
		By pass = By.id("txtPassword");
		By btnlogin = By.id("btnLogin");
		By list1 = By.id("lbConsigneeList");
		
		driver.findElement(id).sendKeys("belkshp");
		driver.findElement(pass).sendKeys("BELKSHP31");
		driver.findElement(btnlogin).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);	//
		WebElement list = wait.until(ExpectedConditions.visibilityOfElementLocated(list1));
		list.findElement(By.xpath("//option[contains(text(),'BURLINGTON COAT FACTORY WAREHOUSE')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("rbContinue")).click();
		
	}

}
