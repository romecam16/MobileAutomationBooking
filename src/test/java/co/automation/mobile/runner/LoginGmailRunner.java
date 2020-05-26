package co.automation.mobile.runner;

import co.automation.mobile.steps.login.LoginGmailStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginGmailRunner {
  @Steps LoginGmailStep loginGmailStep;

  @Test
  public void testLoginGmail() {
    loginGmailStep.loginWithGmail("Camilo test");
  }
}
