class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Only append if this isn't the outermost opening parenthesis
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else {
                depth--;
                // Only append if this isn't the outermost closing parenthesis
                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}