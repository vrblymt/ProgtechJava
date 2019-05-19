package Backend.Model.Template;

import java.util.Random;
import Backend.Model.Builder.Karakter;

public abstract class Felfedez {

    Karakter karakter;
    Random rand = new Random();

    public Felfedez(Karakter karakter) {
        this.karakter = karakter;
    }

    public String Felfedezes() {
        String felfedezoUt = "";
        felfedezoUt += Kiindulas();
        felfedezoUt += Elindul();
        felfedezoUt += KepessegetHasznal();
        felfedezoUt += FegyvertTalal();
        felfedezoUt += Felszerel();
        felfedezoUt += Visszater();
        return felfedezoUt;
    }

    private String Kiindulas() {
        return karakter.getNev() + " egy kezdő " + karakter.getKaszt() + ". Ruhája " + karakter.getRuhaSzin() + " színű. Fejlődni szeretne ezért elindul felfedezni a világot.\n";
    }

    private String Elindul() {
        return "Elindul a szörnyekhez harcolni, hogy erősebb felszerelést találjon.\n";
    }

    private String Visszater() {
        return "A hős visszatért az új felszereléseivel és ő lett a legerősebb " + karakter.getKaszt() + ".";
    }

    protected abstract String KepessegetHasznal();

    protected abstract String FegyvertTalal();

    protected abstract String Felszerel();

}
