class Solution {
    public boolean areNumbersAscending(String s) {
        int temp = -1;
        String[] split = s.split(" ");
        for(int i=0; i<split.length; i++){
            if(Character.isDigit(split[i].charAt(0))){
                if(Integer.parseInt(split[i]) <= temp){
                    return false;
                }
                temp = Integer.parseInt(split[i]);
            }
        }
        return true;
    }
}