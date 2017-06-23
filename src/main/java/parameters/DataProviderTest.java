package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by tanya on 22.06.2017.
 */
public class DataProviderTest {

    @DataProvider
    private Object[][] parameters() {
        return new Object[][]{
                {"Jenny", "Jenny Cherry","jqjenny16@yopmail.com","+1(959)-1775994","201 Metz Bates","15840 New York"},
                {"Garance", "Garance Epperson","duepperson20@gmail.com","+1(747)-8330134","542 American Circle","49100 Washington"},
                {"Nadia","Nadia Patten","jnnadia13@gmail.com","+1(131)-9550402","791 Bombardier Court","93809 New York"},
                {"Jennifer","Jennifer Krantz","eekrantz4@yopmail.com","+1(656)-6779916","413 Wescam Drive","43115 Miami"},
                {"Christin","Christin Steinberg","awchristin22@yahoo.com","+1(656)-1115633","412 Barfield Trail","53713 Houston"}
        };
    }


}

