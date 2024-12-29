package stepDefinitions;

import io.cucumber.java.en.*;
import utils.APIClient;
import utils.SecurityUtils;
import org.junit.Assert;

public class BankAPISteps {
    private String responseToken;
    private int responseCode;

    @Given("a valid user requests authentication")
    public void validUserAuthentication() {
        responseToken = APIClient.authenticate("validUser", "validPassword");
        responseCode = APIClient.getLastResponseCode();
    }

    @Then("the response code should be {int}")
    public void verifyResponseCode(int expectedCode) {
        Assert.assertEquals(expectedCode, responseCode);
    }

    @Then("the token should be secure")
    public void verifyTokenSecurity() {
        Assert.assertTrue(SecurityUtils.isTokenSecure(responseToken));
    }

    @Given("a valid token")
    public void validToken() {
        responseToken = APIClient.authenticate("validUser", "validPassword");
        Assert.assertTrue(SecurityUtils.isTokenSecure(responseToken));
    }

    @When("a request for transaction history is made")
    public void requestTransactionHistory() {
        responseCode = APIClient.getTransactionHistory(responseToken);
    }

    @Then("the history should match the user account")
    public void verifyTransactionHistory() {
        Assert.assertTrue(APIClient.isTransactionHistoryValid(responseToken));
    }
}