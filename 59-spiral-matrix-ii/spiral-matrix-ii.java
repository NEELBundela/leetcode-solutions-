class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top =0;//f row
        int bottom = n-1;//l row
        int left = 0;//f coloumn
        int right = n-1;//l coloumn

        int num = 1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                matrix[top][i] = num++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;

            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=num++;
                }
                left++;
            }
        }

        return matrix;
    }
}