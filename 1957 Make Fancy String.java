class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        char temp = '/';
        char[] carray = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            if(carray[i] == temp){
                count++;
            }
            else{
                temp = carray[i];
                count = 1;
            }
            if(count < 3){
                res.append(carray[i]);
            }
            else{
                //skip it
            }
        }
        return res.toString();
    }
}