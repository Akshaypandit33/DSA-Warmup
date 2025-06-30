public class NumberSystem {
    public static void main(String[] args) {
        int num =26;
        System.out.println("Binary of "+num+" is: "+ toBinary(num));
        int binary = 11010;
        System.out.println("Decimal of "+binary+" is: "+ toDecimal(binary));
    }

    public static String toBinary(int num) {
        String result = "";

        // num = 10
        //binary of 10 = 1010
        while (num != 0)
        {
            int lsb = num & 1;
            result = lsb + result;
            num = num >>1;
        }
        return result;
    }

    public static int toDecimal (int binary)
    {
        int result =0;
        // binary = 1010
        int index =0;

        while (binary != 0)
        {
            int lastBit = binary % 10;
            if(lastBit ==1)
            {
                result = (int) (result + Math.pow(2, index));
            }
            binary = binary / 10;
            index++;
        }
        return result;
    }
}
