package Backend.Model.Builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KarakterTest {

    public KarakterTest() {
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
     * Test of getKaszt method, of class Karakter.
     */
    @Test
    public void testGetKaszt() {
        System.out.println("Kaszt teszt");
        Karakter instance = new Karakter();
        String expResult = "kaszt";
        instance.setKaszt("kaszt");
        String result = instance.getKaszt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNev method, of class Karakter.
     */
    @Test
    public void testGetNev() {
        System.out.println("Név teszt");
        Karakter instance = new Karakter();
        String expResult = "nev";
        instance.setNev("nev");
        String result = instance.getNev();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRuhaSzin method, of class Karakter.
     */
    @Test
    public void testGetRuhaSzin() {
        System.out.println("Ruhaszin teszt");
        Karakter instance = new Karakter();
        String expResult = "Piros";
        instance.setRuhaSzin("Piros");
        String result = instance.getRuhaSzin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRuhaSzin method, of class Karakter.
     */
    @Test
    public void testSetRuhaSzin() {
        System.out.println("Ruhaszin beállítás teszt");
        String ruhaSzin = "Piros";
        Karakter instance = new Karakter();
        instance.setRuhaSzin(ruhaSzin);
        assertEquals(ruhaSzin, instance.getRuhaSzin());
    }

    /**
     * Test of setKaszt method, of class Karakter.
     */
    @Test
    public void testSetKaszt() {
        System.out.println("Kaszt beállítása");
        String kaszt = "Harcos";
        Karakter instance = new Karakter();
        instance.setKaszt(kaszt);
        assertEquals(kaszt, instance.getKaszt());
    }

    /**
     * Test of setNev method, of class Karakter.
     */
    @Test
    public void testSetNev() {
        System.out.println("teszt név beállítás");
        String nev = "mate";
        Karakter instance = new Karakter();
        instance.setNev(nev);
        assertEquals(nev, instance.getNev());
    }

}
