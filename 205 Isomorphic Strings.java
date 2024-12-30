class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> vals = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++){
            //chars
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(vals.containsKey(sc)){
                if(vals.get(sc) == tc){
                    //do nothing
                }
                else{
                    return false;
                }
            }
            else if(vals.containsValue(tc)){
                return false;
            }
            else{
                vals.put(sc,tc);
            }
        }
        //if it gets thru loop assume true
        return true;
    }
}