package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	 @FindBy(how=How.XPATH,using ="//input[@id='email']")
	  private WebElement txt_Email;
	 @FindBy(how=How.XPATH,using ="//input[@id='pass']")
	  private WebElement txt_Password;
//     @FindBy(how=How.XPATH,using ="//button[@name='login']")
//    private WebElement btn_login;
	 
	 public WebElement gettxt_Email ()  {
		 return txt_Email;
	 }
		 public WebElement gettxt_Password()  {
			 return txt_Password;
		 
	 }
//		 public  WebElement getbtn_login()  {
//			 return btn_login;
//		 
//	 }
	 
	 
}    
