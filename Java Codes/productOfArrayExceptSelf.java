package learningJava;

import java.util.HashMap;

public class productOfArrayExceptSelf {
	public static void main(String[] args) {
		
	}
}
class Solution {
	public int[] productExeptSelf(int[] nums){
		if(nums.length==0) {
			return new int[0];
		}
		int[] sol=new int[nums.length];
		sol[0]=1;
		for(int i=1;i<nums.length;i++) {
			sol[i]=sol[i-1]*nums[i-1];
		}
		int rightProduct=1;
		for(int i=nums.length-1;i>=0;i--) {
			sol[i]=sol[i]*rightProduct;
			rightProduct*=nums[i];
		}
		return sol;
	}
}

