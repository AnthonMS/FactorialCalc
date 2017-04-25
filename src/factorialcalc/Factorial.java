/*
 * Developed By Anthon Mølgaard Steiness
 * As a Student at EASJ
 * Licensed under The GNU General Public License
 * 25-04-2017
 */
package factorialcalc;

/**
 *
 * @author Antho
 */
public class Factorial
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        calculateFact(34);
        //System.out.println(calculateFact(4));
    }
    
    public static long calculateFact(int n)
    {
        // 1! = 1
        // N! = N * (N-1)! for N > 1
        long result;
        
        if (n == 1)
        {
            result = 1;
        }
        else
        {
            result = n * calculateFact(n-1);
        }
        System.out.println("Factorial(" + n + ") = " + result);
        return result;
        
    }
    
}
