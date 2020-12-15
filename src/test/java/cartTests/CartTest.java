package cartTests;

import pageObjects.amazonPageObjects.HeaderPage;
import testBase.TestBase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CartTest extends TestBase {
    HeaderPage hp = new HeaderPage(wdriver);

    @BeforeAll
    public static void setUp() throws Exception {
        webSetup();
    }

    @AfterAll
    public static void tearDown() {
        webTearDown();
    }

    //The purpose of this test:
    // is to search for item: "LG 24UD58-B 24-Inch 4k Monitor" > Search for Item "Metasploit: The Penetration Tester's Guide Book" >
    //Then search for "cup with cat on it" > take screenshot of this page
    //Add each product to cart > confirm items are in cart
    //Then remove "LG 24UD58-B 24-Inch 4k Monitor" from cart > verify item was removed
    //Perform assertions on each page to verify on correct page

    @Test
    public void cartTest() throws InterruptedException {
        String item1 = "LG 24UD58-B 24-Inch 4k Monitor";
        String item2 = "Metasploit: The Penetration Tester's Guide Book";
        String item3 = "Covocup Live Love Meow Cup, 16 oz, Multicolor";

        //Load amazon page
        loadAmazonHome();
        //Assert Page: Amazon Home screen
        //Search for item1: "LG 24UD58-B 24-Inch 4k Monitor"
        hp.searchForProduct(item1);
        Thread.sleep(5000);
        //Assert Page: Search screen
        //Click on item1: "LG 24UD58-B 24-Inch 4k Monitor"
        //Assert Page: Product Detail Page
        //Add item1 to cart
        //Verify item1 was added to cart

        //Search for item2: "Metasploit: The Penetration Tester's Guide Book"
        //Assert Page: Search screen
        //Click on item2: "Metasploit: The Penetration Tester's Guide Book"
        //Assert Page: Product Detail Page
        //Add item2 to cart
        //Verify item2 was added to cart

        //Search for item3: "a cup with a cat on it"
        //Assert Page: Search screen
        //Click on item3: "a cup with a cat on it"
        //Assert Page: Product Detail Page
        //Screenshot page: Product Detail Page
        //Add item3 to cart
        //Verify item3 was added to cart

        //Open cart screen
        //Assert Page: Cart Screen
        //Verify item1, item2, item3 are in cart

        //Remove item1: "LG 24UD58-B 24-Inch 4k Monitor" from cart
        //Verify item1 was removed from cart



    }
}
