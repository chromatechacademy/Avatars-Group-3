package hooks;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import com.chromatech.Cucumber_BDD_Testing.Constants.screenRecording.ScreenRecorderUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start(Scenario scenario) throws Exception {
        CucumberLogUtils.scenario = scenario;
        WebDriverUtils.setUp();
        PageInitializer.initializeAllPages();
        ScreenRecorderUtil.startRecording(scenario.getName());
    }

    @After
    public void end() throws Exception {
        ScreenRecorderUtil.stopRecording();
        WebDriverUtils.tearDown();
    }
}