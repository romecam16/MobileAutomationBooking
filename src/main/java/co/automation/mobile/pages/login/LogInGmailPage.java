package co.automation.mobile.pages.login;

import co.automation.mobile.pages.PageObjectMobile;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class LogInGmailPage extends PageObjectMobile {

  @FindBy(xpath = "//android.widget.Button[@text = 'Continuar con Google']")
  WebElementFacade btnLoginGmail;

  public LogInGmailPage() {
    super();
  }

  public void selectLoginGmail() {
    btnLoginGmail.waitUntilVisible().waitUntilClickable().click();
  }

  public void selectGmailAccount(String name) {
    getDriver().findElement(By.xpath("//android.widget.TextView[@text ='" + name + "']")).click();
  }
}