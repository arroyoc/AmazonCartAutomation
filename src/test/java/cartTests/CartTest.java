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
        String item1Desc = "LG 24UD58-B 24-Inch 4K UHD IPS Monitor with FreeSync";
        String item2 = "Metasploit: The Penetration Tester's Guide Book";
        String item2Desc = "Metasploit: The Penetration Tester's Guide";
        String item3 = "Covocup Live Love Meow Cup, 16 oz, Multicolor";

        //Load amazon page
        loadAmazonHome();
        //Assert Page: Amazon Home screen
        //Search for item1: "LG 24UD58-B 24-Inch 4k Monitor"
        hp.searchForProduct(item1)
        //Assert Page: Search screen
        //Click on item1: "LG 24UD58-B 24-Inch 4k Monitor"
          .selectProduct(item1Desc)


        //Assert Page: Product Detail Page
        //Add item1 to cart
          .addToCartWarrantyOption(false)
        //Verify item1 was added to cart
          .clickCartBtn()
                .verifyProductIsInCart(item1Desc);

        //###-------------



        //Search for item2: "Metasploit: The Penetration Tester's Guide Book"
        hp.searchForProduct(item2)
        //Assert Page: Search screen
        //Click on item2: "Metasploit: The Penetration Tester's Guide Book"
        .selectProduct(item2Desc)
        //Assert Page: Product Detail Page
        //Add item2 to cart
        .addToCart()
        //Verify item2 was added to cart
        .clickCartBtn()
                .verifyProductIsInCart(item2Desc);

        //###-------------

        //Search for item3: "a cup with a cat on it"
        hp.searchForProduct(item3)
        //Assert Page: Search screen
        //Click on item3: "a cup with a cat on it"
        .selectProduct(item3)
        //Assert Page: Product Detail Page
        //Screenshot page: Product Detail Page
        .takeScreenshot()
        //Add item3 to cart
        .addToCart()
        //Verify item3 was added to cart
        .clickCartBtn()
                .verifyProductIsInCart(item3);

        //Open cart screen
        hp.clickCartBtn()
        //Assert Page: Cart Screen
        //Verify item1, item2, item3 are in cart
          .verifyProductIsInCart(item1Desc)
                .verifyProductIsInCart(item2Desc)
                .verifyProductIsInCart(item3);



        //Remove item1: "LG 24UD58-B 24-Inch 4k Monitor" from cart
        hp.clickCartBtn()
                .deleteProductFromCart(item1Desc)
//
//        //Verify item1 was removed from cart
                .verifyProductIsNotCart(item1Desc);

        Thread.sleep(5000);



    }
}
