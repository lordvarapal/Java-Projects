package pageObject;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	/* Pegando atributo pelo nome (DANDO ERRO)
	 * @FindBy(name = "txtUsername") private WebElement campoUsuario;
	 */

	/* Pegando atributo pelo Xpath
	 * 
	 * @FindBy(linkText = "Forgot your password?")
	 * @FindBy(xpath = "//a[contains(text(),'Forgot')]") 
	 * private WebElement link;
	 * 
	 * Pegando atributo no CSS
	 * @FindBy(css = "//spain[text()=' () private WebElement link;
	 * 
	 */

	@FindBy(xpath = "//a[contains(text(),'Forgot your')]")
	private WebElement link;

	public void informarCampoUsuario(String usuario) {
		// campoUsuario.sendKeys(usuario);
		driver.findElement(By.name("txtUsername")).sendKeys(usuario);
	}

	public void informarCampoSenha(String senha) {
		driver.findElement(By.name("txtPassword")).sendKeys(senha);
	}

	public void acionarBotaoLogin() {
		driver.findElement(By.name("Submit")).click();
	}

	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
}
