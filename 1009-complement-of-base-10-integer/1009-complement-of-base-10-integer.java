class Solution {
    public int bitwiseComplement(int n) {
        int result=0;
        int power=1;
        if(n==0){
            return 1;
        }
        while(n>0){
            result +=(n%2 ^ 1)*power;
            power<<=1;
            n>>=1;
        }
        return result;
            
    }
}