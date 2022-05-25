package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Quando("^acionar o botao de novo Note$")
	public void acionarOBotaoDeNovoNote() throws Throwable {
		telaInicial.acionarNovoNote();
	}
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() {
	    telaInicial.acionarBtGetStarted();
	}
	@Quando("informar no campo title {string}")
	public void informarNoCampoTitle(String string) {
	    telaInicial.adicionarTitulo(string);
	}

	@Quando("informar no campo note {string}")
	public void informarNoCampoNote(String string) {
		telaInicial.adicionarNota(string);
	}

	@Quando("acionar o botao voltar")
	public void acionarOBotaoVoltar() {
		telaInicial.acionarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String string) {
	    assertEquals(string, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());
	}
	

}
