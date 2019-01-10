package stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    public HomePageSteps() {

    }

    @Given(("^I have a website (.*?)$"))
    public void i_have_website_url(String url)
    {

    }

    @When("^I open the website$")
    public void iOpenTheWebsite() {
    }

    @Then("^I see (.*?) on the home page$")
    public void iSeeHeaderOnTheHomePage(String header) {
    }
}
