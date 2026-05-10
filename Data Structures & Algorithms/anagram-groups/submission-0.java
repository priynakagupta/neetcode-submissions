class Solution {
    public List<List<String>> groupAnagrams(String[] strArray) {
        Map<String, List<String>> map = new HashMap<>();
          for (int i = 0; i< strArray.length; i++){
              String currentStr = strArray[i];
              String freqStr = getFreqStr(currentStr);
              if(map.containsKey(freqStr)){
                  map.get(freqStr).add(currentStr);
              } else {
                  List<String > str = new ArrayList<>();
                  str.add(currentStr);
                  map.put(freqStr, str);
              }
          }
          return new ArrayList<>(map.values());
    }

    public static String getFreqStr(String s){
        int[] arr = new int[26];
        for(int i =0 ; i< s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for (int i : arr){
            sb.append(c++).append(i);
        }
        return sb.toString();
    }
}
