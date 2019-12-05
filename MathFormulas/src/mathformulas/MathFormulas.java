package mathformulas;

/**
 *
 * @author cgallinaro
 */
public class MathFormulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v, w, x, y, z;
        double a = 1;
        double b = 2;
        double m = 3;
        x = (a - 5)*(b + 4);
        y = m*x + b;
        z = 4*((2*x + 7)*(3*x - 2));
        w = (m - 4*x)/(7-y);
        v = (a*Math.pow(x, 2) + b*x + z)/(m*x - w);
        System.out.println("A is " + a);
        System.out.println("B is " + b);
        System.out.println("M is " + m);
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("Z is " + z);
        System.out.println("W is " + w);
        System.out.println("V is " + v);
    }
    
}
