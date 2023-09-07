import BilEjer.BilEjer;
import Bil.Bil;

    public class Main {

        public static void main(String[] args) {
            // Opret et array af Bil.Bil-objekter
            Bil[] biler = new Bil[3];
            biler[0] = new Bil("Toyota", "Camry", 2010);
            biler[1] = new Bil("Honda", "Civic", 2015);
            biler[2] = new Bil("Ford", "Focus", 2005);

            // Opret en instans af BilEjer.BilEjer med flere biler
            BilEjer ejer = new BilEjer("John Doe", 35, biler);

            // Udskriv objektet som en streng ved hjælp af toString-metoden i BilEjer.BilEjer-klassen
            System.out.println(ejer);

            // Beregn og udskriv den samlede ejerafgift for alle biler
            double totalEjerafgift = ejer.beregnTotalEjerafgift();
            System.out.println("Samlet ejerafgift for alle biler: " + totalEjerafgift);

            // Find og udskriv den ældste bil
            Bil ældsteBil = ejer.findÆldsteBil();
            System.out.println("Ældste bil er en " + ældsteBil.getBilmærke() + " fra år " + ældsteBil.getRegÅr());
        }
    }
