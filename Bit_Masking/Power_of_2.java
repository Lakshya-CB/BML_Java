package Bit_Masking;

public class Power_of_2 {
	public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        // return (n-(n&-n))==0;
        return (n&(n-1))==0;
    }
}
