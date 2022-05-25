package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(id = "btn-TRANSFERÊNCIA")
	private WebElement botaoTransferencia;
	
	@FindBy(id = "btn-PAGAMENTOS")
	private WebElement botaoPagamentos;
	
	@FindBy(id = "btn-EXTRATO")
	private WebElement botaoExtrato;
	
	@FindBy(id = "btn-SAQUE")
	private WebElement botaoSaque;
	
	@FindBy(id = "btnCloseModal")
	private WebElement botaoFechar;
	
	@FindBy(id = "btnBack")
	private WebElement botaoVoltar;
	
	@FindBy(name = "accountNumber")
	private WebElement numeroConta;
	
	@FindBy(name = "digit")
	private WebElement digitoConta;
	
	@FindBy(name = "transferValue")
	private WebElement valorTransferencia;
	
	@FindBy(name = "description")
	private WebElement descricaoTransferencia;
	
	@FindBy(xpath = "//button")
	private WebElement butaoConclusao;
	
	@FindBy(id = "btnExit")
	private WebElement botaoSair;
	
	
	
	public void botaoTransferencia() {
		botaoTransferencia.click();
	}
	
	public void botaoPagamentos() {
		botaoPagamentos.click();
	}
	
	public void botaoExtrato() {
		botaoExtrato.click();
	}
	
	public void botaoSaque() {
		botaoSaque.click();
	}
	
	public void botaoFechar() {
		botaoFechar.click();
	}
	
	public void botaoVoltar() {
		botaoVoltar.click();
	}
	
	public void informarNumeroConta(String conta) {
		numeroConta.sendKeys(conta);
	}
	
	public void informarDigitoConta(String digito) {
		digitoConta.sendKeys(digito);
	}
	
	public void valorDaTransferencia(String valor) {
		valorTransferencia.sendKeys(valor);
	}
	
	public void descricaoDaTransferencia(String descricao) {
		descricaoTransferencia.sendKeys(descricao);
	}
	
	public void botaoConcluiTranferencia() {
		butaoConclusao.click();
	}
	
	public void botaoSair() {
		botaoSair.click();
	}
}
