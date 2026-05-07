class Solution {
    public boolean hasDuplicate(int[] arr) {
        return Arrays.stream(arr).distinct().count() != arr.length;
    }
}