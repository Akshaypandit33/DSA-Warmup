public class MinimumFlips {
    public static void main(String[] args) {
        System.out.println(minimumFlips1(1,2,3));
    }

    // bruteforce-approach
    public static int minimumFlips1(int a, int b, int c) {
        short flips=0;

        // iterate while all values are not equal to zero
        while(a !=0 || b!=0 || c!=0){

            // check only if the bits position of (a OR b) not equal to c
            if(((a & 1) | (b & 1)) != (c & 1))
            {

                // if both a and b is equal to 1 then obviously the value of c is zero
                // and we can't make ( a OR b) zero with only one flips, so in this case we need two flips
                if(((a & 1) == 1) && ((b & 1) == 1))
                {
                    flips ++;
                    flips ++;
                }
                else
                {
                    flips ++;
                }
            }
            a= a>>>1;
            b= b>>>1;
            c= c>>>1;
        }
        return flips;
    }
}
