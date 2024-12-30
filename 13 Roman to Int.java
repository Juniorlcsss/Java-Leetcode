class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();

        //add values to hashmap
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);

        //replace values in the string to make it easier with our hash value
        s=s.replace("IV","IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        
        //for loop thru the string
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            ans = ans + (values.get(s.charAt(i)));
        }
        return ans;
    }
}