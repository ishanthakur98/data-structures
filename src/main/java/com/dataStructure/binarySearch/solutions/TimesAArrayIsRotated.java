package com.dataStructure.binarySearch.solutions;

import java.util.ArrayList;

public class TimesAArrayIsRotated {

    /*
        Time complexity: O(N)
        Space complexity: O(1)
     */

    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums.get(mid) < nums.get(high)){
                high = mid;
            } else if (nums.get(mid) > nums.get(high)) {
                low = mid + 1;
            }else {
                high--;
            }
        }
        return low;
    }

    }
