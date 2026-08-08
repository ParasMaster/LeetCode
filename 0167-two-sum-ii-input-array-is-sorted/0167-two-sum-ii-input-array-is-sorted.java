class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x,i=0,j=numbers.length-1;
         x= numbers[i]+numbers[j];
        while(x != target){
            if (numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
            x= numbers[i]+numbers[j];

        }
        int[] out = {i+1,j+1};
        return out;
    }
}