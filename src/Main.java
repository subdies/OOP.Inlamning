import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //SKAPAR ALLA NUVARANDE VÄXTER.
        Krukväxter Laura = new Palm("Laura", 5);
        Krukväxter Olof = new Palm("Olof", 1);
        Krukväxter Meatloaf = new Köttätande("Meatloaf", 0.7);
        Krukväxter Igge = new Kaktus("Igge", 0.2);

        //LÄGGER IN ALLA DESSA VÄXTER I EN LISTA.
        List<Krukväxter> krukväxterlistan = new ArrayList<>();
        krukväxterlistan.add(Laura);
        krukväxterlistan.add(Olof);
        krukväxterlistan.add(Meatloaf);
        krukväxterlistan.add(Igge);

        //SKAPAR EN MENY SOM ANVÄNDAREN KAN INTERAGERA MED OM KÖRA OM IFALL DET SKULLE BEHÖVAS.
        boolean meny = false;
        while (!meny) {
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska vattnas?");

            //OM ANVÄNDARE INTE SKRIVER IN NÅGOT STÄNGS PROGRAMMET AV.
            if (input == null) {
                meny = true;
            } else {

                //GÖR OM INPUT TILL SMÅ BOKSTÄVER FÖR ATT JÄMFÖRA SENARE.
                input = input.toLowerCase();
                Krukväxter resultat = null;

                //KOLLAR JAG IGENOM HELA LISTAN FÖR ATT LETA EFTER EN MATCH,
                for (Krukväxter k : krukväxterlistan) {

                    //SPARAR RESULTATET OM EN MATCHNING HITTADES.
                    if (k.getNamn().toLowerCase().equals(input)) {
                        resultat = k;
                        break;
                    }
                }

                //OM INGEN MATCH HITTADES EFTER SÖKNINGEN I LISTAN FÅR ANVÄNDAREN ETT MEDDELANDE OM ATT DET INTE FINNS.
                if (resultat == null) {
                    JOptionPane.showMessageDialog(null, "Växten hittades inte.");

                    //OM VÄXTEN HITTADES SKRIVS DET UT HUR MYCKET SAMT VAD FÖR SLAGS VATTEN VÄXTEN BEHÖVER.
                } else {
                    String meddelande = resultat.getNamn() + " behöver " + resultat.vattenBehov() + " liter " + resultat.vatten().getNamn() + " om dagen.";
                    JOptionPane.showMessageDialog(null, meddelande);
                }
            }
        }
    }
}

/**
 * I INTERFACE DEFINERAS METODERNA SOM KOMMER ATT BEHÖVAS
 * ALLA ANDRA KLASSER SOM IMPLMENTERAR INTERFACET MÅSTE DEFINERA DESSA
 * SOM GÖRS I OVERRIDE STYCKET.
 * <p>
 * DEN DEFINERADE DATAN RETURNERAS TILL INTERACET.
 * <p>
 * I DEN ABSTRAKTA KLASSEN KRUKVÄXTER KALLAR PÅ
 * SUBKLASSERNA SOM SKA KONKRETA SVAR PÅ METODERNA.
 * <p>
 * KLASSERNA SOM PALM ETC. EXTENDAR KRUKVÄXTEN SOM HAR
 * INICIERAT LÄNGD OCH NAMN, OCH PALM KLASSEN RÄKNAR UT RÄTT
 * MÄNGD VATTEN OCH SKICKAR TILLBAKA TILL INTERFACET.
 * <p>
 * SLUTLIGEN I MAIN KLASSEN KALLAR MAN PÅ RESULTAT.VATTENBEHOV()
 * SOM GER OSS SPECIFIKA VATTENBEHOVET BASERAT PÅ VILKEN SORTS
 * VÄXT DET ÄR.
 * <p>
 * POLYMORFISM ANVÄNDS VARJE GÅNG INTERFACET ANVÄNDS.
 * <p>
 * ENUMS HAR LAGTS TILL SÅ ATT DE ENDA VÄTSKORNA (JUST NU)
 * ÄR DE 3 SOM SKULLE LÄGGAS TILL ENLIGT UPPDRAGET.
 * <p>
 * INKAPSLING HAR IMPLEMENTERATS VID TEX PROTECTED I KRUKVÄXTER KLASSEN.
 *
 */