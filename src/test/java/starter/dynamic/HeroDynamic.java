package starter.dynamic;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyIO;
import org.jruby.runtime.Block;
import org.openqa.selenium.By;

public class HeroDynamic extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
//        $(SearchForm.SEARCH_FIELD).clear();
//        $(SearchForm.SEARCH_FIELD).type(term);
        $(HeroForm.SEARCH_BUTTON).click();

        $(HeroForm.LOADING_FIELD).waitUntilPresent();

        //$(HeroForm.LOADING_FIELD).waitUntilNotVisible();
        
         $(By.id("loading")).waitUntilNotVisible();

        String msg = $(HeroForm.MESSAGE_FIELD).getText();

        System.out.println("starter.search.HeroDynamic.term( ) msg=" + msg);

    }
    
    public String getText(){
        return $(HeroForm.MESSAGE_FIELD).getText();
    }
}
