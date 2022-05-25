package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.CadastararUsuarioPage;
import pageObject.TelaInicialPaige;

public class CadastrarUsuarioSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		Na(TelaInicialPaige.class).acessarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPaige.class).acionarBotaoAdd();
	}

	@Quando("informar no campo emplyer name {string}")
	public void informarNoCampoEmplyerName(String str) {
	    Na(CadastararUsuarioPage.class).informarCampoEmployerName(str);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String str) {
	    Na(CadastararUsuarioPage.class).informarCampoUserName(str);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String str) {
	    Na(CadastararUsuarioPage.class).informarCampoPassword(str);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String str) {
		Na(CadastararUsuarioPage.class).informarCampoConfirmaPassword(str);	   
	}
	
	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		Na(CadastararUsuarioPage.class).clicarBotaoSalvar();
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String str) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='"+str+"']")).isDisplayed());
	}	
	
}
