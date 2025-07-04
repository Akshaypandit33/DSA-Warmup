# DSA-Warmup

# 📘 Table of Contents
## 1. Number System

- [Decimal To Binary](#decimal-to-binary)
## 2. Bit-Wise Operators

- [Check Number is Even or Odd](#check-number-is-even-or-odd)
    
- [Number of 1 Bits](#number-of-1-bits)
    
- [Get Bit at i-th Position](#get-bit-at-i-th-position)
    
- [Set Bit at i-th Position](#set-bit-at-i-th-position)
    
- [Clear Bit](#clear-bit)
    
- [Clear All Bits in MSB](#clear-all-bits-in-msb)
    
- [Clear All Bits in LSB](#clear-all-bits-in-lsb)
	
- [Find unique element](#find-unique-element)
	
- [Power of 2](#power-of-2) -----------------------------------[Leetcode -231](https://leetcode.com/problems/power-of-two)
	
- [Power of 4](#power-of-4) -----------------------------------[Leetcode-342](https://leetcode.com/problems/power-of-four)
	
- [Flip the Bit](#flip-the-bits) -----------------------------------[Leetcode - 1009](https://leetcode.com/problems/complement-of-base-10-integer/description)

    
- [Optimized Conversion of Number System](#optimized-conversion-of-number-system)
    
    - [Decimal To Binary (Bitwise)](#decimal-to-binary-bitwise)
        
    - [Binary To Decimal](#binary-to-decimal)
        
## 3. Mathematics Problems

- [Reverse Integer](#reverse-integer)

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

## **Some Important Properties**

``` XOR properties
	a^b=c => b^c=a 
	x^0 = x 
	x^x = 0
```

``` tricks

	1<<n = 2^n 
	get ith Set bit Number: (1<<i) 
	get ith Unset bit Number: ~(1<<i) 
	
	## Check ith bit of a Number is Set or Not 
	if((a&(1<<i))!=0) cout<<"Yes";
```

``` tricks
  
## count set bit 
	a&1 == 1 (Odd digit) 
	a>>1 -> Divided by 2
	a<<1 -> Multiply by 2
```

``` trick
## Set ith bit of a number => 
num = num|(1<<i);

## Unset ith bit of a number => 
num = num&(~(1<<i));

## Check 2^n or Not
(n&(n-1)==0) // Yes

/*
Set union A | B
Set intersection A & B
Set subtraction A & ~B
Set negation ALL_BITS ^ A or ~A
Set bit A |= 1 << bit
Clear bit A &= ~(1 << bit)
Test bit (A & 1 << bit) != 0
Extract last bit A&-A or A&~(A-1) or x^(x&(x-1))
Remove last bit A&(A-1)
Get all 1-bits ~0
*/
```

```trick

### XOR of elements in the Range in [L,R] in O(1) time. 
int f(int n){
    if(n%4==0) return n;
    else if(n%4==1) return 1;
    else if(n%4==2) return n+1;
    else return 0;
}
int findXOR(int L, int R){
    return f(L-1)^f(R);
}
```


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

##  Number of 1 Bits
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



##  Get Bit at `i-th` Position

#### ✅ Purpose:

Check whether the **i-th bit (0-indexed from right)** in an integer is **set (1)** or **unset (0)** using **bit manipulation**.

``` java
public static boolean getBit(int  num, int i)  
{  
  
    return(num &(1 << i)) !=0;  
}
```
If I returns true it means the bit at that location is 1.



## Set Bit at `i-th` Position
### 📌 Purpose:

Set the `i-th` bit to **1** (regardless of its current value).

``` java
public static int setBit(int  num, int i)  
{  
    return num | (1 <<i);  
}
```

## Clear Bit
### 📌 Purpose:

Clear (set to 0) the `i-th` bit in an integer.

### Algorithm

``` Algorithm
Input: num (integer), index (1-based bit position from right)

1. Calculate the bit position:
   position = index - 1   // convert to 0-based

2. Create the mask:
   mask = ~(1 << position)
   // This creates a mask where only the 'position'th bit is 0

3. Clear the bit using bitwise AND:
   result = num & mask

4. Return the result

```

### code
```java
//  clear bit or set the bit value to 0  
// num = 45 i.e, Binary = 101101  
// index =3, then the output should 101_0_01  
public static int clearBitAtIndex( int num, int index) {  
    int mask =  ~(1 << ( index -1 ));  
    return num & mask;  
}
```

## Clear All Bits in MSB
###  📌Purpose of `clearMSB`

The goal is to **clear (set to 0)** all bits from the **most significant bit down to and including the given bit index**.

- Think of it as keeping only the **least significant `index` bits**, and clearing everything to the left.

### Algorithm
``` Algorithm
Input: num (integer), index (1-based from right)

1. Create a mask:
   mask = (1 << index) - 1
   This creates a bitmask with only the lowest `index` bits as 1

2. AND num with mask:
   result = num & mask

3. Return result

```

### Code
``` java
public static int clearMSB(int num, int index) {
    int mask = (1 << index) - 1;  // step 1 & 2: generate mask
    return num & mask;            // step 3: clear MSB bits
}

```

### Example
``` Example
  num = 45 i.e, Binary = 101101  
  step 1: create a mast of left shift 1 with inex 1 << (index-1) and store it.  
           ex: index =3 then 1<< 3 , 1000  
  step 2: subtract 1 from the created mask  
          ex : 1000-1 = 0111  
 step 3: perform AND operation between num and the mask  
            ex:  101101
               & 000111               
               ----------                 
                 000101
```

##  Clear All Bits in LSB 
### Purpose :
Clear (set to 0) all bits **from position `i` down to 0**, and **keep the bits above `i` unchanged**. 

``` understanding the idea

Suppose:

- `num = 45` → Binary: `101101`
- `i = 2` → You want to clear bits at positions 2, 1, 0

Expected:

Original:     101101
Index:           ^^^  ← clear these
Result:      101000

```


### Algorithm
#### Step-by-Step:

##### 🔹 Step 1: Start with all 1s

In Java, `-1` is represented as all 1s in binary (because of 2’s complement):

	`-1 → 11111111 11111111 11111111 11111111 (32-bit)`

##### 🔹 Step 2: Shift left by (i + 1)

	`int mask = -1 << (i + 1);`

If `i = 2`, then:
	- `-1 << 3` means shift all bits left by 3:

`Before shift: 11111111 11111111 11111111 11111111 After shift:  11111111 11111111 11111111 11111000`

Now, the **lowest 3 bits are 0**, everything else is 1.

---

#### Step 3: AND with `num`

Now do:

	`result = num & mask;`

This will **turn off bits 0 through i**, keeping higher bits unchanged.

### Code

``` Java
public static int clearLSB(int num, int index) {  
    int mask = -1 << (index+1);  
    return num & mask;  
}
```


## Find Unique Element

### problem:

 Find the unique element from a set of an array where all elements appear twice only one element appear once  
 ex {1,2,3,4,1,2,3}
#### Trick
``` trick
XOR cancels same number i.e.,
 1 ^ 1 = 1
 1 ^ 0 = 0
 0 ^ 1 = 0
 0 ^ 0 = 1
```

``` java
public static int findUnique(int[] arr)  
{  
    int unique =0;  
    for(int ele : arr)  
    {  
        unique = unique^ ele;  
    }  
    return unique;  
}
```


## Power Of 2

[LeetCode -231](https://leetcode.com/problems/power-of-two)
### ✅ Step-by-Step Breakdown:

---

#### 🔹 Step 1: Check if `n` is less than 1

``` java
if(n < 1) {
	return false;
}
```

- **Why?**
    
    - Powers of two are **positive integers**: 1, 2, 4, 8, 16, 32, ...
        
    - Any number ≤ 0 cannot be a power of two.
        
- **Examples**:
    
    - `n = 0` → return `false`
        
    - `n = -8` → return `false`
        

---

#### 🔹 Step 2: Use Bitwise AND Trick

``` java
return (n & (n - 1)) == 0;
```

- **What does this mean?**
    
    - Powers of two have **exactly one `1` bit** in binary.
        
        - 1 → `0001`
            
        - 2 → `0010`
            
        - 4 → `0100`
            
        - 8 → `1000`
            
    - Subtracting 1 flips the bits to the right of the `1` bit.
        
        - Example:
            
            - `8` in binary: `1000`
                
            - `8 - 1 = 7`: `0111`
                
            - `8 & 7 = 1000 & 0111 = 0000`
                
- **If result is 0**, then `n` is a power of two.
    
- **Why does this work?**
    
    - The only time `(n & (n - 1)) == 0` is **when `n` has only one `1` bit**, i.e., it’s a power of 2.

``` java
public static boolean isPowerOfTwo(int n) {  
    if(n<1)  
    {  
        return false;  
    }  
    return (n & (n-1)) ==0;  
}
```


## Power Of 4  
#### [Leetcode-342](https://leetcode.com/problems/power-of-four)


``` java
public static boolean isPowerOf4(int n) {  
    return ((n & n - 1) == 0) && ((n - 1) % 3 == 0);  
}
```


## Flip the Bits 
### [Leetcode - 1009](https://leetcode.com/problems/complement-of-base-10-integer/description)

### Problem
The **bitwise complement** of a binary number flips 1s to 0s and 0s to 1s.

For example:  
`n = 5`  
Binary: `101`  
Complement: `010` → which is `2` in decimal

``` Notes
if n=5 
n          = ...00000000000000000000000000000101
(~n)       = ...11111111111111111111111111111010
(mask)     = 00000000000000000000000000000111
Result     = 00000000000000000000000000000010 = 2

```

``` java

    public int bitwiseComplement(int n) {

        // base case

        if(n==0) return 1;
        int num = n;
        int mask =0;
        while(num != 0)
        {
            mask = mask << 1 | 1;
            num = num >> 1;
        }

        return (~n) & mask;
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


# **3. Mathematics problems**

## Reverse Integer
[Leetcode Link](https://leetcode.com/problems/reverse-integer/)

### Problem Statement
Given a signed 32-bit integer `x`, return `x` _with its digits reversed_. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

**Example 1:**

**Input:** x = 123
**Output:** 321

**Example 2:**

**Input:** x = -123
**Output:** -321

**Example 3:**

**Input:** x = 120
**Output:** 21

### Solution

```java
    public int reverse(int x) {

        int result =0;
        while(x != 0)

        {
            int num = x%10;
            if(result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10)

            {
                return 0;

            }
            result = result * 10 + num;
            x= x/10;
        }
        return result;

    }
```



