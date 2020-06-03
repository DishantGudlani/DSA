class Solution {
    public int singleNumber(int[] nums) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(result.contains(nums[i]))
            {
                result.remove(new Integer(nums[i]));
            }
            
            else
            {
                result.add(nums[i]);
            }
        }
        
        return result.get(0);
    }
}