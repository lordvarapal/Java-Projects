package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	public BasePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(className = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement novaLista;

	@AndroidFindBy(className = "com.microsoft.todos:id/edit_text")
	private MobileElement nomeLista;

	@AndroidFindBy(className = "android:id/button1")
	private MobileElement btCriaLista;

	@AndroidFindBy(className = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement btAddItem;

	@AndroidFindBy(className = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement nomeItem;

	@AndroidFindBy(className = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement saveItens;

	@AndroidFindBy(xpath = "//com.microsoft.todos:id/list_name[@text='Teste']")
	private MobileElement entrarLista;

	@AndroidFindBy(className = "com.microsoft.todos:id/name_background")
	private MobileElement clickName;

	@AndroidFindBy(className = "com.microsoft.todos:id/edit_text")
	private MobileElement trocarNome;

	@AndroidFindBy(className = "android:id/button1")
	private MobileElement saveNewName;

	@AndroidFindBy(xpath = "//com.microsoft.todos:id/task_title[@text='item']")
	private MobileElement itenDelete;

	@AndroidFindBy(className = "android.widget.ImageView")
	private MobileElement pontinhos;

	@AndroidFindBy(className = "com.microsoft.todos:id/title")
	private MobileElement deleteTask;
	
	@AndroidFindBy(className = "android:id/button1")
	private MobileElement confirmaDeleteTask;
	
	@AndroidFindBy(className = "com.microsoft.todos:id/title")
	private MobileElement deleteList;
	
	@AndroidFindBy(className = "android.widget.Button")
	private MobileElement confirmaDeleteList;
	

	
	public void addNovaLista() {
		novaLista.click();
	}

	public void addNomeLista(String nome) {
		nomeLista.sendKeys(nome);
	}

	public void criarLista() {
		btCriaLista.click();
	}

	public void botaoAdicionarLista() {
		btAddItem.click();
	}

	public void adicionarItemLista(String nome) {
		nomeItem.sendKeys(nome);
	}

	public void salvarItemLista() {
		saveItens.click();
	}

	public void entrarLista() {
		entrarLista.click();
	}

	public void clicarNomeDaLista() {
		clickName.click();
	}

	public void trocarNomeDaLista(String nome) {
		trocarNome.clear();
		trocarNome.sendKeys(nome);
	}

	public void salvarATrocaDeNome() {
		saveNewName.click();
	}

	public void deletadrItenSelecionado() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(itenDelete).perform();
	}

	public void clicarNos3Pontinhos() {
		pontinhos.click();
	}

	public void deletarItemDaLista() {
		deleteTask.click();
	}
	public void confirmaDeletarItemDaLista() {
		confirmaDeleteTask.click();
	}
	
	public void deletarLista() {
		deleteList.click();
	}
	public void confirmaDeletarLista() {
		confirmaDeleteList.click();
	}

}
