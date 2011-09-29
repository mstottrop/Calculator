/**
 * @author
 * @version Final
 */
public class Bruch
{
    // Bezugsobjekte

    // Attribute
    int zNenner,zZaehler;

    // Konstruktor
    public Bruch(int pZaehler,int pNenner)
    {   zZaehler = pZaehler;
        zNenner = pNenner;
    }

    // Dienste
    public int zaehler()
    {
        return zZaehler;
    }

    public int nenner()
    {
        return zNenner;
    }

    private int ggt(int zahl1, int zahl2)
    {
        int zahl3;
        while (zahl2 > 0)            // Nicht != 0
        {
            zahl3=zahl1 % zahl2;
            zahl1=zahl2;            // Code aus dem Internet
            zahl2=zahl3;
        }
        return zahl1;
    }

    public void kuerze()
    {
        int ggt = ggt(zNenner,zZaehler);
        zNenner /= ggt;                   //Nenner wird duch den ggT geteilt
        zZaehler /= ggt;                  // Zaehler wird duch den ggT geteilt
    }
}