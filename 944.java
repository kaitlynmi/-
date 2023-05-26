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

}