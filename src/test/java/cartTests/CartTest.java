package cartTests;

import testBase.TestBase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CartTest extends TestBase {

    @BeforeAll
    public static void setUp() throws Exception {
        webSetup();
    }

    @AfterAll
    public static void tearDown() {
        webTearDown();
    }

    @Test
    public void cartTest(){

    }
}
