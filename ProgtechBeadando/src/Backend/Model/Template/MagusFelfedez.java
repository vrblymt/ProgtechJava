package Backend.Model.Template;

import Backend.Model.Builder.Karakter;

public class MagusFelfedez extends Felfedez {

    public MagusFelfedez(Karakter karakter) {
        super(karakter);
    }

    @Override
    protected String KepessegetHasznal() {
        return karakter.getNev() + " egy tűzlabdát dobott a szörny fejének.\n";
    }

    @Override
    protected String FegyvertTalal() {
        return karakter.getNev() + " egy varázspálcát és egy " + karakter.getRuhaSzin() + " színű köpenyt talált.\n";
    }

    @Override
    protected String Felszerel() {
        return karakter.getNev() + " a varázspálcát és a " + karakter.getRuhaSzin() + " színű köpenyt felvette így +" + rand.nextInt(30) + " mágia pontot kapott.\n";
    }

}
