package Backend.Model.Builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KarakterBuilderTest {

    public KarakterBuilderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Build method, of class KarakterBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("Buildelés tesztelése");
        KarakterBuilder instance = new KarakterBuilder();
        Karakter expResult = new Karakter();
        Karakter result = instance.Build();
        assertTrue(expResult.getClass() == result.getClass());
    }

}
