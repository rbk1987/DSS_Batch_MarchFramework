package Com.Uility;

import org.openqa.selenium.WebElement;

public class Library   {

	public static void Custom_Sendkey(WebElement element, String text) {
		try {
			element.sendKeys(text);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
        
	
	}
}
