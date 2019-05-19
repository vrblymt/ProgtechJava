package Backend.Model.Builder;

public class Karakter {

    String kaszt;
    String nev;
    String ruhaSzin;

    /**
     * Visszaadja a hős kasztját
     *
     * @return string
     */
    public String getKaszt() {
        return this.kaszt;
    }

    /**
     * Visszaadja a hős nevét
     *
     * @return string
     */
    public String getNev() {
        return this.nev;
    }

    /**
     * Visszaadja a hős ruhájának színét.
     *
     * @return string
     */
    public String getRuhaSzin() {
        return this.ruhaSzin;
    }

    public Karakter() {
        kaszt = "";
        nev = "";
        ruhaSzin = "";
    }

    /**
     * A karakter ruhájának a színét állítja be.
     *
     * @param ruhaSzin Egy string paraméterrel beállítja a ruha színét.
     */
    public void setRuhaSzin(String ruhaSzin) {
        if (ruhaSzin != "") {
            this.ruhaSzin = ruhaSzin;
        }
    }

    /**
     * A karakter kasztját állítja be.
     *
     * @param kaszt Egy string paraméterrel beállítja a karakter kasztját.
     */
    public void setKaszt(String kaszt) {
        if (kaszt != "") {
            this.kaszt = kaszt;
        }
    }

    /**
     * A karakter nevét állítjuk be.
     *
     * @param nev Egy string paraméterrel beállítja a karakter nevét.
     */
    public void setNev(String nev) {
        if (nev != "") {
            this.nev = nev;
        }
    }

}
