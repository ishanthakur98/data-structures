package com.dataStructure.binarySearch.solutions;

public class SquareRoot {

    public int floorSqrt(int n) {

        int low = 0;
        int high = n/2;

        while(low <= high){
            int mid = low + (high - low)/2;
            long sq = (long) mid * mid;
            if(sq == n) return mid;
            else if(sq > n) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
}
