/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 16.8.2007
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettZaehler;
    private Etikett hatEtikettNenner;
    private Knopf hatKnopfAdd;
    private Knopf hatKnopfDif;
    private Knopf hatKnopfMul;
    private Knopf hatKnopfDiv;
    private Textfeld hatTextfeld_z1;
    private Textfeld hatTextfeld_n1;
    private Textfeld hatTextfeld_z2;
    private Textfeld hatTextfeld_n2;
    private Etikett hatEtikett1;
    private Etikett hatEtikett2;
    private Etikett hatEtikett3;
    private Etikett hatEtikett4;
    private Bruchrechner brech;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(811, 672);

        hatEtikettZaehler = new Etikett(422, 100, 100, 25, "Z�hler");
        // Ausrichtung
        hatEtikettZaehler.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettNenner = new Etikett(422, 148, 100, 25, "Nenner");
        // Ausrichtung
        hatEtikettNenner.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAdd = new Knopf(173, 75, 100, 25, "+");
        hatKnopfAdd.setzeBearbeiterGeklickt("hatKnopfAddGeklickt");
        hatKnopfAdd.setzeBearbeiterGeklickt("hatKnopfAddGeklickt");
        hatKnopfDif = new Knopf(173, 107, 100, 25, "-");
        hatKnopfDif.setzeBearbeiterGeklickt("hatKnopfDifGeklickt");
        hatKnopfDif.setzeBearbeiterGeklickt("hatKnopfDifGeklickt");
        hatKnopfMul = new Knopf(173, 140, 100, 25, "*");
        hatKnopfMul.setzeBearbeiterGeklickt("hatKnopfMulGeklickt");
        hatKnopfMul.setzeBearbeiterGeklickt("hatKnopfMulGeklickt");
        hatKnopfDiv = new Knopf(173, 171, 100, 25, "/");
        hatKnopfDiv.setzeBearbeiterGeklickt("hatKnopfDivGeklickt");
        hatTextfeld_z1 = new Textfeld(54, 100, 100, 25, "");
        // Ausrichtung
        hatTextfeld_z1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld_n1 = new Textfeld(54, 150, 100, 25, "");
        // Ausrichtung
        hatTextfeld_n1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld_z2 = new Textfeld(281, 100, 100, 25, "");
        // Ausrichtung
        hatTextfeld_z2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld_n2 = new Textfeld(281, 148, 100, 25, "");
        // Ausrichtung
        hatTextfeld_n2.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett1 = new Etikett(54, 125, 100, 25, "------------------------");
        // Ausrichtung
        hatEtikett1.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett2 = new Etikett(281, 124, 100, 25, "------------------------");
        // Ausrichtung
        hatEtikett2.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett3 = new Etikett(396, 124, 27, 25, "=");
        // Ausrichtung
        hatEtikett3.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett4 = new Etikett(422, 124, 100, 25, "------------------------");
        // Ausrichtung
        hatEtikett4.setzeAusrichtung(Ausrichtung.LINKS);
        
        brech = new Bruchrechner();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAdd fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAddGeklickt()
    {
        Bruch br1 = new Bruch(hatTextfeld_z1.inhaltAlsGanzeZahl(),hatTextfeld_n1.inhaltAlsGanzeZahl());
        Bruch br2 = new Bruch(hatTextfeld_z2.inhaltAlsGanzeZahl(),hatTextfeld_n2.inhaltAlsGanzeZahl());
        
        Bruch br3 = brech.Summe(br1,br2);
        
        hatEtikettZaehler.setzeInhalt(br3.zaehler());
        hatEtikettNenner.setzeInhalt(br3.nenner());
    }


/**
 * Vorher: Ereignis GeklicktvonhatKnopfDif fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfDifGeklickt()
    {
        Bruch br1 = new Bruch(hatTextfeld_z1.inhaltAlsGanzeZahl(),hatTextfeld_n1.inhaltAlsGanzeZahl());
        Bruch br2 = new Bruch(hatTextfeld_z2.inhaltAlsGanzeZahl(),hatTextfeld_n2.inhaltAlsGanzeZahl());
        
        Bruch br3 = brech.Differenz(br1,br2);
        
        hatEtikettZaehler.setzeInhalt(br3.zaehler());
        hatEtikettNenner.setzeInhalt(br3.nenner());

    }


/**
 * Vorher: Ereignis GeklicktvonhatKnopfMul fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfMulGeklickt()
    {
        Bruch br1 = new Bruch(hatTextfeld_z1.inhaltAlsGanzeZahl(),hatTextfeld_n1.inhaltAlsGanzeZahl());
        Bruch br2 = new Bruch(hatTextfeld_z2.inhaltAlsGanzeZahl(),hatTextfeld_n2.inhaltAlsGanzeZahl());
        
        Bruch br3 = brech.Produkt(br1,br2);
        
        hatEtikettZaehler.setzeInhalt(br3.zaehler());
        hatEtikettNenner.setzeInhalt(br3.nenner());
    }


/**
 * Vorher: Ereignis GeklicktvonhatKnopfDiv fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfDivGeklickt()
    {
        Bruch br1 = new Bruch(hatTextfeld_z1.inhaltAlsGanzeZahl(),hatTextfeld_n1.inhaltAlsGanzeZahl());
        Bruch br2 = new Bruch(hatTextfeld_z2.inhaltAlsGanzeZahl(),hatTextfeld_n2.inhaltAlsGanzeZahl());
        
        Bruch br3 = brech.Quotient(br1,br2);
        
        hatEtikettZaehler.setzeInhalt(br3.zaehler());
        hatEtikettNenner.setzeInhalt(br3.nenner());
    }

}
