package dailypractice.Aug;

import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecodeString {




//    public static int ConvertStringToDigit(String s){
//           System.out.println(Integer.parseInt(s));
//            return  Integer.parseInt(s);
//    }

    public static void main(String[] args) {
        String result = DecodeStringMethod("3[a]2[bc]");
       // String result = decodeString2("3[a]2[bc]");
        //   System.out.println( " My integer number is : " + ConvertStringToDigit("123"));
        System.out.println("the codeing my string :" + result);

    }
    public static String DecodeStringMethod(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length() ; i++){
            if (str.charAt(i) == ']') {
                List<Character> decodeString = new ArrayList<>();
                while (stack.peek() != '[')
                    decodeString.add(stack.pop());

                stack.pop();
                int base = 1; int k = 0;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                while (k != 0) {
                    for (int j = decodeString.size() - 1; j >= 0; j--)
                        stack.push(decodeString.get(j));
                    k--;
                }
            }
            else
                stack.push(str.charAt(i));
        }
        char[] result = new char[stack.size()];
        for(int i = result.length -1 ; i >= 0; i --){
            result[i] = stack.pop();
        }
        return new String (result);
    }
    public static String decodeString2 (String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                List<Character> decodedString = new ArrayList<>();
                // get the encoded string
                while (stack.peek() != '[') {
                    decodedString.add(stack.pop());
                }
                // pop [ from the stack
                stack.pop();
                int base = 1;
                int k = 0;
                // get the number k
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                // decode k[decodedString], by pushing decodedString k times into stack
                while (k != 0) {
                    for (int j = decodedString.size() - 1; j >= 0; j--) {
                        stack.push(decodedString.get(j));
                    }
                    k--;
                }
            }
            // push the current character to stack
            else {
                stack.push(s.charAt(i));
            }
        }
        // get the result from stack
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
}
