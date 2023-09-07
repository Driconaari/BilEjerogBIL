package Bil;

public class Bil {
    private String bilmærke;
    private String bilmodel;
    private int regÅr;

    public Bil(String bilmærke, String bilmodel, int regÅr) {
        this.bilmærke = bilmærke;
        this.bilmodel = bilmodel;
        this.regÅr = regÅr;
    }

    // Tilføj getters og setters efter behov
    public String getBilmærke() {
        return bilmærke;
    }

    public int getRegÅr() {
        return regÅr;
    }

    // Tilpas toString-metoden efter behov
    @Override
    public String toString() {
        return "Bil.Bil [bilmærke=" + bilmærke + ", bilmodel=" + bilmodel + ", regÅr=" + regÅr + "]";
    }

    public double beregnEjerafgift() {
        // Implementer den faktiske beregning af ejerafgift baseret på bilens egenskaber
        // Her er et fiktivt eksempel som reference:
        // For eksempel, hvis ejerafgiften afhænger af bilens registreringsår:
        // Du kan erstatte dette med den faktiske formel eller beregning
        int aktueltÅr = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int alder = aktueltÅr - regÅr;
        double ejerafgift = 0.0;

        // Her er et eksempel på en fiktiv beregningsmetode:
        // Beregn ejerafgift baseret på alder eller andre faktorer
        if (alder >= 0 && alder < 3) {
            ejerafgift = 5000.0;
        } else if (alder >= 3 && alder < 6) {
            ejerafgift = 3000.0;
        } else {
            ejerafgift = 1000.0;
        }

        return ejerafgift;
    }

}

