class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> ana = new HashMap<>();
        for(String s : strs){
            char[] hash = s.toCharArray();
            Arrays.sort(hash);
            String sortedS = new String(hash);
            ana.putIfAbsent(sortedS, new ArrayList<>());
            ana.get(sortedS).add(s);
        }
        return new ArrayList<>(ana.values());
        
    }
}
