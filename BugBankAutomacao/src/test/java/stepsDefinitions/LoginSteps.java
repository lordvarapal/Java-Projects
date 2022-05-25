package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String email) {
	    Na(LoginPage.class).informarEmail(email);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).informarSenha(senha);
	}

	@Quando("clicar no botao loguin")
	public void clicarNoBotaoLoguin() throws InterruptedException {
		sleep(1000);
	    Na(LoginPage.class).botaoAcessar();
	}

	@Entao("o sistema informa a mensagem {string}")
	public void oSistemaInformaAMensagem(String string) {
	    assertEquals(string, driver.findElement(By.id("textName")).getText());
	}

	@Entao("^o sistema informa a mensagem invalida\"([^\"]*)\"$")
	public void oSistemaInformaAMensagemInvalida(String invalido) throws Throwable {
		assertEquals(invalido, driver.findElement(By.id("modalText")).getTagName());
	}
	
	
	/*PARTE DE CADASTRO*/
	@Quando("eu clicar em registrar")
	public void euClicarEmRegistrar() {
	    Na(LoginPage.class).botaoRegistrar();
	}

	@Quando("informar email {string}")
	public void informarEmail(String email)  {
		Na(LoginPage.class).cadastrarEmail(email);
	}

	@Quando("infomar nome {string}")
	public void infomarNome(String nome)  {
		Na(LoginPage.class).informarNome(nome);
	}

	@Quando("informar senha {string}")
	public void informarSenha(String senha)  {
		Na(LoginPage.class).cadastrarSenha(senha);
	}

	@Quando("confirmar senha {string}")
	public void confirmarSenha(String senha) {
		Na(LoginPage.class).confirmarSenha(senha);
	}

	@Quando("aperto em cadastrar")
	public void apertoEmCadastrar() {
		Na(LoginPage.class).botaoCadastrar();
	}

	@Entao("confirmo cadastro")
	public void confirmoCadastro() throws InterruptedException {
		sleep(1000);
		Na(LoginPage.class).botaoFechar();
	}

	@E("^Crio com saldo$")
	public void crioComSaldo() throws InterruptedException {
		sleep(1000);
		Na(LoginPage.class).acionarSwitch();
	}
	
}
