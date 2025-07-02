public class ClearBitOperation {
    public static void main(String[] args) {
        int clearBitAtIndex = clearBitAtIndex(45,4);
        System.out.println(Integer.toBinaryString(clearBitAtIndex));
        int clearMSB = clearMSB(45,3);
        System.out.println(Integer.toBinaryString(clearMSB));
    }

    //  clear bit or set the bit value to 0
    // num = 45 i.e, Binary = 101101
    // index =3, then the output should 101_0_01
    public static int clearBitAtIndex( int num, int index) {
        int mask =  ~(1 << ( index -1 ));
        return num & mask;
    }

    // clear bit or set all Most significant bit including index value
    // Algorithm
    /*
        here index is inclusing means
        num = 45 i.e, Binary = 101101
    *  step 1: create a mast of left shift 1 with inex 1 << (index-1) and store it.
    *           ex: index =4 then 1<< 3 , 1000
    *  step 2: subtract 1 from the created mask
    *           ex : 1000-1 = 0111
    * step 3: perform AND operation between num and the mask
                ex:  101101
                   & 000111
                   ----------
                     000101
    * */

    public static int clearMSB(int num, int index){
        int mask = (1 << (index)) - 1;
        return num & mask;
    }
}
