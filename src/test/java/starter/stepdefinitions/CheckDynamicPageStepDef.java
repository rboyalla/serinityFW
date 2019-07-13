package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.dynamic.SearchFor;
import starter.dynamic.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;
import starter.dynamic.HeroDynamic;

public class CheckDynamicPageStepDef {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Steps
    HeroDynamic heroDynamic;

    @Given("^(?:.*) is on the Hero home page$")
    public void i_am_on_the_Hero_home_page() {
        navigateTo.theDuckDuckGoHomePage();
    }

   // @When("^S?he (?:searches|has searched) for \"(.*)\"")
     @When("^(?:She|He) (?:searches|has searched) for \"(.*)\"$")
    public void i_search_for(String term) {
        heroDynamic.term(term);
        //searchFor.term(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String expectedTerm) {
        String msg = heroDynamic.getText();
        assertThat(msg).as(expectedTerm);
    }
}
