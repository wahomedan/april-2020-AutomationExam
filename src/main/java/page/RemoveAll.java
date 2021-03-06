package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAll extends BasePage {
WebDriver driver;
	
	public RemoveAll(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "allbox") WebElement TOOGLE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"and@value=\"Remove\" ]") WebElement REMOVE_FIELD_LOCATOR;
	
	
	//Interactive Methods
	public void clickOnToggleall() {
		TOOGLE_FIELD_LOCATOR.click();
	}

	public void clickOnRemove() {
		REMOVE_FIELD_LOCATOR.click();
		
	}
}
