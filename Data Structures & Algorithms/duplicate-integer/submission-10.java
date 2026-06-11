class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){return true;}
            seen.add(num);
        }return false;




























        
        // TreeSet<Integer> unique = new TreeSet<>();

        // for(int num : nums) {
        //     unique.add(num);
        // }

        // if (unique.size() == nums.length)
        //     return false;

        // return true;
    }
}