class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums){ //till u get duplicate it loops here only
            if(!h.add(num)){
                return true;
            }
        }
    return false;
    }
}