package learningJava;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class InnerClassDemo{

	public static void main (String[] args) {
                      // Your code here
                      int a=0;
                      int b=0;
                      Scanner sc=new Scanner(System.in);
                      int N=sc.nextInt();
                      sc.nextLine();
                      String S=sc.nextLine();
                      char t[]=S.toCharArray();
                      for(int q : t)
                      {
                    	 // System.out.println(t[q]);
                          if(t[q]=='a')
                          a++;
                          else if(t[q]=='b')
                          b++;
                          
                      }
                      if(a<b)
                      System.out.println(a);
                      else if(a>b)
                      System.out.println(b);
                      else
                      System.out.println(a);









	}
	}
