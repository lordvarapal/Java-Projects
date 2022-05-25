package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
		
	@FindBy(linkText = "Admin")
	public WebElement abaAdmin;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement abaPim;
	
	@FindBy(id = "menu_pim_Configuration")
	public WebElement menuConfiguration;
	
	@FindBy(id = "menu_pim_listCustomFields")
	public WebElement menuFields;
	
	
	
	
	
}
