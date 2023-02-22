package learningJava;
import java.util.ArrayList;
import java.util.List;
public class ForSauraw {

	static long countNonDecreasing(int n)
    {
        int N = 10;
      
        // Compute value of N * (N+1)/2 *
        // (N+2)/3 * ....* (N+n-1)/n
        long count = 1;
          
//        for (int i = 1; i <= n; i++)
//        {
//            count *= (N + i - 1);
//            count /= i;
//        }
      String a = String.valueOf(n);
        int b = a.length();
        count = (n+(Math.abs(10-b))/Math.abs(10-b));
        return count;
    }
		public static void main(String args[])
		{
		int n = 140;
		System.out.println(countNonDecreasing(n));
		}
	}/* This code is contributed by Rajat Mishra */