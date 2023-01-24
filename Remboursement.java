public class Remboursement
{
    static double forfait(double montant , double forfaitaire)
    {
        double soustr = 0;
        //Vector resultat = new Vector();
        int mois = 0;
        while(montant != 0)
        {
            soustr = montant - forfaitaire;
            if(montant <= forfaitaire)
            {
                soustr = 0;
            }
            mois++;
        }
        return soustr;
    }

    static double taux(double montant , double tr)
    {
        double taux_r = (montant*tr)/100;
        double soustr = 0;
        int mois = 0;
        while (montant != 0)
        {
            soustr = montant - taux_r;
            if (montant <= taux_r)
            {
                soustr = 0;
            }
            mois++;
        }
        return soustr;
    }

    public static void main(String[] args) 
 	{
        double nb1 = 50000;
        double forf1 = 450;
        double taux = 13;
        double valiny = forfait(nb1,forf1);
        double v2 = taux(nb1,taux);
        System.out.println("mois de remboursement : " +valiny);
        System.out.println("mois de remboursement : " +v2);
 		
	}
}