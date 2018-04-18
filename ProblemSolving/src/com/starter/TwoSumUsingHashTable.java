package com.starter;

import java.util.HashMap;
import java.util.Map;

/*Two pass hash table is used and we traverse through the list exaclt twice
Time Complexity: O(n)
Space Complexity: O(n)*/

public class TwoSumUsingHashTable {
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i =0 ; i<nums.length;i++) {
			int complement = target-nums[i];
			if(map.containsKey(complement) && map.get(complement)!=i) {
				return new int[] {i,map.get(complement)};
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
