package logic.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;

public class ConfigurarWebDriver {

    @BeforeClass
    public static void useChromeDriver()
        {
            WebDriverManager.chromedriver().setup();
        }

}
