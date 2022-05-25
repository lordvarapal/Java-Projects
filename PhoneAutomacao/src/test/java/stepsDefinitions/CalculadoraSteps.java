package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;
import static utils.Utils.*;

public class CalculadoraSteps {
	
	CalculadoraPage calc = new CalculadoraPage(driver);
	
	@Quando("digitar o numero {string}")
	public void digitarONumero(String string) {
		calc.digitar2();
	    
	}

	@Quando("acionar a tecla soma")
	public void acionarATeclaSoma() {
		calc.acionarTeclaMais();
	    
	}

	@Entao("a calculadora exibe o resultado {string}")
	public void aCalculadoraExibeOResultado(String resultado) {
//		assertEquals(Integer.parseInt(resultado), (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	}
}
