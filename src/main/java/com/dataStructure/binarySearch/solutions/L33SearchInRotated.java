package com.dataStructure.binarySearch.solutions;

public class L33SearchInRotated {

    /*
        Time complexity O(log N)
        Space complexity O(1)
     */

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[low] <= nums[mid]) {
                if(nums[mid] > target && nums[low] <= target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else {
                if(nums[mid] < target && nums[high] >= target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
