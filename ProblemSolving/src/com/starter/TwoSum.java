package com.starter;


/*Loop through each element xx and find if there is another value that equals to target - x.
 * Brute Force Approach
 * Time complexity : O(n^2) For each element, we try to find its complement by looping through the rest of array which takes O(n)O(n) time. Therefore, the time complexity is O(n^2)
 * Space complexity : O(1)
*/

public class TwoSum {

	public static int[] twoSum(int nums[], int target) {
		for(int i= 0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j] == target-nums[i]) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] arr = {2,7,15,9};
		int target = 9;
		int arrSum[]= twoSum(arr,target);
		for(int i=0;i<arrSum.length;i++)
		System.out.println(arrSum[i]);
		//System.out.println("Array sum is[" +twoSum(arr,target)+"]");
		//System.out.println(arrSum.toString());
	}
	
}
