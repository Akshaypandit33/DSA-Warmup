# DSA-Warmup

# 1. Number System
## Decimal To Binary
#### Algorithms
1. Take Input from user (n)
2. Start loop while n > 0
3. keep dividing the number by 2
4. store the remainder
5. print the remainder in reverse
``` java
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
```

# 2. Bit-Wise Operators

## Check Number is Even or Odd

### Trick:
Binary TimeLine

| Decimal Number | 8   | 4   | 2   | 1   | & 1 |
| -------------- | --- | --- | --- | --- | --- |
| 8              | 1   | 0   | 0   | 0   | 0   |
| 4              | 0   | 1   | 0   | 0   | 0   |
| 5              | 0   | 1   | 0   | 1   | 1   |
| 3              | 0   | 0   | 1   | 1   | 1   |
| 2              | 0   | 0   | 1   | 0   | 0   |
| 1              | 0   | 0   | 0   | 1   | 1   |
**Note** : we can observe that ending bits of the odd number is 1, and after performing **&** operation we will also get the last digit as 1

``` java
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
```

## Number of 1 Bits
[Leetcode Link](https://leetcode.com/problems/number-of-1-bits/)

``` java
public static int hammingWeight(int n) {  
    int result=0;  
    while(n != 0)  
    {  
        int lsb = n&1;  
        if(lsb == 1)  
        {  
            result += 1;  
        }  
        n = n >> 1;  
    }  
    return result;  
}
```


## Optimized Conversion of Number System

### Decimal To Binary

using bit-wise operator

``` java
public static String toBinary(int num) {  
    String result = "";  
  
    // num = 10  
    //binary of 10 = 1010    while (num != 0)  
    {  
        int lsb = num & 1;  
        result = lsb + result;  
        num = num >>1;  
    }  
    return result;  
}
```
### Binary To Decimal

``` java
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
```
