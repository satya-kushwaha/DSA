package Stack;

import java.util.Stack;

public class ValidParentheses {
    boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){ // opening
                st.push(str.charAt(i));
            }else {//clossing
                if(st.size() == 0){
                    return false;
                }
                if((st.peek() == '(' && str.charAt(i) == ')' )
                        || (st.peek() == '{' && str.charAt(i) == '}')
                        || (st.peek() == '[' && str.charAt(i) == ']')){
                    st.pop();
                }else {
                    return  false;
                }
            }
        }
    return st.size() == 0;
    }
    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("({}[])"));

    }
}
