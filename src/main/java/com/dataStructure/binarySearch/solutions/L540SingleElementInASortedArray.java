package com.dataStructure.binarySearch.solutions;

public class L540SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length - 1] != nums[nums.length -2]) {
            return nums[nums.length - 1];
        }
        int low = 1;
        int high = nums.length - 2;

        while (low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid + 1] != nums[mid] && nums[mid - 1] != nums[mid]){
                return nums[mid];
            }else if (mid%2 ==0) {
                if(nums[mid + 1] != nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(nums[mid - 1] != nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
