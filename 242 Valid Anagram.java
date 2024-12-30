class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        //sort
        Arrays.sort(ss);
        Arrays.sort(tt);
        boolean answer;

        if(Arrays.equals(ss,tt) || ss == tt){
            answer= true;
        }
        else{
            answer=false;
        }
        return answer;
    }
} 