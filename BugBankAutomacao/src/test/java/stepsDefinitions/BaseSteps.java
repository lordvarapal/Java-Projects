package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;

public class BaseSteps {

	@Quando("acionar o botao do extrato")
	public void acionarOBotaoDoExtrato() {
		Na(BasePage.class).botaoExtrato();
	}

	@Quando("ver saldo disnponivel")
	public void verSaldoDisnponivel() {
		assertEquals("Saldo disponível", driver.findElement(By.xpath("//div[@class='bank-statement__ContainerBalance-sc-7n8vh8-9 dntobx']/p[1]")).getText());
	}

	@Entao("clicar em voltar")
	public void clicarEmVoltar() {
	    Na(BasePage.class).botaoVoltar();
	}
	
	@Quando("acionar o botao pagamentos")
	public void acionarOBotaoPagamentos() {
	    Na(BasePage.class).botaoPagamentos();
	}

	@Quando("validar desenvolvimento")
	public void validarDesenvolvimento() throws InterruptedException {
		Thread.sleep(1000);
	    assertEquals(true, driver.findElement(By.id("btnCloseModal")).isDisplayed());
	}

	@Entao("fechar a aba funcionalidade em desenvolvimento")
	public void fecharAAbaFuncionalidadeEmDesenvolvimento() throws InterruptedException {
		Thread.sleep(1000);
		 Na(BasePage.class).botaoFechar();
		 
	}

	@Quando("^acionar o botao saque$")
	public void acionarOBotaoSaque() throws Throwable {
		 Na(BasePage.class).botaoSaque();
	}
	
	@Quando("informar o numero da conta {string}")
	public void informarONumeroDaConta(String conta) {
		 Na(BasePage.class).informarNumeroConta(conta);
	}

	@Quando("informar o digiot da conta {string}")
	public void informarODigiotDaConta(String digito) {
		 Na(BasePage.class).informarDigitoConta(digito);
	}

	@Quando("informar o valor da transferencia {string}")
	public void informarOValorDaTransferencia(String valor) {
		 Na(BasePage.class).valorDaTransferencia(valor);
	}

	@Quando("a descricao {string}")
	public void aDescricao(String descricao) {
		 Na(BasePage.class).descricaoDaTransferencia(descricao);
	}

	@Quando("clicar no botao transferir agora")
	public void clicarNoBotaoTransferirAgora() {
		 Na(BasePage.class).botaoConcluiTranferencia();
	}

	@Entao("o pagamento e realizado")
	public void oPagamentoRealizado() throws InterruptedException {
		Thread.sleep(1000);
		Na(BasePage.class).botaoFechar();
	}

	@Quando("^clicar na tranferencia$")
	public void clicarNaTranferencia() throws Throwable {
		Na(BasePage.class).botaoTransferencia();
	}

	@Entao("^deslogar dos sistemas$")
	public void deslogarDosSistemas() throws Throwable {
		Thread.sleep(1000);
		Na(BasePage.class).botaoSair();
	}

}
