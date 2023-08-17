class Solution {

    public  void swap(int [][] matrix){

        for(int j =0;j<matrix[0].length;j++){
            int bottom = matrix.length - 1;
            for(int i=0;i<matrix.length/2;i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                bottom--;
            }
        }
    }
    public  void swap2(int [][] matrix){

        for(int i =0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
    public void rotate(int[][] matrix) {
        
        swap(matrix);
       

        /*for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }*/
         swap2(matrix);
        
    }
}