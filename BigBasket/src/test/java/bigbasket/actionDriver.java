package bigbasket;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actionDriver 
{

	static WebDriver driver;
	final int duration = 10;


	public void assert_element(String element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));

	}

	public void type(String value, String element)
	{
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement webElement = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        webElement.clear();
        webElement.sendKeys(value);

	}

	public void click(String element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement webElement = w.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
        webElement.click();
	}

	public void assert_text1(String element,String expectedText)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement webElement = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		String actualText = webElement.getText();
		Assert.assertEquals(actualText ,expectedText);
	}

	public void hoverToElement(String element)
	{
		Actions a = new Actions(driver);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement bevreges = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		a.moveToElement(bevreges).click().perform();
	}
	
	

	
	
}
