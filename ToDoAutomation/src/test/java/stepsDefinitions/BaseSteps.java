package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.BasePage;

public class BaseSteps {
	
	BasePage bp = new BasePage(driver);
	
	@Dado("eu apertar em new list")
	public void euApertarEmNewList() {
	    bp.addNovaLista();
	}

	@Dado("informar o nome da lista {string}")
	public void informarONomeDaLista(String nome) {
	    bp.addNomeLista(nome);
	}

	@Entao("Valida lista criada")
	public void validaListaCriada() {
	    assertEquals("Teste", driver.findElement(By.className("com.microsoft.todos:id/name_background")).getText());
	}
	
	@Dado("que eu aperto em +")
	public void queEuApertoEm() {
	    bp.botaoAdicionarLista();
	}

	@Dado("informo o item a adiconar a lista {string}")
	public void informoOItemAAdiconarALista(String item) {
	    bp.adicionarItemLista(item);
	}

	@E("^Aperto em salvar na lista$")
	public void apertoEmSalvarNaLista() throws Throwable {
		bp.salvarItemLista();
	}

	@Entao("o item esta salvo na lista")
	public void oItemEstaSalvoNaLista() {
	    assertEquals("item", driver.findElement(By.className("com.microsoft.todos:id/task_title")).getText());
	}
	
	@Dado("que eu entro na lista")
	public void queEuEntroNaLista() {
	    bp.entrarLista();
	}

	@Dado("aperto em cima de Teste")
	public void apertoEmCimaDeTeste() {
	    bp.clicarNomeDaLista();
	}

	@Dado("modifico o nome da lista para {string}")
	public void modificoONomeDaListaPara(String nome) {
	    bp.trocarNomeDaLista(nome);
	}

	@Entao("entao salvo a lista")
	public void entaoSalvoALista() {
	    bp.salvarItemLista();
	}

	@Dado("encontrar o item")
	public void encontrarOItem() {
	    bp.deletadrItenSelecionado();
	}

	@Dado("aperta nos ...")
	public void apertaNos() {
	   bp.clicarNos3Pontinhos();
	}

	@Entao("aperta em delete task")
	public void apertaEmDeleteTask() {
	    bp.deletarItemDaLista();
	}

	@Dado("aperta em delete list")
	public void apertaEmDeleteList() {
	    bp.deletarLista();
	}

	@Dado("confirma deletar a lista")
	public void confirmaDeletarALista() {
	    bp.confirmaDeletarItemDaLista();
	}

	@Entao("valida o delete")
	public void validaODelete() {
	    assertEquals("Teste", driver.findElement(By.xpath("//com.microsoft.todos:id/list_name[@text='Teste']")).getText());
	}

	@Entao("^confirma delete task$")
	public void confirmaDeleteTask() throws Throwable {
		bp.confirmaDeletarLista();
	}


}
