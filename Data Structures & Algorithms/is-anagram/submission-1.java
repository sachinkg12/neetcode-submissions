class Solution {
    public boolean isAnagram(String s, String t) {

        if(s==null && t==null){
            return true;
        }

        if((s==null && t!=null) || (s!=null && t==null)){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(Character a: s.toCharArray()){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            } 
        }
        for(Character a: t.toCharArray()){
            if(map.containsKey(a)){
                map.put(a, map.get(a)-1);
            }else{
                return false;
            } 
        }

        for(Character a: t.toCharArray()){
            if(map.get(a) != 0)
                return false;
             
        }

        return true;
    }
}
