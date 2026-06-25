class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s=strs[i];
         char[] aSort= strs[i].toCharArray();
         Arrays.sort(aSort);
         String sorted=new String(aSort);
        if (!map.containsKey(sorted)) {
           map.put(sorted, new ArrayList<>());
        }
        //map.putIfAbset(sorted, new ArrayList<>());
        map.get(sorted).add(s);
    }
return new ArrayList<>(map.values());
}
}