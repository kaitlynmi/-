class Solution {
    public int minDeletionSize(String[] strs) {
        // void case
        if (strs.length <= 1) return 0;
        // number of columns / string length
        int nColumns = strs[0].length();
        //an array of booleans, each index represents a colomn. 
        //True means the corresponding column is unsorted.
        boolean [] columnFlag = new boolean[nColumns]; 
        int count = 0;
        for( int i =1;i<strs.length; i++){ //strs.length > 1
            for (int j = 0; j< nColumns;j++){
                if (columnFlag[j] == false && strs[i-1].charAt(j) > strs[i].charAt(j)){
                    count++;
                    columnFlag[j] = true;
                }
            }
        }
        return count;
    }

    public int minDeletionSizeMod(String[] strs) {
        // String length.
        int K = strs[0].length();

        // Variable to store the count of columns to be deleted.
        int counter = 0;
        // Iterate over each index in the string.
        for (int col = 0; col < K; col++) {
            // Iterate over the strings.
            for (int row = 1; row < strs.length; row++) {
                // Characters should be in increasing order, 
                // If not, increment the counter.
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}