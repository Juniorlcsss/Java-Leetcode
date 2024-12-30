class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //arrays are sorted
        for(int i=0; i<matrix.length; i++){
            if(matrix[i].length == 1){
                if(target == matrix[i][0]){
                    return true;
                }
                else{
                    //continue
                }
            }
            else if(matrix[i].length == 2){
                int high = matrix[i][1];
                int low = matrix[i][0];
                if(target == high || target == low){
                    return true;
                }
                else{
                    //do nothing
                }
            }
            else{
                int first = matrix[i][0];
                int last = matrix[i][matrix[i].length-1];
                int mid = matrix[i][(matrix[i].length-1)/2];
                int current = 0; //keep first by default
                if(target == first || target==last||target==mid){
                    return true;
                }
                else if(target > last){
                    //skip
                }
                else if(target > mid){
                    // check the array, has to be between mid and last
                    current = ((matrix[i].length-1)/2)+1;
                    while(current < (matrix[i].length-1) ){
                        if(matrix[i][current] == target){
                            return true;
                        }
                        else{
                            current++;
                        }
                    }
                    break;//gone thry and failed
                }
                else if(target> first){
                    //check array, has to be between first and mid
                    current = 1; //
                    while( current < ((matrix[i].length-1)/2) ){
                        if(matrix[i][current] == target){
                            return true;
                        } 
                        else{
                            current++;
                        }
                    }
                }
                else{
                    //error!

                }
            }
        }
        //default
        return false;
    }
}