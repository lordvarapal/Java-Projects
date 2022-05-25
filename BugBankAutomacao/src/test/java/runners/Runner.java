package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
//		tags = "@login1",
		snippets = SnippetType.CAMELCASE,	//Gerar os metodos sem espaçamento
		monochrome = true,
		dryRun = false	/* True = nao abre o navegador / False = abre navegador(Padrao) */
		)

public class Runner {

}
