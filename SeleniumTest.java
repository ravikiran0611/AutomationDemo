package automationPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		WebElement searchbox = Driver.findElement(By.name("q"));
		searchbox.sendKeys("Apple iPhone 15 Pro Max (Natural Titanium, 1 TB");
		searchbox.submit();
		
		String mainpage = Driver.getWindowHandle();
		System.out.println("main page="+ mainpage);
		
		Driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Set<String> allpages= Driver.getWindowHandles();
		for(String page : allpages) {
			if(!page.equals(allpages)) {
				Driver.switchTo().window(page);
				break;
			}
		}
		
		System.out.println(Driver.getCurrentUrl());
		Driver.quit();

	}

}
