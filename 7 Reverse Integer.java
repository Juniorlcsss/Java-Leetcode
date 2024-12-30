class Solution {
    public int reverse(int x) {
        long returnInt =0;
        //long bigX = Math.abs(x);
        if(x < -2147483647 || x > 2147483647){
            return 0;
        }
        else if(x > 0){
            //pos num
            String str = Long.toString(x);
            String revStr = new StringBuilder(str).reverse().toString();
            returnInt = Long.parseLong(revStr);
            if(Math.abs(returnInt) > 2147483647){
                return 0;
            }
            else{
                return (int)returnInt;
            }
        }
        else if(x < 0){
            //negative num
            long value = Math.abs(x);
            String str = Long.toString(value);
            String revStr = new StringBuilder(str).reverse().toString();
            returnInt = Long.parseLong(revStr) * -1;
            if(Math.abs(returnInt) > 2147483647){
                return 0;
            }
            else{
                return (int)returnInt;
            }
        }
        else if(x == 0){
            return 0;
        }
        else{
            //error
            return 0;
        }
    }
}