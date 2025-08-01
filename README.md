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
	
- [Find unique element / Single Element](#find-unique-element)-------[Leetcode - 136](https://leetcode.com/problems/single-number/description/)
	
- [Power of 2](#power-of-2) -----------------------------------[Leetcode -231](https://leetcode.com/problems/power-of-two)
	
- [Power of 4](#power-of-4) -----------------------------------[Leetcode-342](https://leetcode.com/problems/power-of-four)
	
- [Flip the Bit](#flip-the-bits) -----------------------------------[Leetcode - 1009](https://leetcode.com/problems/complement-of-base-10-integer/description)
	
- [Check Parity of the word](#check-parity-of-the-word)
	
- [Swap Bits](#swap-bits)
	
- [Minimum flips](#minimum-flips)--------------------------------[Leetcode - 1318](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/)
	
- [Single Number II](#single-number-ii)-----------------------------[Leetcode - 137](https://leetcode.com/problems/single-number-ii/)
	
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


## **Hexa Decimal Chart**
## Hexadecimal to Binary Mapping and Bitmask Patterns

### 📘 Hex ↔ Binary Mapping Table

| Binary | Hex |     | Binary | Hex |
|--------|-----|-----|--------|-----|
| 0000   | 0   |     | 1000   | 8   |
| 0001   | 1   |     | 1001   | 9   |
| 0010   | 2   |     | 1010   | A   |
| 0011   | 3   |     | 1011   | B   |
| 0100   | 4   |     | 1100   | C   |
| 0101   | 5   |     | 1101   | D   |
| 0110   | 6   |     | 1110   | E   |
| 0111   | 7   |     | 1111   | F   |

---

### 🔧 Common Bitmask Patterns

| Binary Pattern                   | Hex Value    | Purpose                        |
|----------------------------------|--------------|--------------------------------|
| `10101010 10101010 10101010 10101010` | `0xAAAAAAAA` | Mask odd-positioned bits       |
| `01010101 01010101 01010101 01010101` | `0x55555555` | Mask even-positioned bits      |
| `11110000 11110000 11110000 11110000` | `0xF0F0F0F0` | High 4-bit nibbles of bytes    |
| `00001111 00001111 00001111 00001111` | `0x0F0F0F0F` | Low 4-bit nibbles of bytes     |
| `11111111 00000000 11111111 00000000` | `0xFF00FF00` | High bytes (8-bit chunks)      |
| `00000000 11111111 00000000 11111111` | `0x00FF00FF` | Low bytes (8-bit chunks)       |
| `11001100 11001100 11001100 11001100` | `0xCCCCCCCC` | Swap 2-bit pairs               |
| `00110011 00110011 00110011 00110011` | `0x33333333` | Opposite of 2-bit pair mask    |

---

### 📌 Tip

To convert a binary pattern to hex:
1. Break it into 4-bit groups from left to right.
2. Use the table above to map each 4-bit group to its hex equivalent.
3. Combine all hex values to get the full hexadecimal representation.

---

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

### [Leetcode - 136](https://leetcode.com/problems/single-number/description/)

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


## Check parity of the word

### Description

The parity of binary is 1 if the number of 1s in the word is odd.,  
otherwise, it is 0.

``` Example

For `n = 5` → binary `101`

- 1st bit: 1 → `res = 0 ^ 1 = 1`
    
- 2nd bit: 0 → `res = 1 ^ 0 = 1`
    
- 3rd bit: 1 → `res = 1 ^ 1 = 0` → even number of 1s
    

✔️ Final result: `0` → even parity
```

``` java
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
```


## Swap Bits

### Description

swap the bits at position i and j in the binary representation of the number x


### Working of the code
``` working
	Binary of x is : 1001001
	mask is : 1000010
	Result : 1011
```


``` java
public static int swapBits(int x, int i, int j) {  
    // extract the bits value at i-th position and j-th bit and check whether they are same or not  
    
    if( ((x >>> i) & 1) != ((x >>> j) & 1))  
    {  
        // we will using bitmasks to flip the bit using XOR at the i and j position  
        int mask = (1 << i) | (1 << j);   
        // performing XOR  
        x = x^ mask;  
    }  
    return x;  
}
```


## Minimum flips
### [Leetcode 1318](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/)

Given 3 positives numbers `a`, `b` and `c`. Return the minimum flips required in some bits of `a` and `b` to make ( `a` OR `b` == `c` ). (bitwise OR operation).  
Flip operation consists of change **any** single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/01/06/sample_3_1676.png)

**Input:** a = 2, b = 6, c = 5
**Output:** 3
**Explanation:** After flips a = 1 , b = 4 , c = 5 such that (`a` OR `b` == `c`)

**Example 2:**

**Input:** a = 4, b = 2, c = 7
**Output:** 1

**Example 3:**

**Input:** a = 1, b = 2, c = 3
**Output:** 0

**Constraints:**

- `1 <= a <= 10^9`
- `1 <= b <= 10^9`
- `1 <= c <= 10^9`


### Brute force approach

``` java
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
```


## Single Number II 

### [Leetcode - 137](https://leetcode.com/problems/single-number-ii/)

Given an integer array `nums` where every element appears **three times** except for one, which appears **exactly once**. _Find the single element and return it_.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**

**Input:** nums = [2,2,3,2]
**Output:** 3

**Example 2:**

**Input:** nums = [0,1,0,1,0,1,99]
**Output:** 99


### Algorithm

### **Steps**:

1. **Initialize** a variable `res = 0` to store the final result (the unique number).
    
2. **Repeat** for each bit position `k` from `0` to `31` (because integers are 32-bit):
    
    - 2.1. Initialize a counter `countOnes = 0` to store the number of 1s at the `k`-th bit position across all elements.
        
    - 2.2. **For each element** `ele` in the array:
        
        - 2.2.1. Right shift the element by `k` bits: `ele >> k`.
            
        - 2.2.2. Perform bitwise AND with `1` to extract the `k`-th bit: `((ele >> k) & 1)`.
            
        - 2.2.3. If the `k`-th bit is `1`, increment `countOnes`.
            
    - 2.3. After checking all elements, check if `countOnes % 3 == 1`:
        
        - 2.3.1. If true, it means the unique element has `1` at the `k`-th bit.
            
        - 2.3.2. Set the `k`-th bit in result using: `res = res | (1 << k)`.
            
3. **Return** the final result `res`, which contains the unique number.

``` java

public static int singleNumber2(int[] arr) {  
    int res =0;  
  
    // run the loops till last bit that is for int the last bit is 31  
    for(int k=0; k < 32; k++)  
    {  
        int countOnes=0;  
  
        int temp = 1 << k;  
  
        for(int ele : arr)  
        {  
            if( ((ele >> k) & 1) == 1)  
            {  
                countOnes++;  
            }  
        }  
        if(countOnes % 3 == 1)  
        {  
            res = res | temp;  
        }  
    }  
return res;  
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





# 4. Arrays

### Important Points

- Store similar data inside
- Arrays are static in size i.e., we have to initialize an array with size
``` java
int[] arr = new int[5];
```

### Time Complexity

|    Operation    | Time Complexity |                                                   Reasons                                                    |
| :-------------: | :-------------: | :----------------------------------------------------------------------------------------------------------: |
|    Insertion    |      O(1)       |                          Uses indexing like `arr[2]= 4` and direct access to memory                          |
| Lookup by Index |      O(1)       |                                             Because of indexing                                              |
| Lookup by value |      O(n)       |                Can be vary by algorithm just for this case we are talking about linear search                |
|    Deletion     |      O(n)       | Worst case will be O(n), because if we delete the element at index 0, then we will have to move all elements |
### Memory Allocations / Internal Working of an Array

`int[] arr = new int[5]

|     |     |     |     |     |
| :-: | --- | --- | --- | --- |
1000      1004     1008     1012    1016

```
- Value of arr is always the address of the firts element in this case is 1000
- why index always starts with zero?
	arr[0] = arr + (0 * size of arrayType) = 1000 + (0 * 4) = 1000
	arr[1] = arr + (1 * size of arrayType) = 1000 + (1 * 4) = 1004
	arr[2] = arr + (2 * size of arrayType) = 1000 + (2 * 4) = 1008
```

### Dynamic Array 

Here We will create our own dynamic array similar to array list and all basic array operations

``` java
import java.util.Arrays;  
  
public class DynamicArray {  
    private  int[] items;  
    private int currentIndex;  
    private int initialCapacity;  
  
    // this is when user doesn't provide an size  
    public DynamicArray() {  
        initialCapacity = 10;  
        this.items = new int[initialCapacity];  
        currentIndex = 0;  
    }  
    // this is if the user provides their own size  
    public DynamicArray(int initialSize) {  
        this.items = new int[initialSize];  
        this.initialCapacity = initialSize;  
        currentIndex = 0;  
    }  
    public void insert(int item)  
    {        
	    if(currentIndex < this.initialCapacity ) 
	    {  
            this.items[currentIndex] = item;  
        }
        else {  
            this.items =increaseSize();  
            this.items[currentIndex] = item;  
        }        
        currentIndex++;  
    }  
    // increase the size of an array automatically  
    public int[] increaseSize()  
    {        
	    this.initialCapacity = this.initialCapacity * 2;  
//        int[] newArr= new int[this.initialCapacity];  
        return Arrays.copyOf(this.items, this.initialCapacity);  
  
    }  
    // search index of the value  
    public int indexOf(int item)  
    {        
	    for(int i =0; i < this.currentIndex  ; i++) 
	    {  
            if(this.items[i] == item) 
            {  
                return i;  
            }        
        }        
        return -1;  
    }  
    // remove item from the particular index  
    public void removeAt(int index)  
    {        
	    if(index > this.currentIndex)  
        {            
	        System.out.println("Index out of bounds");  
            return;  
        }        
        for(int i= index; i<this.currentIndex -1; i++) 
        {  
            this.items[i] = this.items[i+1];  
        }        
        this.items[this.currentIndex-1]=0;  
        this.currentIndex--;  
    }  
    // find a maximum element from an array  
    public int max()  
    {        int max = this.items[0];  
        for(int i=0; i<this.currentIndex; i++) {  
            if(this.items[i] > max) {  
                max = this.items[i];  
            }        }        return max;  
    }  
    public void reverse()  
    {   
	    for(int i=0 ; i< this.currentIndex/2 ; i++) 
	    {  
            int temp = this.items[i];  
            this.items[i] = this.items[this.currentIndex-i-1];  
            this.items[this.currentIndex-i-1] = temp;  
        }    
    }  
    // find a minimum element from an array  
    public int min()  
    {        
	    int min = this.items[0];  
        for(int i=0; i<this.currentIndex; i++) 
        {  
            if(this.items[i] < min) 
            {  
                min = this.items[i];  
            }        
        }        
        return min;  
    }
    @Override  
    public String toString()  
    {        
	    StringBuilder s = new StringBuilder();  
        s.append("[");  
        for(int i=0; i<this.currentIndex; i++)  
        {            
	        s.append(this.items[i]).append(",");  
        }        
        s.append("\b").append("]");  
        return s.toString();  
    }  
  
}
```