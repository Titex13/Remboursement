
import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.*;

public class mois
{
    static int mois (double m , double f)
    {
        double mois;
        double div;
        div = m/f;
        mois = div+1;
        int c = (int) mois;
        return c;
    }

    static double taux(double m,double a)
    {
        double c = (m*a)/100;
        return c;
    }
    
    /*static double[] forfait(double m, double a)
    {
        int mo = mois(m,a);
        //double sous = m;
        double [] res = new double[mo];
        res[0] = m;
        for(int i = 0; i < res.length;i++)
        {
            while(res[i] != a)
            {
                res[i] -= a;
                if(res[i] <= a )
                {
                    res[i] = 0;
                    break;
                } 
            }
            //return res;
        }
        return res;
    }*/

    static Double[] forfait (double mon , double rem)
    {
        double sou = mon -rem;
        Vector<Double> vec = new Vector<>();
        vec.add(sou);
        while(mon>rem)
        {
            sou = sou - rem;
            vec.add(sou);
            if(sou <= rem)
            {
                sou = 0;
                vec.add(sou);
                break;
            }
        }
        Double[] result = new Double [vec.size()];
        vec.copyInto(result);
        return result;
    }
    static Double[] taux_forf(double m, double rem)
    {
        double g = taux(m,rem);
        Double[] h = forfait(m,g);
        return h;
    }
    

    public static void main(String[] args)
    {
        double o = 12000;
        double c = 540;
        double t= 13.5;
        int mo = mois(o,c);
        System.out.println(mo);
        double g = taux(o,t);
        System.out.println(g);
        Double[] valiny = forfait(o,c);
        for (int i = 0; i<valiny.length;i++)
        {
            System.out.println(valiny[i]);
        }
        Double[] v2 = taux_forf(o,t);
        for (int i = 0; i<valiny.length;i++)
        {
            System.out.println(v2[i]);
        }
    } 
}