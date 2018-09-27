package wizard;

import cucumber.api.java.en.*;
import support.SeleniumHelper;
import support.PropertiesHelper;


public class NavigationSteps {

    private SeleniumHelper helper;
    private PropertiesHelper propHelper;

    public NavigationSteps(SeleniumHelper helper, PropertiesHelper propHelper) {
        this.helper = helper;
        this.propHelper = propHelper;
    }

    @Given("^the wizard is launched$")
    public void theWizardIsLaunched() throws Exception {
        String serverip = propHelper.getProperties("TRHugeCirculation.properties", "serverip");
        helper.getDriver().get("http://admin:Elv1ra!oms@" + serverip + "/elsetupwizard.jsp");
    }

}
