package learningJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayQuestiohns {
	public static void main(String[] args) {

	}
	static int[] twoSum( int[] nums,int target) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp=nums[i]-target;
			if(hm.containsKey(temp)) {
				return new int[] {nums[i],i};
			}
			hm.put(nums[i], i);
		}
		return  	new int[0];
	}
	static int maxProfit(int[] prices) {
		if(prices.length==0) {
			return 0;
		}
		int minSoFar=prices[0];
		int maxProfit=0;
		for (int i = 0; i < prices.length; i++) {
			minSoFar=Math.max(maxProfit, prices[i]);
			maxProfit=Math.max(maxProfit, prices[i]-minSoFar);
		}
		return maxProfit;
	}
	static boolean containDuplicate(int[] nums) {
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(!hs.add(nums[i])) {
				return true;
			}
		}
		return false;
	}
	static int[] productExceptSelf(int[] nums) {
		if(nums.length==0) {
			return new int[0];
		}
		int sol[] =new int[nums.length];
		sol[0]=1;
		for (int i = 1; i < nums.length; i++) {
			sol[i]=sol[i-1]*nums[i-1];
		}
		int rightProduct=1;
		for (int i = nums.length-1;i>=0; i--) {
			sol[i]=sol[i]*rightProduct;
		}
		return sol;
	}
	static int maxSubArray(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int tempSum=nums[0],maxSum=nums[0];
		for (int i = 0; i < nums.length; i++) {
			tempSum=Math.max(tempSum+nums[i], nums[i]);
			maxSum=Math.max(maxSum, tempSum);
		}
		return maxSum;
	}
	static int maxProduct(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int minProduct=nums[0];
	    int sol=nums[0];
		int maxProduct=nums[0];
		for (int i = 0; i < nums.length; i++) {
			int temp1=Math.min(nums[i]*minProduct, nums[i]*maxProduct);
			int temp2=Math.max(maxProduct*nums[i], minProduct*nums[i]);
			minProduct=Math.min(nums[i], temp1);
			maxProduct=Math.max(nums[i], temp2);
			sol=Math.max(maxProduct, minProduct);
		}
		return sol;
	}
}
