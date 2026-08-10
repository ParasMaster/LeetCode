class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0 , j=1 ,k=0;
        int l = nums.length;
        nums[k] = nums[i];
        k++;
        while(i != l-1){
            if (nums[i] == nums[j]){
                
            }
            if(nums[i] != nums[j]){
                nums[k] = nums[j];
                k++;
            
            }
            j++;
            i++;
        }
        return k;
    }
}