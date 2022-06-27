package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FashionPhilePageSteps {
	private static WebElement element = null;
	
	public static WebElement GotoUrl(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.get("https://www.fashionphile.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//*[@id=\"cookieFooter\"]/div/button")).click();
		return element;
	}
	public static WebElement SearchChanelHandBag(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("search-input")).sendKeys("Chanel Black handbags");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div[2]/div/div[2]/div/div/form/span/div/button/div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		return element;
	}
	
	public static WebElement selectThirdItem(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      WebElement m=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[4]/div[3]/div"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", m);
	      m.click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		return element;

	}
	
	public static WebElement addToBag(WebDriver driver) {
		driver.findElement(By.cssSelector("#__next > div > div.product_container__QjbIf > div > div.product_productDescription__3uETc.product_col-4__F98R_.product_col-md-4__TSc4E.product_col-sm-12__fOxmt > button")).click();
		return element;
	}
	
	public static WebElement clickOnCheckout(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      WebElement n=driver.findElement(By.xpath("//div//button[contains(text(),'Checkout')]"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);
	      n.click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		return element;
		
	
		
	}
	
	public static WebElement goToCheckout(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[1]/div[3]")).click();
		return element;
	}
	
	public static WebElement enterEmail(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hameedkhan.qa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"stepOneForm\"]/div[2]/button")).click();
		
		return element;
	}
	
	public static WebElement enterNameAndAdress(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"first-name-input-shipping\"]")).sendKeys("Hameed");
		driver.findElement(By.xpath("//*[@id=\"last-name-input-shipping\"]")).sendKeys("Khan");
		
		driver.findElement(By.xpath("//*[@id=\"stepTwoShipping\"]/form/button")).click();
		
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"state-selector-shipping\"]")));
		s.selectByVisibleText("FL");
		driver.findElement(By.xpath("//*[@id=\"address-input-shipping\"]")).sendKeys("2037 SW 3rd Ave");
		driver.findElement(By.xpath("//*[@id=\"city-input-shipping\"]")).sendKeys("Ocala");
		driver.findElement(By.xpath("//*[@id=\"postal-code-input-shipping\"]")).sendKeys("34471-3659");	
		driver.findElement(By.xpath("//*[@id=\"phone-input-shipping\"]")).sendKeys("+121212121212121");
		driver.findElement(By.xpath("//*//*[@id=\"stepTwoShipping\"]/div/button")).click();
	
		return element;
	}
	public static WebElement Checkout(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		        
	      WebElement F=driver.findElement(By.xpath("//*[@id=\"VerifyAddressModalWithSuggestion\"]/div[2]"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", F);
	      F.click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      //driver.findElement(By.xpath("//*[@id=\"stepTwoShipping\"]/div[1]/div[2]/div[3]/button[1]s")).click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      driver.findElement(By.cssSelector("#stepTwoShipping > div.Modal-module_modalContainer__2mt31 > div.Modal-module_modal__3S8XN.Modal-module_md__3xUDl > div.Modal-module_actionContainer__1OynD.Modal-module_modalMD__-kRtV > button.Modal-module_modalButton__oOkwE.Button-module_btn__19wKy.Button-module_lg__2kOKA.Button-module_primary__1bey2.Button-module_on__3iHbw")).click();
	    //*[@id="stepTwoDelivery"]/form/div[4]/button
	    
		return element;
		
	}
	public static WebElement Complimentarygrounddelivery(WebDriver driver) {
		// TODO Auto-generated method stub
	driver.findElement(By.xpath("//*[@id=\"stepTwoDelivery\"]/form/div[4]/button")).click();
		return element;
		
	}
	public static WebElement enterInvalidEmail(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Fail");
		driver.findElement(By.xpath("//*[@id=\"stepOneForm\"]/div[2]/button")).click();
		
		return element;
		
	}
	
	
}
