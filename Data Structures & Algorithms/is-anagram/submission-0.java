class Solution {
    public boolean isAnagram(String s, String t) {
      if(t.length() != s.length()){
           return false;
       }

       Map<Character, Integer> map = new HashMap<>();
       for(Character c : s.toCharArray()){
           map.put(c, map.getOrDefault(c, 0)+1);
       }
       for(int i = 0; i< t.length(); i++){
           if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) <= 0){
               return false;
           }
           map.put(t.charAt(i), map.get(t.charAt(i)) -1 );
       }
        return true;
    }
}
