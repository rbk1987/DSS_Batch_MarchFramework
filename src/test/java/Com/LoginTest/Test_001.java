package Com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Uility.BaseClass;
import Com.Uility.ExcelDataProvider;
import Com.Uility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 extends BaseClass  {
	
@Test

 public void verifyLoginpage() {
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
//actions
  Library.Custom_Sendkey(login.gettxt_Email(),excel.getStringData("Sheet1", 0, 0));
  Library.Custom_Sendkey(login.gettxt_Password(), excel.getStringData("sheet1", 0, 1));
//  login.getbtn_login().click();
  
 }

}
