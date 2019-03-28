package pages;

import org.openqa.selenium.By;

import core.DriverFactory;

public class SecondPage {

	public String getToast() {
		return DriverFactory.getDriver().findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
	}

	public Boolean elementIsDisplayed() {
		return DriverFactory.getDriver().findElementById("textView").isDisplayed();
	}

}
