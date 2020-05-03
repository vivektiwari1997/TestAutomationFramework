package FileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUpload;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void validateFileUploadResult(){
       FileUpload fileUpload= homePage.clickFileUpload();
       fileUpload.sendFilePath("C:\\Users\\Vishal\\Downloads\\chromedriver.exe");

       assertEquals(fileUpload.validateResult(),"chromedriver.exe","Incorrect");

    }
}
