package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (className = "android.widget.EditText")
	private MobileElement email;
	
	@AndroidFindBy (className = "android.widget.Button")
	private MobileElement btSignInEmail;
	
	@AndroidFindBy (className = "android.widget.EditText")
	private MobileElement senha;
	
	@AndroidFindBy (xpath = "\"android.widget.Button\"")
	private MobileElement btSignInSenha;
	
	public void informaEmail(String str) {
		email.sendKeys(str);
	}
	
	public void informaSenha(String str) {
		senha.sendKeys(str);
	}
	
	public void acionaBotaoSigninEmail() {
		btSignInEmail.click();
	}
	
	public void acionaBotaoSigninSenha() {
		btSignInSenha.click();
	}
	
	
}
