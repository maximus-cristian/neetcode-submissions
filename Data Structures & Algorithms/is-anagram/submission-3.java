class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}

        Map<Character, Integer> ana = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char curchar = s.charAt(i);
            ana.put(curchar, ana.getOrDefault(curchar, 0) + 1);
        }
        for(int i = 0 ; i < t.length() ; i++){
            char curchar = t.charAt(i);
            ana.put(curchar, ana.getOrDefault(curchar, 0) - 1);
        }
        for(int val : ana.values()){
            if(val != 0){return false;}
        }
        return true;

    }
}
