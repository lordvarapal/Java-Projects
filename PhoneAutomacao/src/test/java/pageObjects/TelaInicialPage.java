package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	public TelaInicialPage (AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement btGetStarted;
	
	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
	private MobileElement btNewNote;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Title']")
	private MobileElement btTitle;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Note']")
	private MobileElement btNote;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement btBack;
	
	
	public void acionarBtGetStarted() {
		btGetStarted.click();
	}
	
	public void acionarNovoNote() {
		btNewNote.click();
	}
	
	public void adicionarTitulo(String str) {
		btTitle.sendKeys(str);
	}
	
	public void adicionarNota(String str) {
		btNote.sendKeys(str);
	}
	
	public void acionarBotaoVoltar() {
		btBack.click();
	}

}

/* --- Lógica para XPath ---
 * //tag[@atrubuto='valor']
 * 
 * No caso, para Androide, usa-se pela Class.
 * Neste exemplo, com atributo Text:
 * 
 * //class[@atrubuto='valor']
 * //android.widget.EditText[@text='Title']
 * 
 * */
