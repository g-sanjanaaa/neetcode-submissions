class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        ArrayList <int[]> arr= new ArrayList<>();
        for (Integer key : map.keySet()) {
        int value = map.get(key);
        arr.add(new int[] {value, key});
        }
arr.sort((a, b)->b[0]-a[0]);
int[] res =new int[k];
for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}