class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}

        Map<Character, Integer> ana = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            ana.put(s.charAt(i), ana.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0 ; i < t.length(); i++){
            ana.put(t.charAt(i), ana.getOrDefault(t.charAt(i), 0)-1);
        }
        for(int val : ana.values()){
            if(val != 0){return false;}
        }return true;
    }
}
