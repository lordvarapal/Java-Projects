package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObject.LoginPage;

public class Hooks {

	@Before(value = "not @login" )
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("admin", "admin123");
	}

	@Before(value = "@login")
	public void FuncionalidadeLogin() {
		acessarSistema();
	}

	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();

	}

}
