# DSA-Warmup

This repository will include problems with their approach to solve DSA problems . I will be solving problems from leetcode and multiple books used to crack technical interview

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
	
- [Single Number III](#single-number-iii) ---------------------------[Leetcode - 260](https://leetcode.com/problems/single-number-iii/description/)
	
- [Complement of Base 10 Integer](#complement-of-base-10-integer) -----------[Leetcode - 1009](https://leetcode.com/problems/complement-of-base-10-integer/description/)
	
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

## Single Number III
### [Leetcode - 260](https://leetcode.com/problems/single-number-iii/description/)

Given an integer array `nums`, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in **any order**.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

**Example 1:**

**Input:** nums = [1,2,1,3,2,5]
**Output:** [3,5]
**Explanation: ** [5, 3] is also a valid answer.

**Example 2:**

**Input:** nums = [-1,0]
**Output:** [-1,0]

**Example 3:**

**Input:** nums = [0,1]
**Output:** [1,0]

**Constraints:**

- `2 <= nums.length <= 3 * 104`
- `-231 <= nums[i] <= 231 - 1`
- Each integer in `nums` will appear twice, only two integers will appear once.

### Approach
```

- `a ^ a = 0` (same numbers cancel out)
- `a ^ 0 = a` (XOR with 0 gives the original number)
- Order doesn't matter: `a ^ b ^ c = c ^ a ^ b
```
#### Step 1: XOR Everything

java

```java
int n1xn2 = 0;
for(int num : nums) {
    n1xn2 = n1xn2 ^ num;
}
```

**Result:** XOR of the two unique numbers (duplicates cancel out)

**Example:** `1^2^1^3^2^5 = 3^5 = 6`

---

#### Step 2: Find Any Set Bit

java

```java
int rightmostSetBit = 1;
while((rightmostSetBit & n1xn2) == 0) {
    rightmostSetBit = rightmostSetBit << 1;
}
```

**Result:** A bit position where the two unique numbers differ

**Example:** `6 = 110₂`, rightmost set bit = `10₂` (position 1)

---

#### Step 3: Partition Into Two Groups

java

```java
for(int num : nums) {
    if((rightmostSetBit & num) == 0) {
        num1 = num1 ^ num;  // Group A
    } else {
        num2 = num2 ^ num;  // Group B
    }
}
```

**Logic:** Use the set bit to split numbers into two groups

**Example:**

- Group A (bit=0): `[1, 1, 3]`
- Group B (bit=1): `[2, 2, 5]`

---

#### Step 4: XOR Each Group

**Group A:** `1^1^3 = 3` **Group B:** `2^2^5 = 5`

**Answer:** `[3, 5]`

---

#### Why It Works

1. **XOR cancels duplicates:** `a^a = 0`
2. **Different numbers have different bits:** We can always find a bit to separate them
3. **Grouping preserves duplicates:** Same numbers go to same group and cancel out

---

### Complete Code

java

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all (duplicates cancel)
        int n1xn2 = 0;
        for(int num : nums) {
            n1xn2 ^= num;
        }
        
        // Step 2: Find any set bit  
        int rightmostSetBit = 1;
        while((rightmostSetBit & n1xn2) == 0) {
            rightmostSetBit <<= 1;
        }
        
        // Step 3 & 4: Partition and XOR each group
        int num1 = 0, num2 = 0;
        for(int num : nums) {
            if((rightmostSetBit & num) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        return new int[]{num1, num2};
    }
}
```

**Time:** O(n) | **Space:** O(1)

## Complement of Base 10 Integer
### [Leetcode - 1009](https://leetcode.com/problems/complement-of-base-10-integer/)

The **complement** of an integer is the integer you get when you flip all the `0`'s to `1`'s and all the `1`'s to `0`'s in its binary representation.

- For example, The integer `5` is `"101"` in binary and its **complement** is `"010"` which is the integer `2`.

Given an integer `n`, return _its complement_.

**Example 1:**

**Input:** n = 5
**Output:** 2
**Explanation:** 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.

**Example 2:**

**Input:** n = 7
**Output:** 0
**Explanation:** 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.

**Example 3:**

**Input:** n = 10
**Output:** 5
**Explanation:** 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.

**Constraints:**

- `0 <= n < 109`

### Approach

- create mask of 1's same as the length of the num
- use XOR with the original num and return it

### Method 1

**Time Complexity** - O(logn) , **Space Complexity** - O(logn)
	`Integer.toBinaryString(n).length()` takes O(log n) time
	- Because it needs to convert the number to binary string
	- A number `n` has approximately `log₂(n)` bits
	
``` java
// using built in function to calculate the length of the n
    public int bitwiseComplement(int n) {
    // Find bit length of the number
    int bitLength = Integer.toBinaryString(n).length();
    
	// Create mask with that many 1s
    int mask = (1 << bitLength) - 1;

	// Return complement
    return n ^ mask;

}
```

``` java
public int complement(int n) {  
    int num = n;  
    int mask =0;  
    while(num != 0)  
    {        mask = mask << 1 | 1;  
        num = num >> 1;  
    }    return (~n) & mask;  
}
```
### Method 2

- **TOC: O(1)** - `numberOfLeadingZeros` is O(1)
- **SC: O(1)** - No string creation

``` java
    public int bitwiseComplement(int n) {

    if (n == 0) return 1;

    // Find bit length without creating string

    int bitLength = 32 - Integer.numberOfLeadingZeros(n);

    // Create mask

    int mask = (1 << bitLength) - 1;

    return n ^ mask;

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

### Two Sum
#### [Leetcode : 1](https://leetcode.com/problems/two-sum/description/)

Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

**Input:** nums = [2,7,11,15], target = 9
**Output:** [0,1]
**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**

**Input:** nums = [3,2,4], target = 6
**Output:** [1,2]

**Example 3:**

**Input:** nums = [3,3], target = 6
**Output:** [0,1]

**Constraints:**

- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- `-109 <= target <= 109`
- **Only one valid answer exists.**

**Follow-up:** Can you come up with an algorithm that is less than `O(n2)` time complexity?

#### Approach:

- Using HashMap to reduce the Time Complexity for element lookup

``` java
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {

  

        // base case

        if(nums.length == 2)

        {

            return new int[]{0,1};

        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++)

        {

         int targetElement = target - nums[i];

         if(map.containsKey(targetElement))

         {

            return new int[]{i,map.get(targetElement)};

         }

         else

         {

            map.put(nums[i],i);

         }

        }

        return new int[]{-1,-1};

    }

}
```

## Two Sum II
### [Leetcode - 167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)
Given a **1-indexed** array of integers `numbers` that is already **_sorted in non-decreasing order_**, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index1]` and `numbers[index2]` where `1 <= index1 < index2 <= numbers.length`.

Return _the indices of the two numbers,_ `index1` _and_ `index2`_, **added by one** as an integer array_ `[index1, index2]` _of length 2._

The tests are generated such that there is **exactly one solution**. You **may not** use the same element twice.

Your solution must use only constant extra space.

**Example 1:**

**Input:** numbers = [2,7,11,15], target = 9
**Output:** [1,2]
**Explanation:** The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

### Approach

using two pointer approach `left`, `right`
- if there sum is less than the target, increment left pointer
- if the sum is greater than target, decrement right pointer

### Solution

- **Time complexity** - O(n)
- **Space complexity** - O(1)
``` java
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;
        while(i < j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum == target)
            {
                return new int[]{i+1, j+1};
            }
            else if(sum > target)
            {
                j = j - 1;
            }
            else{
                i = i+1;
            }
        }
        return new int[]{};
    }
```

## 3Sum
### [Leetcode - 15](https://leetcode.com/problems/3sum/description/)

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

**Example 1:**

**Input:** nums = [-1,0,1,2,-1,-4]
**Output:** [[-1,-1,2],[-1,0,1]]
**Explanation:** 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

**Example 2:**

**Input:** nums = [0,1,1]
**Output:** []
**Explanation:** The only possible triplet does not sum up to 0.

**Example 3:**

**Input:** nums = [0,0,0]
**Output:** [[0,0,0]]
**Explanation:** The only possible triplet sums up to 0.

**Constraints:**

- `3 <= nums.length <= 3000`
- `-105 <= nums[i] <= 105`

### Approach 
```
Two Pointers
```
- Fix `a` then we will be left of `Two Sum problem` where arrays will be sorted 
- first sort the array, so that we can efficiently skip the duplicates 

 **Points to keep in mind**
	- nums[i] != nums[j] != nums[k]
	- a + b + c = 0
	- If the value of `a` ,`b` & `c` are positive then we can obviously skip that iteration

### Solution

``` java
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++)
        {
            // fixing firstElement
            int firstElement = nums[i];
            if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            // target is -a because
            // a+b+c=0, then b+c = -a
            twoSum(nums, firstElement, i+1 , -firstElement, results);
        }
        return results;
    }

    public static void twoSum(int[] nums, int firstElement, int start, int target, List<List<Integer>> results)

    {
        int left = start, right = nums.length -1;
        while(left < right)
        {
            int sum = nums[left] + nums[right];
            if(sum == target)
            {
                results.add(List.of(firstElement, nums[left], nums[right]));
                // check for duplicates of b
                while(left < right && nums[left] == nums[left +1]) left++;
                // check for duplicates of c
                while(left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
            }
            else if(sum < target)
            {
                left++;
            }else
            {
                right--;
            }
        }
    }
```


## 3Sum Closest
### [Leetcode - 16](https://leetcode.com/problems/3sum-closest/description)

Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is closest to `target`.

Return _the sum of the three integers_.

You may assume that each input would have exactly one solution.

**Example 1:**

**Input:** nums = [-1,2,1,-4], target = 1
**Output:** 2
**Explanation:** The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

### Approach

- **Sort the array** so that you can use the two-pointer technique efficiently.
- **Fix one number** at a time (starting from index `i`), and try to find the best possible **pair** (from remaining elements) that forms the sum closest to the target.
- For each fixed number:
    - Use **two pointers**:
        - `left` starts just after the fixed element.
        - `right` starts from the end of the array.
- Calculate the sum of the triplet (`nums[i] + nums[left] + nums[right]`):
    - If this sum is **closer to the target** than any previous sum, update the result.
    - If the sum is **too large**, move the `right` pointer to reduce the sum.
    - If the sum is **too small**, move the `left` pointer to increase the sum.

### Solution

``` java
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length -2; i++)
        {
            int left = i+1;
            int right = nums.length -1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - closestSum))
                {
                    closestSum = sum;
                }
                if(sum < target)
                {
                    left ++;
                }
                else{
                    right--;
                }
            }
        }
        return closestSum;
    }
```
## Sort Colors / Dutch Flag Problem
#### [Leetcode - 75](https://leetcode.com/problems/sort-colors/description/)

Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

**Example 1:**

**Input:** nums = [2,0,2,1,1,0]
**Output:** [0,0,1,1,2,2]

**Example 2:**

**Input:** nums = [2,0,1]
**Output:** [0,1,2]

**Constraints:**

- `n == nums.length`
- `1 <= n <= 300`
- `nums[i]` is either `0`, `1`, or `2`.

**Follow up:** Could you come up with a one-pass algorithm using only constant extra space?

#### Approach

``` idea
put all 0's on the left side and 2's on right
```

1. create three variable `start` ,  `middle` ,`end`
	- `start` -> will point to 0's
	- `middle` -> will traverse through the array
	- `end` -> will point to 2's
2. case 0 - swap with start, then start++, middle++
3. case 1 - middle++
4. case 2 - swap with end, then, end--


```java
    public static void swap(int[] nums, int pos1, int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
    public void sortColors(int[] nums) {
        int start=0;
        int middle=0;
        int end = nums.length - 1;
        while(middle <= end)
        {
            switch(nums[middle])
            {
                case 0:
                    swap(nums,middle, start);
                    start ++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;
                
                case 2:
                    swap(nums, middle, end);
                    end --;
            }
        }
    }
```

##  Intersection of Two Arrays

#### [Leetcode - 349](https://leetcode.com/problems/intersection-of-two-arrays/)

Given two integer arrays `nums1` and `nums2`, return _an array of their intersection_. Each element in the result must be **unique** and you may return the result in **any order**.

**Example 1:**

**Input:** nums1 = [1,2,2,1], nums2 = [2,2]
**Output:** [2]

**Example 2:**

**Input:** nums1 = [4,9,5], nums2 = [9,4,9,8,4]
**Output:** [9,4]
**Explanation:** [4,9] is also accepted.

**Constraints:**

- `1 <= nums1.length, nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 1000`

#### Approach 
-   **Step 1**: Compare array lengths
-   **Step 2**: Put longer array in HashMap
-   **Step 3**: Search shorter array using HashMap
-   **Step 4**: Remove found elements to prevent duplicates
-  **Step 5**: Convert result list to array

**Time**: O(m + n) - Visit each element once 
**Space**: O(larger array) - Store the bigger array

``` java
public static int[] intersectionApproach1(int[] nums1, int[] nums2) {  
    HashMap<Integer,Integer> map = new HashMap<>();  
  
    boolean isNums1Larger = false;  
    if(nums1.length>nums2.length){  
        isNums1Larger = true;  
    }    
    if(isNums1Larger)  
    {        
	    for(int i=0;i<nums1.length;i++)  
            {            
	            map.put(nums1[i],i);  
            }
        return lookup(nums2,map);  
    }    
    else {  
        for(int i=0;i<nums2.length;i++)  
        {            
	        map.put(nums2[i],i);  
        }        
        return lookup(nums1,map);  
    }  
  
}  
public static int[] lookup(int[] arr, HashMap<Integer,Integer> map)  
{  
    List<Integer> res = new ArrayList<>();  
    for(int ele : arr)  
    {        
	    if(map.containsKey(ele))  
        {            
	        res.add(ele);  
            map.remove(ele);  
        }    
    }    
    int[] resArr = new int[res.size()];  
    for(int i = 0 ;i<res.size();i++)  
    {        
	    resArr[i]= res.get(i);  
    }  
    return resArr;  
}
```

## Container with most water
### [Leetcode - 11](https://leetcode.com/problems/container-with-most-water/)

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return _the maximum amount of water a container can store_.

**Notice** that you may not slant the container.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

**Input:** height = [1,8,6,2,5,4,8,3,7]
**Output:** 49
**Explanation:** The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

**Example 2:**

**Input:** height = [1,1]
**Output:** 1

### Approach

- Use the **two-pointer technique**:
    
    - Initialize `left = 0` and `right = n - 1` (max possible width).
        
- The **amount of water** between two lines is:
    
    `Area=min⁡( height[left] , height[right] ) × ( right − left )`

- Start with the widest container and move pointers inward to potentially find a taller line:
    
    - If the **left height is smaller**, move `left++` (because moving the shorter line inward may increase the height).
        
    - If the **right height is smaller**, move `right--`.
        
    - If both heights are equal, move both pointers inward.
        
- Track the **maximum area** found while adjusting pointers.
    
- Stop when `left >= right`.
### Solution

``` java
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxWater = 0;

        while(left < right)
        {
            int area = Math.min(height[left], height[right]) *(right-left);
            maxWater = Math.max(maxWater, area);
            
            if(height[left] < height[right])
            {
                left++;
            }
            else if(height[left] > height[right])
            {
                right--;
            }
            else{
                 left++;
                 right--;
            }
        }
        return maxWater;

    }
```


## Remove Duplicates from Sorted Array

### [Leetcode - 26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm) such that each unique element appears only **once**. The **relative order** of the elements should be kept the **same**. Then return _the number of unique elements in_ `nums`.

**Input:** nums = [0,0,1,1,1,2,2,3,3,4]
**Output:** 5, nums = [0,1,2,3,4,_,_,_,_,_]
**Explanation:** Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

### Approach

- skip the duplicates
- Focus only on unique elements

### Solution

``` java
    public int removeDuplicates(int[] nums) {
        int count= 1;
        for(int i= 1 ; i< nums.length ; i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
```

## Remove Element
### [Leetcode - 27](https://leetcode.com/problems/remove-element/description/)

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm). The order of the elements may be changed. Then return _the number of elements in_ `nums` _which are not equal to_ `val`.

Consider the number of elements in `nums` which are not equal to `val` be `k`, to get accepted, you need to do the following things:

- Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`.
- Return `k`.

### Solution

``` java
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            if(nums[i] != val)
            {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
```

## Squares of a Sorted Array

### [Leetcode - 977](https://leetcode.com/problems/squares-of-a-sorted-array/)

Given an integer array `nums` sorted in **non-decreasing** order, return _an array of **the squares of each number** sorted in non-decreasing order_.

**Example 1:**

**Input:** nums = [-4,-1,0,3,10]
**Output:** [0,1,9,16,100]
**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

### Approach 

#### 💡 Intuition:

- Squaring a **negative number** makes it **positive**, possibly larger than the square of a positive number.
    
- Since the array is already sorted (from negative to positive), the **largest square will come from either the start or end** of the array.
    

#### 🧠 Logic:

- Use **two pointers**:
    
    - `start` at the beginning of the array
        
    - `end` at the end of the array
        
- Compare squares: `nums[start]^2` vs `nums[end]^2`
    
- Place the **larger square** at the **end** of the result array and move the corresponding pointer.
    
- This avoids sorting at the end (unlike naive O(n log n) approaches).

### Solution

``` java
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,0);
        int start = 0;
        int end = nums.length -1;
        int highestSquareIndex = nums.length - 1;
        
        while(start <= end)
        {
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];
            if(startSquare > endSquare)
            {
                res[highestSquareIndex] = startSquare;
                start++;
            }
            else{
                res[highestSquareIndex] = endSquare;
                end --;
            }
            highestSquareIndex --;
        }
        return res;
    }
```

## Merge Sorted Array

### [Leetcode - 88](https://leetcode.com/problems/merge-sorted-array/description/)

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

**Merge** `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be _stored inside the array_ `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

**Example 1:**

**Input:** nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
**Output:** [1,2,2,3,5,6]
**Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

### Approach

Start from the **end** of both arrays and **fill from the end** of `nums1`.

Why? Because the largest elements will be at the end — so placing them from the back avoids overwriting existing data in `nums1`.

### Solution

``` java

public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>= 0)
        {
            if(i >= 0 && nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
```


## Move Zeroes

### [Leetcode - 283](https://leetcode.com/problems/move-zeroes/description/)

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

**Example 1:**

**Input:** nums = [0,1,0,3,12]
**Output:** [1,3,12,0,0]

**Follow up:** Could you minimize the total number of operations done?

### Approach

- **`index` keeps track of the position where the next non-zero should be placed.**
- **Loop through the array with pointer `i`:**
    - If `nums[i]` is not `0`, it means it's a valid number and needs to be brought forward (if necessary).
    - If `i != index`, a swap is performed to bring the non-zero element to its correct position.
        - This **avoids unnecessary swaps** when `i == index`.
- After the swap (or direct placement), move the `index` forward.

### Solution

``` java
    public void moveZeroes(int[] nums) {
        int index =0;
        for(int i = 0 ; i< nums.length; i++)
        {
            if(nums[i] != 0  )
            {
                if(i != index )
                {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                }
                index++;
            }
        }
    }
```
