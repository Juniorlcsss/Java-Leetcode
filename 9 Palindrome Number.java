class Solution {
    public boolean isPalindrome(int x) {
        boolean answer;
        char[] arr = (""+x).toCharArray();
        int length = String.valueOf(x).length();
        char[] flippedArr = new char[length];


        if(length == 1){
            answer = true;
        }
        else{
            //flip array

            for(int i=0, j=length; i<length; i++, j--){
                flippedArr[i] = arr[j-1];
            }

            if(Arrays.equals(flippedArr, arr) == true){
                answer = true;
            }
            else{
                answer = false;
            }
        }
        return answer;
    }
}