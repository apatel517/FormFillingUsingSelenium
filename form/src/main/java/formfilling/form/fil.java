package formfilling.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		    WebDriver driver = new ChromeDriver();
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Asad");
			driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
			driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("1234 patel street");
			driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Desplaines");
			driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Illinois");
			driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("60016");
			driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("7731234567");
			driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("123-45-6789");
			driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("apatel1234");
			driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("patel123");
			driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("patel123");
			driver.findElement(By.xpath("//input[@value='Register']")).click();
		
			String at = driver.findElement(By.xpath("//h1[@class='title']")).getText();
			System.out.println(at);
			
			if (at.equals(at))
			{
				System.out.println("TEST SUCCESSFULL");
			}
			else
			{
				System.out.println("TEST FAILED");
			}
			driver.quit();
			
	}

}
