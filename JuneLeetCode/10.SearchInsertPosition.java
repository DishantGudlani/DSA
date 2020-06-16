//linear search


class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i = 0 ; i < nums.length; i++)
        {
            if(target == nums[i])
                return i;
            
            else if(target < nums[i])
                return i;
        }
        
        return nums.length;
    }
}

//binary search
//we return start as it will point to the correct position always

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0; 
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if(target == nums[mid])
                return mid;
            
            else if(target < nums[mid])
                end = mid - 1;
            
            else
                start = mid + 1;
        }
        return start;
    }
}

