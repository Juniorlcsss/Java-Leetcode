class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> vals = new HashMap<Character, Integer>();

        //go thru magazine and put all the chars 
        for(int i=0; i<magazine.length(); i++){
            char m = magazine.charAt(i);
            vals.put(m,vals.getOrDefault(m,0)+1);
        }

        //now remove the stored vals and if there arent enough return false
        for(int j=0; j<ransomNote.length(); j++){
            char r = ransomNote.charAt(j);
            if(vals.containsKey(r) == false || vals.get(r) == 0){
                //if it doesnt contain the char or if the char's value is 0
                return false;
            }
            else{
                //remove 1 from the hash && loop again
                vals.put(r,vals.get(r)-1);
            }
        }
        //assume true of went thru
        return true;
    }
}