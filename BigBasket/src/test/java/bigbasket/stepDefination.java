package bigbasket;

import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefination extends actionDriver{


	String parentWindow;
	static JSONObject obj;    
	public JSONObject fileRead() throws Exception 
	{
		FileReader reader = new FileReader("src/test/resources/JSONfiles/BigBasket.json");
		JSONParser js = new JSONParser();
		Object obj = js.parse(reader);
		// typecasting obj to JSONObject
		JSONObject jo = (JSONObject) obj;
		return jo;
	}

	@Given("browser is launched")
	public void browser_is_launched() throws Exception 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha_demanna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		obj = fileRead();		
	}

	@Given("user navigates to {string} page")
	public void user_navigates_to_page(String string) 
	{
		String element = (String) obj.get(string);
		driver.get(element);
	}


	@Then("assert {string}")
	public void assert1(String string) 
	{
		String element = (String) obj.get(string);
		assert_element(element);
	}


	@Given("Type product {string} in {string}")
	public void type_product_in(String string, String string2)
	{
		String element = (String) obj.get(string2);
		String value = (String) obj.get(string);

		type( value, element);
	}

	@Given("Click on the {string} element")
	public void click_on_the_element(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Given("Click on {string} with desired product")
	public void click_on_with_desired_product(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Given("assert the {string} in {string}")
	public void assert_the_in(String string, String string2) 
	{
		String expectedText = (String) obj.get(string);
		String element = (String) obj.get(string2);
		assert_text1( element, expectedText);
	}

	@Given("change the quantity to {string} in {string}")
	public void change_the_quantity_to_in(String string, String string2) 
	{
		String quantity = (String) obj.get(string);
		String element = (String) obj.get(string2);
		type( quantity, element);
	}


	@Given("Click on {string}")
	public void click_on(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Given("assert the text {string} in {string}")
	public void assert_the_text_in(String string, String string2) throws InterruptedException 
	{
		String expectedText = (String) obj.get(string);
		String element = (String) obj.get(string2);

		assert_text1( element, expectedText);
	}


	@Given("user navigates to home {string} page")
	public void user_navigates_to_home_page(String string) throws InterruptedException 
	{
		driver.navigate().to("https://www.bigbasket.com/");	
	}	


	@Given("click on the {string}")
	public void click_on_the(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Given("hover to {string} and click")
	public void hover_to_and_click(String string) 
	{
		String element = (String) obj.get(string);
		hoverToElement(element);
	}
	@And("click on {string}")
	public void clickOn(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@And("Click on the {string}")
	public void click_on_the1(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Given("Click on My Basket {string}")
	public void click_on_my_basket(String string) 
	{
		String element = (String) obj.get(string);
		click(element);
	}

	@Then("Click view basket and checkout {string}")
	public void click_view_basket_and_checkout(String string)
	{
		String element = (String) obj.get(string);
		click(element);
	}

}



