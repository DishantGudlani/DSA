class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        
        int left = 0, right = len - 1;
        
        while(left < right)
        {
            swap(left, right, s);
            left++;
            right--;
        }
        
        
    }
    
    public void swap(int left, int right, char[] arr)
    {
        if(left >= right) return;
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
        
}
}