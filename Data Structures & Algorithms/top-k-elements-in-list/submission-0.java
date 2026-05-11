class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            heap.offer(entry);
        }

        int[] top = new int[k];
        for (int i = 0; i< k; i++){
            top[i] = Objects.requireNonNull(heap.poll()).getKey();
        }
        return top;
    }
}
