public class setMatrixZero {
    
    public static void setZeroes(int[][] matrix) {
        int []temp = new int[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    for(int k =0;k<matrix[0].length;k++){
                        if(matrix[i][k] == 0){
                            System.out.println("inIf");
                            temp[k] = -1;
                        }
                        matrix[i][k] = 0;
                    }
                    break;
                }
            }
        }

        for(int i = 0;i<temp.length;i++){
            if(temp[i] == -1){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }

        for(int i = 0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        /*for(int i=0;i<matrix.length;i++){
            if(temp[i] == -1){
                clearCol(matrix,i,matrix.length);
            }
        }*/
    }
    public static void main(String[] args){

        int[][] matrix = new int [][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);

    }
}
