class Solution {
    public String restoreString(String s, int[] indices) {
        //turn string s into character array
        char[] finalArr = new char[s.length()];


        for(int i=0; i < s.length(); i++){
            int temp = indices[i];
            finalArr[temp] = s.charAt(i);
        }
        //turn finalArr into a string
        //return finalArr.toString();
        return String.valueOf(finalArr);
    }
}