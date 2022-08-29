package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        //* click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        //* Verify the text ‘Register’
        String actualText = getTextFromElement(By.linkText("Register"));
        String expectedText = "Register";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldRegisterAccountSuccessfully()
    {
        //* click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        //* Select gender radio button
        clickOnElement(By.xpath("//input[@id='gender-female']"));

        //* Enter First name
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"di");

        //* Enter Last name
        sendTextToElement(By.xpath("//input[@id='LastName']"),"patel");

        //* Select Day Month and Year
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"25");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"May");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1996");

        //* Enter Email address
        sendTextToElement(By.xpath("//input[@id='Email']"),"padivi96@gmail.com");

        //* Enter Password
        sendTextToElement(By.xpath("//input[@id='Password']"),"Padi96");
        //* Enter Confirm password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"Padi96");

        //* Click on REGISTER button
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //* Verify the text 'Your registration completed’
        String actualText = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedText = "Your registration completed";
        Assert.assertEquals(expectedText,actualText);

    }

    @After
    public void tearDown()
    {
        closeBrowser();

    }
}
