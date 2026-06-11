class Solution {
    public boolean isPalindrome(String s) {

        String s2 = s.toLowerCase();
        ArrayList<Character> pal = new ArrayList<>();

        for(int i = 0 ; i < s2.length(); i++){
            if(Character.isLetterOrDigit(s2.charAt(i))){
               pal.add(s2.charAt(i)); 
            }
        }
        
        ArrayList<Character> revpal = new ArrayList<>();

        for(int i = 0 ; i<pal.size() ; i++){
            revpal.add(pal.get(pal.size()-1-i));
        }

        System.out.println(pal);
        System.out.println(revpal);
        for(int i = 0 ; i<pal.size() ; i++){
            if(pal.get(i)!=revpal.get(i)){
                return false;
            }
        }
        return true;
    }
}
