package BilEjer;

import Bil.Bil;
import BilEjer.BilEjer;

import java.util.Arrays;
public class BilEjer {
    private String navn;
    private int ejerAlder;
    private Bil[] biler;

    public BilEjer(String navn, int ejerAlder, Bil[] biler) {
        this.navn = navn;
        this.ejerAlder = ejerAlder;
        this.biler = biler;
    }

    // Metode til at beregne den samlede ejerafgift for alle biler
    public double beregnTotalEjerafgift() {
        double totalEjerafgift = 0.0;
        for (Bil bil : biler) {
            totalEjerafgift += bil.beregnEjerafgift(); // Brug bilens metode til at beregne ejerafgift
        }
        return totalEjerafgift;
    }

    // Metode til at finde den ældste bil
    public Bil findÆldsteBil() {
        Bil ældsteBil = biler[0];
        for (Bil bil : biler) {
            if (bil.getRegÅr() < ældsteBil.getRegÅr()) {
                ældsteBil = bil;
            }
        }
        return ældsteBil;
    }

    @Override
    public String toString() {
        return "BilEjer [navn=" + navn + ", ejerAlder=" + ejerAlder + ", biler=" + Arrays.toString(biler) + "]";
    }
}
