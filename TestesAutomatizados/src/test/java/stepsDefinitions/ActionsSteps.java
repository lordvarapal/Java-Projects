package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.TelaInicialPaige;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ActionsSteps {

	@Quando("acionar o submenu customField")
	public void acionarOSubmenuCustomField() {
		Na(TelaInicialPaige.class).acessarMenuFields();	 
	}

	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
	   assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
	}
}
