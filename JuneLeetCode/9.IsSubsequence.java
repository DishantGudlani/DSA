class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        
        int len_s = s.length();
        int len_t = t.length();
        
        for(int i = 0; i < len_t && j < len_s; i++)
            if(s.charAt(j) == t.charAt(i))
                j++;
        
        return j == len_s;
    }
}

