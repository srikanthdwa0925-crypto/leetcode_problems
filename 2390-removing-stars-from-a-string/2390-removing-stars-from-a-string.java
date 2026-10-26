class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!(s.charAt(i)=='*')){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        for (char ch : stack) {
         result.append(ch);
         }

        return result.toString();
        
    }
}




