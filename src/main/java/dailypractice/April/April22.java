package dailypractice.April;

import org.h2.command.ddl.CreateSequence;

import java.util.ArrayList;
//Reversing String
//
public class April22 {
    public static void main(String[] args) {
        ReverseString("abc");
        ReverseString(new char[]{'n', 'i','l'});
        ReverseString(new char [] {'s','u','n'});
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ReverseArray(arr);
    }

    public static void ReverseString(String str){
        String reversedString = "";
        int i = str.length()-1;
        while (i >= 0){
            reversedString = reversedString + str.charAt(i);
            i --;
        }
        System.out.println(reversedString);
    }
    public static void ReverseString(char [] ch){
        String rev = "";
        int i = ch.length -1;
        while (i >= 0){
            rev = rev + ch[i];
            i --;
        }
        System.out.println(rev);
    }
    public static void ReverseStringWithOnceCharacter(char[] ch){
        int i = 0;
        int j = ch.length -1;

        while (i < j ){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i ++;
            j--;
        }
        System.out.println(ch);
    }
    public static void ReverseArray(ArrayList<Integer> arr){
        //two pointers
        int i = 0;
        int j = arr.size() - 1 ;
        while(i <= j){
            Integer temp = arr.get(i);
            arr.add(i,arr.get(j));
            arr.add(j,temp);
            i ++;
            j--;

        }
        System.out.println(arr);
    }

}
