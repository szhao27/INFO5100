package moveZeros;

import java.util.Arrays;

public class moveZeros {
   public static int[] moveZeroes(int[] nums) {
	   if(nums.length==0 || nums==null) {
		   return new int[]{-1};
	   }
	   int temp=0;
	   for(int num:nums) {
		   if(num!=0) {
			   nums[temp++]=num;
		   }
		while(temp<nums.length) {
			nums[temp++]=0;
		}
	   }
	   return nums;
   }



public static void main(String[] args) {
	int nums[]= {0,1,0,3,12};
	System.out.println("result= "+Arrays.toString(moveZeroes(nums)));
 }
}