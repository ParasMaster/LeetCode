class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int str =0,stc = 0;
        int stpc = matrix.length;
        int stpr = matrix[0].length-1;
        List<Integer> out= new ArrayList<>();
        while(out.size() != matrix.length * matrix[0].length){
            for(int x =stc;x<=stpr;x++ ){
                out.add(matrix[stc][x]);
            }
            if (stpc == 1){
                break;
            }
            for(int j=str+1;j<stpc;j++ ){
                out.add(matrix[j][stpr]);
            }
            if (stpr == 0){
                break;
            }
            if (str < stpc - 1) {
                for (int k = stpr - 1; k >= stc; k--) {
                    out.add(matrix[stpc - 1][k]);
                }
            }
            if (stc < stpr) {
                for (int l = stpc - 2; l > str; l--) {
                     out.add(matrix[l][str]);
                }
            }

            str++;
            stc++;
            stpr--;
            stpc--;



        }
        return out;
    }
}