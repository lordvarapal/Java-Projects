package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.LoginPage;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
		
	LoginPage lp = new LoginPage(); 
	/*  Não precisa mais do LoginPage,
	 * pois estou utilizando o metodo do Utils "Na" */
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);	   
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	   Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	   lp.acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials",driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("Welcome Admin",driver.findElement(By.id("welcome")).getText());
	}

}