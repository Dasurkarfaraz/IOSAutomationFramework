package Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriverException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.sikuli.script.Pattern;
public class Snippet extends BaseTest  {
	@Test
	public void run() {
	// Assuming you have the driver instance set up
	
	// Specify the path to the image file
	String imagePath = "/Users/piyushgandhi/Downloads/ohioios/c.png";
	
	// Create a SikuliX screen object
	Screen sikuliScreen = new Screen();
	
	try {
	    // Find the image on the screen
	    Pattern pattern = new Pattern(imagePath);
	    sikuliScreen.wait(pattern, 100);
	
	    // Get the coordinates of the matched element
	    org.sikuli.script.Region region = sikuliScreen.getLastMatch();
	    int elementX = region.getX();
	    int elementY = region.getY();
	System.out.println(elementX);
	System.out.println(elementY);
	    // Perform a click action on the element using Appium's TouchAction
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.tap(PointOption.point(elementX, elementY)).perform();
	} catch (FindFailed E) {
	    // Handle the case when the image is not found or element detection fails
	    E.printStackTrace();
	} catch (WebDriverException e) {
	    // Handle any WebDriver exceptions
	    e.printStackTrace();
	}
}
}

