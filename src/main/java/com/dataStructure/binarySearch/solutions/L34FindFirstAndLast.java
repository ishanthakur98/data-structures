package com.dataStructure.binarySearch.solutions;

public class L34FindFirstAndLast {

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int firstOccur = firstOccur(nums , target);
        int lastOccur = lastOccur(nums,target);

        return new int[]{firstOccur,lastOccur};
    }

    public int firstOccur(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res == -1 ? -1 : nums[res];
    }

    public int lastOccur(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res == -1 ? -1 : nums[res];
    }
}
