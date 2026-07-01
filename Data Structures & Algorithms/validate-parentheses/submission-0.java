class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        for (char curChar : s.toCharArray()) {
            if (pairs.containsKey(curChar)) {
                if (!stack.isEmpty() && stack.peek() == pairs.get(curChar)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(curChar);
            }
        }
        return stack.isEmpty();
    }
}