package co.automation.mobile.steps.login;

import co.automation.mobile.pages.login.LogInGmailPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class LoginGmailStep extends ScenarioSteps {
  @Page LogInGmailPage logInGmailPage;

  @Step
  public void loginWithGmail(String name) {
    logInGmailPage.selectLoginGmail();
    logInGmailPage.selectGmailAccount(name);
  }
}
