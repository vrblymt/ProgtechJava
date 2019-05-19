package Backend.Model.Builder;

import java.util.logging.Logger;

public class KarakterBuilder {

    private Karakter karakter;

    /**
     * Beállíthatjuk a karakter nevét.
     *
     * @param nev string
     * @return Az adott karakter nevét adja vissza.
     */
    public KarakterBuilder SetNev(String nev) {
        this.karakter.setNev(nev);
        return this;
    }
    private static final Logger LOG = Logger.getLogger(KarakterBuilder.class.getName());

    /**
     * Beállíthatjuk a karakter kasztját.
     *
     * @param kaszt string
     * @return Az adott karakter kasztját adja vissza.
     */
    public KarakterBuilder SetKaszt(String kaszt) {
        this.karakter.setKaszt(kaszt);
        return this;
    }

    /**
     * Beállíthatjuk a karakter ruha színét.
     *
     * @param ruhaSzin string
     * @return Az adott karakter ruha színét adja vissza.
     */
    public KarakterBuilder SetRuhaSzin(String ruhaSzin) {
        this.karakter.setRuhaSzin(ruhaSzin);
        return this;
    }

    /**
     * Létrehozza a példányt.
     *
     * @return Egy karakter példány.
     */
    public Karakter Build() {
        LOG.info("karakter buildelése sikeres.");
        return karakter;
    }

    public KarakterBuilder() {
        this.karakter = new Karakter();
    }
}
