class AlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
    public static void main(String[] args){
        int n = 5;
        if(hasAlternatingBits(n)){
            System.out.println("Alternating Bits exit");
        } else 
            System.out.println("Alternating bits does nto exit");
    }
}

/*# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Alternating bits means:
- Every adjacent pair of bits must differ.
- In binary terms, the sequence should look like 101010... or 010101....

# Approach
<!-- Describe your approach to solving the problem. -->
### Using bit manipulation:
- If n has alternating bits, then n ^ (n >> 1) will be all 1s.
- Example:
- n = 5 (101)
- n >> 1 = 2 (101)
- x = n ^ (n >> 1) = 111 (all 1s).
- Then check if (x & (x + 1)) == 0.
    - x = 7 (0111)
    - x + 1 = 8 (1000)
    - AND (&) Operations rule
    - 1 & 1 = 1
    - 1 & 0 = 0
    - 0 & 1 = 0
    - 0 & 9 = 1
    - x & ( x + 1) = 0111 & 1000 = 0 

# Complexity
- Time complexity: O(1)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}
    */