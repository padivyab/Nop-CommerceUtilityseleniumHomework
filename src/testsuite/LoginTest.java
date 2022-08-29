package testsuite;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@class='ico-login']"));

        //* Verify the text ‘Welcome, Please Sign In!’
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']"));
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@class='ico-login']"));

        //* Enter valid username
        sendTextToElement(By.xpath("//input[@class='email']"),"div96@gmail.com");
        //* Enter valid password
        sendTextToElement(By.xpath("//input[@class='password']"),"Div1996");
        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //* Verify the ‘Log out’ text is display
        String actualText = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        String expectedText = "Log out";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void verifyTheErrorMessage()
    {
        //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@class='ico-login']"));
        //* Enter invalid username
        sendTextToElement(By.xpath("//input[@class='email']"),"di96@gmail.com");
        //* Enter invalid password
        sendTextToElement(By.xpath("//input[@class='password']"),"di1996");
        //* Click on Login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //* Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’
        String actualText = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";

    }

    @After
    public void tearDown()
    {
        //closeBrowser();

    }


}


