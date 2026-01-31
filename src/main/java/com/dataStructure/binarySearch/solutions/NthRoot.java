package com.dataStructure.binarySearch.solutions;

public class NthRoot {

    public int NthRoot(int N, int M) {
        if(M == 0) return 0;
        if(M == 1) return 1;
        if(N == 1) return M;
        int low = 1;
        int high = M;

        while(low<=high){
            int mid = low + (high - low)/2;

            long sq = 1;
            boolean exceed = false;
            for(int i = 1; i <= N;i++){
                sq = sq * mid;
                if(sq > M){
                    exceed = true;
                    break;
                }
            }
            if(!exceed && sq == M)return mid;
            else if(exceed || sq > M) high = mid-1;
            else low = mid + 1;
        }
        return -1;
    }
}
