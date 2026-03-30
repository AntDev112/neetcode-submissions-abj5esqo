class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        Map<Character,Character> openParenthesis = createOpeningParenthesisList();
        if (s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char currParenthesis = s.charAt(i);
            if (openParenthesis.containsKey(currParenthesis)) {
               parenthesis.push(currParenthesis); 
            } else {
                Character lastPushed = parenthesis.isEmpty() ? null : parenthesis.pop();
                if (Objects.isNull(lastPushed)) {
                    return false;
                }
                if(!(openParenthesis.get(lastPushed) == currParenthesis)) {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }

    public Map<Character,Character> createOpeningParenthesisList() {
        Map<Character,Character> parenthesis = new HashMap<>();
        parenthesis.put('(' , ')');
        parenthesis.put('[' , ']');
        parenthesis.put('{' , '}');
        return parenthesis;
    }
}
