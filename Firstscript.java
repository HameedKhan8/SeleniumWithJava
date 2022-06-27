package firstproject;


import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinition.FashionPhilePageSteps;

import org.openqa.selenium.WebDriver;

public class Firstscript {

	public static void main(String[] args) {

	     
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jawad Khan\\Desktop\\NEW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
	FashionPhilePageSteps.GotoUrl(driver);
	FashionPhilePageSteps.SearchChanelHandBag(driver);
	FashionPhilePageSteps.selectThirdItem(driver);
	FashionPhilePageSteps.addToBag(driver);
	FashionPhilePageSteps.clickOnCheckout(driver);
	FashionPhilePageSteps.goToCheckout(driver);
	FashionPhilePageSteps.enterEmail(driver);
	FashionPhilePageSteps.enterNameAndAdress(driver);
	FashionPhilePageSteps.Checkout(driver);

	}

}
