package Backend.Model;

import Backend.Model.Builder.Karakter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdatbazisKezeloTest {

    public AdatbazisKezeloTest() {
    }
    /**
     * Test of Select method, of class AdatbazisKezelo.
     */
    @Test
    public void testSelect() {
        System.out.println("Select metódus tesztelése");
        AdatbazisKezelo instance = new AdatbazisKezelo();
        Karakter expResult = new Karakter();
        Karakter result = instance.Select();
        assertTrue(expResult.getClass() == result.getClass());
    }

}
