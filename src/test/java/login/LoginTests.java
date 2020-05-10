package login;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.readExcel;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @DataProvider
    public Object[][] getLoginData(){
       Object data [][] = readExcel.getTestData("login");
       return data;
    }

    @Test(dataProvider =  "getLoginData")
    public void testSuccessfulLogin(String username, String password){
          LoginPage loginPage= homePage.clickFormAuthentication();
          loginPage.setUsername(username);
          loginPage.setPassword(password);
          SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
          assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                  "Alert text not found/incorrect");

    }
}
