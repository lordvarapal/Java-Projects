package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class LoginSteps {
	
	LoginPage lp = new LoginPage(driver);
	
	@Dado("eu informar email {string}")
	public void euInformarEmail(String email) {
	    lp.informaEmail(email);
	}

	@Dado("apertao botao sign in do email")
	public void apertaoBotaoSignInDoEmail() throws InterruptedException {
		Thread.sleep(1000);
	    lp.acionaBotaoSigninEmail();
	}

	@Dado("informar a senha {string}")
	public void informarASenha(String senha) throws InterruptedException {
		Thread.sleep(2000);
	    lp.informaSenha(senha);
	}

	@Dado("apertao botao sign in da senha")
	public void apertaoBotaoSignInDaSenha() throws InterruptedException {
		Thread.sleep(1000);
	    lp.acionaBotaoSigninSenha();
	}

}
