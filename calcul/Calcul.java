package calcul;

public class Calcul {

    private int a;
    private int b;
    private int c;

    public Calcul(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    public double[] calculSeconddegre()
    {
        int delta = b*b-(4*a*c);

        if(delta>0){
            double solution1 = (-b+Math.sqrt(delta))/(2.0*a);
            double solution2 = (-b-Math.sqrt(delta))/(2.0*a);
            return new double[] {delta,solution1, solution2};
        } else if(delta==0){
            double solution = -b/2*a;
            return new double[] {delta,solution};
        } else{
             return null;
        }
    }
}