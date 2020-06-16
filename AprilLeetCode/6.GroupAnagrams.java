class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i < len; i++)
        {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            
            if(map.containsKey(sorted))
            {
                map.get(sorted).add(strs[i]);
            }
            else
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted, list);
            }
        }
        
        
        List<List<String>> result = new ArrayList<>(map.values());
        
        
        
        return result;
    }
}

//unsorted alternative

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> ans = new HashMap<String, List>();
        
        int[] count = new int[26];
        for(String s: strs)
        {
            Arrays.fill(count, 0);
            
            for(char c: s.toCharArray()) count[c - 'a']++;
            
            StringBuilder sb = new StringBuilder("");
            
            for(int i = 0; i < 26; i++)
            {
                sb.append('#');
                sb.append(count[i]);
            }
            
            String key = sb.toString();
            
            if(!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        
        return new ArrayList(ans.values());
    }
}

