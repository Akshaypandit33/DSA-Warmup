/*
    DescriptionS;
    The parity of binary is 1 if the number of 1s in the word is odd.,
    otherwise, it is 0.
 */

public class CheckParity {
    public static void main(String[] args) {
        System.out.println(checkParity(7));
    }
    public static short checkParity(int n)
    {
        short res =0;
        while( n != 0)
        {
            res = (short) (res ^ (n & 1));
            n=n>>1;
        }
        return res;
    }
}
