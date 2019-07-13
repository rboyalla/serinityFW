package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    HomePage duckDuckGoHomePage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        duckDuckGoHomePage.open();
    }
}
