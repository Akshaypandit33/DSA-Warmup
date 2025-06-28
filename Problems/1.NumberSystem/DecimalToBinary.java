//Algorithm

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ToBinary(num);
        sc.close();
    }

    public static void ToBinary(int n){
        String res = "";

        while(n > 0)
        {
            int rem = n%2;
            n = n/2;
            res = rem + res;
        }
        System.out.println(res);

    }
}
