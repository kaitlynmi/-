class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int [n][n];
        int horizontalIncrement = 1; //1 t-> 0 t-> -1 f-> 0  f-> 1
        int verticalIncrement = 0;   //0 t-> 1 t->  0 f-> -1 f-> 0
                                     //right down  left   up
        int i = 0;
        int j = 0;
        int count = 1;
        while( count <= n * n){
            matrix[i][j] = count++; //fill in the block
            //find the next block 
            //out of bound or already written
            if (j + horizontalIncrement < 0 || j + horizontalIncrement >= n ||
            i + verticalIncrement < 0 || i + verticalIncrement >= n ||
            matrix[i + verticalIncrement][j + horizontalIncrement] != 0) {
                //turn
                int temp = verticalIncrement;
                verticalIncrement = horizontalIncrement;
                horizontalIncrement = -temp;
            }
            i+= verticalIncrement;
            j+= horizontalIncrement;
        }
        return matrix;
    }

}
