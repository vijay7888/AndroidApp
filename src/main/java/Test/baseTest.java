package Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;


public class baseTest {

    static AndroidDriver<MobileElement> driver;
  //  public WebElement Preferences;

    @Test
public static void firstMethod () throws MalformedURLException {


            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "9");
            cap.setCapability("deviceName", "ASUS_X00TD");
            cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
            cap.setCapability("appPackage", "io.appium.android.apis");


            // cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"uiautomator");
            URL url = new URL("http:/localhost:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, cap);
            System.out.println("App started ");

          //  PreferencesTest pref = new PreferencesTest(driver);

    driver.findElementByXPath("//android.widget.TextView[@content-desc='Preference']").click();
    driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
    driver.findElementById("android:id/checkbox").click();
    driver.findElementById("android:id/checkbox").isEnabled();
    driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]").click();
    driver.findElementByClassName("android.widget.EditText").sendKeys("MB Degavi2.4Ghz");
    driver.findElementByClassName("android.widget.Button").click();
    driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]").click();
    driver.findElementByClassName("android.widget.EditText").sendKeys("MB Degavi2.4Ghz");
    driver.findElementsByClassName("android.widget.Button").get(1).click();
    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        }

    }




