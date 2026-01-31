package com.dataStructure.binarySearch.solutions;

public class FloorAndCeil {

    public int[] getFloorAndCeil(int[] nums, int x) {
        int ceil = ceil(nums,x);
        int floor = floor(nums,x);
        int updateCeil = ceil == -1 ? -1 : nums[ceil];
        int updatedFloor = floor == -1  ? -1 : nums[floor];
        return new int[]{updatedFloor,updateCeil};
    }

    public int floor(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int floor = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= x){
                floor = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return floor;
    }
    public int ceil(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ceil = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= x){
                ceil = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ceil;
    }
}
