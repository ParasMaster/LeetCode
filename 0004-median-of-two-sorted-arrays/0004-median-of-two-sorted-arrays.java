import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] x = new int[nums1.length+nums2.length];
        double m;
        System.arraycopy(nums1,0,x,0,nums1.length);
        System.arraycopy(nums2,0,x,nums1.length,nums2.length);
        Arrays.sort(x);
        int i =(nums1.length+nums2.length);
        if(i%2 ==0){ 
            m=x[i/2-1] +x[i/2];
            m= m/2;
        }
        else{
            m=x[i/2];
        }
        return m;
    }
}