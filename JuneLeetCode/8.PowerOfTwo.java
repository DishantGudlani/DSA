//6 ways

//iterate till 30, coz 2^31 is max of int.

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int i = 0;
        int pow_var = (int)Math.pow(2, i);
        
        while(i <= 30)
        {
            
            System.out.println(pow_var);
            if(pow_var == n)
                return true;
            i++;
            
            pow_var = (int)Math.pow(2, i);
             
        }
        
        return false;
    }
}

//if number is power of two, then will return 1 eventually

class Solution {
    public boolean isPowerOfTwo(int n) {
        

        if(n <= 0) return false;
        
        while(n % 2 == 0) n /= 2;
        
        return n == 1;
    }
}

//recursive

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        
        return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo(n/2)));
    }
}

//bit operation, as n & (n - 1) == 0 if n is a power of two, it's not if its anything else

return n > 0 && ((n & (n-1)) == 0);

//math derivation

return n > 0 && (1073741824 % n == 0);

//bit count

return n > 0 && Integer.bitCount(n) == 1;

//only 31 numbers exist as power of two in int range

return new HashSet<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608,16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824)).contains(n);