package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//div[@class='login__buttons']/button[@type='submit']")
	private WebElement botaoAcessar;
	
	@FindBy(xpath = "//div[@class='login__buttons']/button[@type='button']")
	private WebElement botaoRegistrar;
	
	@FindBy(xpath = "(//*[@name=\"email\"])[1]")
	private WebElement cadastraEmail;
	
	@FindBy(name = "name")
	private WebElement campoNome;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input")
	private WebElement cadastraSenha;
	
	@FindBy(name = "passwordConfirmation")
	private WebElement confirmarSenha;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button")
	private WebElement botaoCadastrar;
	
	@FindBy(id = "btnCloseModal")
	private WebElement botaoFechar;
	
//	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[6]/label/span")
	@FindBy(id = "toggleAddBalance")
	private WebElement switchSaldo;
	
	
	@FindBy(xpath = "//a[@href='/requirements']")
	private WebElement requisitos;
	
	public void informarEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void informarSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void botaoAcessar() {
		botaoAcessar.click();
	}
	
	public void botaoRegistrar() {
		botaoRegistrar.click();
	}
	
	public void informarNome(String nome) {
		campoNome.sendKeys(nome);
	}
	
	public void confirmarSenha(String senha) {
		confirmarSenha.sendKeys(senha);
	}
	
	public void botaoCadastrar() {
		botaoCadastrar.click();
	}
	
	public void botaoFechar() {
		botaoFechar.click();
	}
	
	public void cadastrarEmail(String email) {
		cadastraEmail.sendKeys(email);;
	}
	
	public void cadastrarSenha(String senha) {
		cadastraSenha.sendKeys(senha);;
	}
	
	public void acionarSwitch(){
		switchSaldo.click();
	}
	
	
	public void hiperLinkRequisitos() {
		requisitos.click();
	}

}
