class Solution {
    public boolean isUgly(int n) {
        if(n<1){
            return false;
        }
        else if(n/2>0){
            return true;
        }
        else if(n/3>0){
            return true;
        }
        else if(n/5>0){
            return true;
        }
        else{
            return false;
        }
    }
}