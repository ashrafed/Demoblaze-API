package Base;

import Auth.Authentication;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected SHAFT.API api;
    protected Authentication authentication;

    public static final String BaseUrl = System.getProperty("BaseUrl");

    @BeforeClass
    public void BeforeClass() {
        api = new SHAFT.API(BaseUrl);
        authentication = new Authentication(api);
    }
}
