class Solution {
    public int[] topKFrequent(int[] arr, int k) {
         List<Integer>[] bucket = new ArrayList[arr.length+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] rs = new int[k];
        for(int pos = bucket.length-1, c =0 ; pos >= 0 && c < k; pos--){
             if(bucket[pos] != null){
                 for(int j : bucket[pos]){
                     rs[c++] = j;
                 }
             }
        }

        return rs;
    }
}
