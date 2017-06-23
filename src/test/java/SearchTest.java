import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ContactDetailsPage;
import pageobjects.ContactsListPage;

public class SearchTest extends BaseTest {

    @Test
    public void testSearch() {
        ContactsListPage contactsListPage = new ContactsListPage(driver);
        contactsListPage.search("Jenny");

        ContactDetailsPage contactDetailsPage = contactsListPage.clickOnFirstName();

        String detailName = contactDetailsPage.getDetailName();
        String emailAddress = contactDetailsPage.getEmailAddress();
        String phoneNumber = contactDetailsPage.getPhoneNumber();
        String street1 = contactDetailsPage.getStreet1();
        String street2 = contactDetailsPage.getStreet2();

        Assert.assertEquals("Jenny Cherry", detailName);
        Assert.assertEquals("jqjenny16@yopmail.com", emailAddress);
        Assert.assertEquals("+1(959)-1775994", phoneNumber);
        Assert.assertEquals("201 Metz Bates", street1);
        Assert.assertEquals("15840 New York", street2);

        //Negative test

        driver.pressKeyCode(AndroidKeyCode.BACK);

        contactsListPage.clear();

        contactsListPage.search("test");
        ContactDetailsPage contactDetailsPageNegativeTest = contactsListPage.clickOnFirstName();

        String noContacts = contactDetailsPage.getNoContactsFound();
        Assert.assertEquals("No contacts found with \"test\" in the name", noContacts);





    }
}
