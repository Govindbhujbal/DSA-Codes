package learningJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MinSplit {
	public static void main(String args[])
    {
//        boolean one = false && true;
//        boolean two = (1==0&& 2==2)&&(1==0|| 1==1);
		   //System.out.println(one);
       // System.out.println(two);
		
			int a=10;
			int []arr=new int[4];
			int rem=0;
			for(int i=0;a>0;i++)
			{
				rem=a%2;
				arr[i]=rem;
				a=a/2;
			}
			int b=2;
		Collections.reverse(Arrays.asList(arr));
			//System.out.print(Arrays.toString(arr));
			//System.out.print(Collections.frequency(arr,1));
			HashMap<Integer,Integer> hm=new HashMap<>();
			for(int i=0;i<arr.length;i++)
			{
				hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			}
			System.out.println(hm);
			
    }
}
