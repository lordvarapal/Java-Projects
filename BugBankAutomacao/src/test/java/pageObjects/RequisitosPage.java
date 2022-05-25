package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitosPage {
	
	@FindBy(id = "accordionLogin")
	private WebElement campoLogin;
	
	@FindBy(id = "accordionCadastro")
	private WebElement campoCadastro;
	
	@FindBy(id = "accordionTransferência")
	private WebElement campoTransferencia;
	
	@FindBy(id = "accordionPagamento")
	private WebElement campoPagamento;
	
	@FindBy(id = "accordionExtrato")
	private WebElement campoExtrato;
	
	@FindBy(id = "accordionSaque")
	private WebElement campoSaque;
	
	@FindBy(id = "linkGithub")
	private WebElement linkDoRepositorio;
	
	@FindBy(id = "btnBack")
	private WebElement botaoVoltar;
	
	public void acessarCampoLogin() {
		campoLogin.click();
	}
	public void acessarCampoCadastro() {
		campoCadastro.click();
	}
	public void acessarCampoTransferencia() {
		campoTransferencia.click();
	}
	public void acessarCampoPagamento() {
		campoPagamento.click();
	}
	public void acessarCampoExtrato() {
		campoExtrato.click();
	}
	public void acessarCampoSaque() {
		campoSaque.click();
	}
	public void acessarLinkDoRepositorio() {
		linkDoRepositorio.click();
	}
	public void botaoVoltar() {
		botaoVoltar.click();
	}

}
