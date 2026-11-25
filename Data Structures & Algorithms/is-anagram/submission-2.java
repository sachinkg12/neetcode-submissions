class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int count = map.get(ch); 
                count = count+1;
                map.put(ch, count);
            } else{
                map.put(ch,1);
            }
        }

        for(char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                int count = map.get(ch); 
                count = count - 1;
                map.put(ch, count);
            } 
        }

        for(int i : map.values()){
            if(i>0){
                return false;
            }
        }

        return true;

    }
}
