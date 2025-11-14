package calcul;

public class Calcul 
{

    private int champ_a;
    private int champ_b;
    private int champ_c;

    public Calcul(int champ_a, int champ_b, int champ_c) 
    {
        this.champ_a = champ_a;
        this.champ_b = champ_b;
        this.champ_c = champ_c;
    }

    public int getA() 
    {
        return champ_a;
    }
    public void setA(int champ_a) 
    {
        this.champ_a = champ_a;
    }
    public int getB() {
        return champ_b;
    }
    public void setB(int champ_b) 
    {
        this.champ_b = champ_b;
    }
    public int getC() 
    {
        return champ_c;
    }
    public void setC(int champ_c) 
    {
        this.champ_c = champ_c;
    }
    
    public double[] calculSeconddegre()
    {
        int delta = champ_b*champ_b-(4*champ_a*champ_c);

        if(delta>0)
        {
            double solution1 = (-champ_b+Math.sqrt(delta))/(2.0*champ_a);
            double solution2 = (-champ_b-Math.sqrt(delta))/(2.0*champ_a);
            System.out.println("deux solutions reels : x1 = " + solution1 + ", x2 = " + solution2);
            return new double[] {delta, solution1, solution2};
        } else if(delta==0)
        {
            double solution = -champ_b/2*champ_a;
            System.out.println("une seule solution reelle : x = " + solution);
            return new double[] {delta,solution};
        } else
        {
            System.out.println("aucune solution (delta < 0)");
             return null;
        }
    }
}