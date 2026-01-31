package com.dataStructure.binarySearch.solutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L875KokoEatingBananas {

    public  int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low<=high){
            int mid = low + (high - low)/2;
            boolean isPossible = canFinish(piles,mid,h);
            if(isPossible){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return high;
    }
    public  boolean canFinish(int[] piles, int hourly,int h){

        for(int i = 0;i<piles.length;i++){
            int currPile = piles[i];
            h = h - (currPile + hourly - 1)/hourly;
            if(h<0){
                return false;
            }
        }
        return true;
    }
}
