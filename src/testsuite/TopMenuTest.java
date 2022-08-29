package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        //* click on the ‘Computers’ Tab
        clickOnElement(By.linkText("Computers"));
        //* Verify the text ‘Computers’
        String actualText = getTextFromElement(By.linkText("Computers"));
        String expectedText = "Computers";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        //* click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));

        //* Verify the text ‘Electronics’
        String actualText = getTextFromElement(By.linkText("Electronics"));
        String expectedText = "Electronics";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        //* click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));
        //* Verify the text ‘Apparel’
        String actualText = getTextFromElement(By.linkText("Apparel"));
        String expectedText = "Apparel";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        //* click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));
        //* Verify the text ‘Digital downloads’
        String actualText = getTextFromElement(By.linkText("Digital downloads"));
        String expectedText = "Digital downloads";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        //* click on the ‘Books’ Tab
        clickOnElement(By.linkText("Books"));
        //* Verify the text ‘Books’
        String actualText = getTextFromElement(By.linkText("Books"));
        String expectedText = "Books";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        //* click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));
        //* Verify the text ‘Jewelry’
        String actualText = getTextFromElement(By.linkText("Jewelry"));
        String expectedText = "Jewelry";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        //* click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));
        //* Verify the text ‘Gift Cards’
        String actualText = getTextFromElement(By.linkText("Gift Cards"));
        String expectedText = "Gift Cards";
        Assert.assertEquals(expectedText,actualText);

    }

    @After
    public void tearDown()
    {
        //closeBrowser();
    }
}
