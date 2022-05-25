package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastararUsuarioPage {
	
	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployer;

	@FindBy(id = "systemUser_userName")
	public WebElement campoUsername;

	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;

	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmPassword;

	@FindBy(name = "btnSave")
	public WebElement botaoSalvar;
	
	public void informarCampoEmployerName(String str) {
		campoEmployer.clear();
		campoEmployer.sendKeys(str);
	}

	public void informarCampoUserName(String str) {
		campoUsername.clear();
		campoUsername.sendKeys(str);
	}

	public void informarCampoPassword(String str) {
		campoPassword.clear();
		campoPassword.sendKeys(str);
	}

	public void informarCampoConfirmaPassword(String str) {
		campoConfirmPassword.clear();
		campoConfirmPassword.sendKeys(str);

	}

	public void clicarBotaoSalvar() {
		botaoSalvar.click();
	}

}
