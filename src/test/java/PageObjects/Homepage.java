package PageObjects;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("http://www.ebay.com/")
public class Homepage {
	@Drone private WebDriver driver;
	
	@FindBy(id="gh-ac" ) private WebElement searchBar;
	@FindBy(id="gh-button") private WebElement searchButton;
	
	public void searchItem(String term){
		searchBar.sendKeys(term);
	}
	
	public void clicksearchButton(){
		searchButton.click();
	}

}
