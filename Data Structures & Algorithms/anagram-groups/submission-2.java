class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h=new HashMap<>();
        for(String s:strs){
            char[] charArray= s.toCharArray();
            Arrays.sort(charArray);

            String sorteds=new String(charArray);
            h.putIfAbsent(sorteds, new ArrayList<>());
            h.get(sorteds).add(s);
        }
    return new ArrayList<>(h.values());
    }
}
