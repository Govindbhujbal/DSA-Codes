package learningJava;

public class ReverseInteger {
//153423646
//	    public static int reverse(int x) {
//	        int rev=0,prev=0;
//	        while(x!=0){
//	            int last=x%10;
//	            rev=(rev*10+last);
//	            int check=rev/10;
////	            System.out.println("check :  
//	            if(check!=prev) return 0;
//	            x=x/10;
//	            prev=rev;
//	        }
//	        return rev;
//	    }
	public static int reverse(int x) {
        int nums=0;
       while(x!=0){
    	   
    	   System.out.println("isGreater "+nums+"     "+Integer.MAX_VALUE/10);
    	   System.out.println("isSmaller "+nums+"     "+Integer.MIN_VALUE/10);
    	   
           if(nums>Integer.MAX_VALUE/10 || nums< Integer.MIN_VALUE/10){
               return 0;
           }   
           nums = nums*10 + x%10;
           x = x/10;
       }
       return nums;
   }
	public static void main(String[] args) {
//		int n=1534236469;
//		int ans=0;
//		int prev=0;
//		while(n!=0) {
//			int digit=n%10;
//			ans=ans*10+digit;
//			n=n/10;
//		}
//		System.out.println(ans);
		//System.out.println(reverse(1534236469));
		int a = 1534236469;
	//	System.out.println(reverse(1534236469));
//		System.out.println(a/10);
//	reverse(1534236469);
		int res=0;
		for(int i=0;i<8;i++) {
			res+=(Math.pow(2, i));
		}
		System.out.println(res);
	}
}
