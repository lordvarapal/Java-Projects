package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculadoraPage {

	

	public CalculadoraPage (AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id = "com.android.calculator2:id/digit_6")
	private MobileElement tecla6;
	
	@AndroidFindBy(id = "com.android.calculator2:id/op_add")
	private MobileElement mais;
	

	public void digitar2() {	
		tecla6.click();
	}

	
	public void acionarTeclaMais() {
		mais.click();		
	}

	
	public void pegarResultado() {

//		MobileElement elresultado = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
//		elresultado.click();
	}
}
