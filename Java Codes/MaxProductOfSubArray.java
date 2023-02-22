package learningJava;

public class MaxProductOfSubArray {

	public static void main(String[] args) {
		
	}
}
class s{
	public int maxProduct(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int minProduct=nums[0];
		int maxProduct=nums[0];
		int sol=nums[0];
		for(int i=0;i<nums.length;i++) {
			int temp1=Math.min(nums[i]*minProduct,nums[i]*maxProduct);
			int temp2=Math.min(nums[i]*minProduct,nums[i]*maxProduct);
			minProduct=Math.min(temp1, nums[i]);
			maxProduct=Math.max(temp2,nums[i]);
			sol=Math.max(maxProduct, sol);
		}
	}
}
