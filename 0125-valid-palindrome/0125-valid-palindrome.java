class Solution {
    public boolean isPalindrome(String s) {
        boolean f = true;
        
        s= s.toLowerCase();
        s= s.replaceAll("[^a-z0-9]","");
        int i =0,j=s.length()-1;
        while(f &&i<j){
            if(s.charAt(i)!=s.charAt(j)){
                f = false;
            }
            i++;
            j--;
        }
        return f;
    }
}