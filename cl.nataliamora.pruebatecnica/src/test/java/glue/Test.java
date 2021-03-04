package glue;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test {
	
	WebDriver driver;
	
	//Abrir la ventana de chrome entrando directo a la página de www.google.com
	
	@Given("^The user is on url https://www\\.google\\.com$")
	public void the_user_is_on_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    
	   
	}
	
	//Realizamos la búsqueda
	
	@When("^The user enters the word \"([^\"]*)\"$")
	public void the_user_enters_the_word(String arg1) throws Throwable{
		driver.findElement(By.name("q")).sendKeys("tokio");
		
	}
		
	@When("clicks \"Buscar en Google\"")
	public void click_search(){
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).sendKeys(Keys.ENTER);
		
		
	}
	
	//Muestra de resultados
	   
	@Then("^The user should be able to see the results for \"([^\"]*)\"$")
	public void see_the_results_for(String arg1) throws Throwable {
		driver.findElement(By.xpath("div[@class=\"hdtb-mitem hdtb-msel\"]")).getText();
		System.out.println("Results for Tokio");
	    
	    
	}
	
	/*@Given("^The user is on the google results page for \"([^\"]*)\"$")
	public void google_results_page_for(String arg1) throws Throwable {
	} */
	
	//Buscamos imágenes

	@When("^The user clicks on \"([^\"]*)\" link at the top of results page$")
	public void clicks_on_link(String arg1) throws Throwable {
		driver.findElement(By.xpath("a[@class=\"hide-focus-ring\"]")).click();
	    
	}
	
	

	@Then("^The user should be able to see \"([^\"]*)\" related images$")
	public void see_related_images(String arg1) throws Throwable {
		driver.findElement(By.xpath("html/body")).getText();
		
	    
	   
	}
	
}
