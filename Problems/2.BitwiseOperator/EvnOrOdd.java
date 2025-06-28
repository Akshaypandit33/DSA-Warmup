// write a program to check whether the number is even or odd by using bit-wise operator

import java.util.Scanner;

public class EvnOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if((num & 1) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }

}
