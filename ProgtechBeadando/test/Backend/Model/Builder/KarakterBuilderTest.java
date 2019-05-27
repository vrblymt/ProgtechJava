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

    @Test
    public void testBuild1() {
        System.out.println("név buildelés tesztelése");
        KarakterBuilder instance = new KarakterBuilder();
        Karakter expResult = new Karakter();
        expResult.setNev("mate");
        Karakter result = instance.SetNev("mate").Build();
        assertTrue(expResult.getNev() == result.getNev());
    }

    @Test
    public void testBuild2() {
        System.out.println("kaszt buildelés tesztelése");
        KarakterBuilder instance = new KarakterBuilder();
        Karakter expResult = new Karakter();
        expResult.setKaszt("kaszt");
        Karakter result = instance.SetKaszt("kaszt").Build();
        assertTrue(expResult.getKaszt() == result.getKaszt());
    }

    @Test
    public void testBuild3() {
        System.out.println("ruhaszin buildelés tesztelése");
        KarakterBuilder instance = new KarakterBuilder();
        Karakter expResult = new Karakter();
        expResult.setRuhaSzin("lila");
        Karakter result = instance.SetRuhaSzin("lila").Build();
        assertTrue(expResult.getRuhaSzin() == result.getRuhaSzin());
    }

}
