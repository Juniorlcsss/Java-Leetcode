class Solution {
    public int sumOfMultiples(int n) {
        //3 or 5 or 7
        int result = 0;
        for(int i=n; i!=0; i--){
            if(i%7==0){
                result = result + i;
            }
            else if(i%5 == 0){
                result = result + i;
            }
            else if(i%3==0){
                result = result + i;
            }
            else{
                //ignore it
            }
        }
        return result;
    }
}