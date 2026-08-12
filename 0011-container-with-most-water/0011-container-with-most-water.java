class Solution {
    public int maxArea(int[] height) {
        int max= 0,i=0,j=height.length-1,k =0;
        while(i<j){
            k= Math.min(height[i],height[j])*(j-i);
            if (k>max){
                max = k;
            }
        if(height[i] < height[j]){
            i++;
        }
        else{
            j--;
        }
        }
        return max;
    }
    

}