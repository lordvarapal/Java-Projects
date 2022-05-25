package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.RequisitosPage;

public class RequisitosSteps {
	
	@Quando("eu clicar no conheca nossos requisitos")
	public void euClicarNoConhecaNossosRequisitos() throws InterruptedException {
		Na(LoginPage.class).hiperLinkRequisitos();
	}

	@Quando("clicar login")
	public void clicarLogin() {
		Na(RequisitosPage.class).acessarCampoLogin();
	}

	@Quando("clicar cadastro")
	public void clicarCadastro() {
		Na(RequisitosPage.class).acessarCampoCadastro();
	}

	@Quando("clicar transferencia")
	public void clicarTransferencia() {
		Na(RequisitosPage.class).acessarCampoTransferencia();
	}

	@Quando("clicar pagamento")
	public void clicarPagamento() {
		Na(RequisitosPage.class).acessarCampoPagamento();
	}

	@Quando("clicar extrato")
	public void clicarExtrato() {
		Na(RequisitosPage.class).acessarCampoExtrato();
	}

	@Quando("clicar saque")
	public void clicarSaque() {
		Na(RequisitosPage.class).acessarCampoSaque();
	}

	@Quando("acessar o repositorio")
	public void acessarORepositorio() {
		Na(RequisitosPage.class).acessarLinkDoRepositorio();
	}

	@Entao("voltar para pagina inicial")
	public void voltarParaPaginaInicial() {
		Na(RequisitosPage.class).botaoVoltar();
	}


}
