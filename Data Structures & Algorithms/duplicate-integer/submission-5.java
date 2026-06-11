class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();

        for(int num : nums) {
            unique.add(num);
        }

        if (unique.size() == nums.length)
            return false;

        return true;
    }
}