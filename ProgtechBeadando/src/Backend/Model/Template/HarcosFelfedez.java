package Backend.Model.Template;

import Backend.Model.Builder.Karakter;

public class HarcosFelfedez extends Felfedez {

    public HarcosFelfedez(Karakter karakter) {
        super(karakter);
    }

    @Override
    protected String KepessegetHasznal() {
        return karakter.getNev() + " a forgókard képességét használta.\n";
    }

    @Override
    protected String FegyvertTalal() {
        return karakter.getNev() + " egy telihold kard és egy " + karakter.getRuhaSzin() + " színű vas lemezvértet talált.\n";
    }

    @Override
    protected String Felszerel() {
        return karakter.getNev() + " a telihold kardot és a " + karakter.getRuhaSzin() + " színű lemezvértet felvette így +" + rand.nextInt(30) + " támadási pontot kapott.\n";
    }

}
