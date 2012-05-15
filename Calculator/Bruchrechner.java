/**
 * @
 * @Final
 */
public class Bruchrechner
{

    public Bruchrechner()
    {

    }

    public Bruch Summe(Bruch bruch1, Bruch bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.zaehler() * bruch1.nenner() + bruch1.zaehler() * bruch2.nenner();
        zNenner = bruch2.nenner() * bruch1.nenner();

        Bruch br = new Bruch(zZaehler, zNenner);        //Neuer Bruch wird erzeugt

        br.kuerze();
        
        return br;
    }

    public Bruch Differenz(Bruch bruch1, Bruch bruch2)
    {
        return Summe( new Bruch(bruch1.zaehler(), bruch1.nenner()) , 
            new Bruch (-bruch2.zaehler(),bruch2.nenner()));        
        //Selbst erlklaerend, man nimmt die Funktion Summe von oben und subtrahiert. 
    }

    public Bruch Quotient(Bruch bruch1, Bruch bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.nenner() * bruch1.zaehler();
        zNenner = bruch2.zaehler() * bruch1.nenner();
        Bruch br = new Bruch(zZaehler, zNenner);
        
        br.kuerze();

        return br;
    }

    public Bruch Produkt(Bruch bruch1, Bruch bruch2)
    {
        int zZaehler, zNenner;

        zNenner = bruch2.nenner() * bruch1.nenner();
        zZaehler = bruch2.zaehler() * bruch1.zaehler();
        Bruch br = new Bruch(zZaehler, zNenner);
        
        br.kuerze();

        return br;
    }

}
