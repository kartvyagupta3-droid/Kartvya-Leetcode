class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> stack =new Stack<>();
        StringBuilder sb=new StringBuilder();
             
        int idx = word.indexOf(ch);

        if (idx == -1) {
            return word;
        }

          for(int i=0; i<=idx; i++){
            stack.push(word.charAt(i));
          }

          while(!stack.isEmpty()){
            sb.append(stack.pop());
          }

          sb.append(word.substring(idx+1));
          return sb.toString();    }
}