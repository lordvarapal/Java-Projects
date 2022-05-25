package pageObject;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class TelaInicialPaige extends BasePage {

	

	// Base Page
	public void acessarAbaAdmin() {
		abaAdmin.click();
	}

	// Elements
	@FindBy(name = "btnAdd")
	public WebElement btnAdd;

	public void acionarBotaoAdd() {
		btnAdd.click();
	}

	public void acessarMenuFields() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuFields).click().build().perform();
	}

}
