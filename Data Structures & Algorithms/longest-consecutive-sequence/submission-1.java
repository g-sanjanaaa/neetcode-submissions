class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> conse=new HashSet<>(); 
        for(int i=0; i<nums.length; i++){
            conse.add(nums[i]);
        }
        for(int i:nums){
            int streak=0; 
            int cur=i;
            while(conse.contains(cur)){
                streak++;
                cur++;
            }
            res=Math.max(res, streak);
        }
        return res;
    }
}
