package com.niloufar.training.learningspring.cracking_code_of_interviewing;

public class chapterOne {
    public static void main(String[] args) {
        printSortedStrings(4, "");
        String str = "abcd";
        permutation(str,"");
    }
    public static void  permutation(String str, String prefix){
        System.out.println("calling p (str, prefix) : ( " + str +" , " + prefix  + " ) ");

            if(str.length() == 0){
                System.out.println(prefix);
            }else{
                for(int i = 0; i < str.length(); i++){

                    String rm = str.substring(0,i) + str.substring(i+1);
                   // System.out.println("calling p with (rm , prefix + char(i) ) : " + rm + " , " + prefix + " + " + str.charAt(i) );
                    permutation(rm, prefix + str.charAt(i));
                }
            //    System.out.println("End of loop------------------------------------------------------------");
            }
    }

    public static  void printSortedStrings(int remaining){
        printSortedStrings(remaining, " ");
    }
public static void printSortedStrings(int remaining, String prefix){
        int numChars = 26;
        if(remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }else{
                for(int i = 0; i < numChars; i ++){
                    char c = ithLetter(i);
                    printSortedStrings(remaining -1 , prefix + c);
                }
            }
        }
}

public static boolean isInOrder(String s){
        for(int i = 1 ; i< s.length(); i ++){
            int prev = ithLetter(s.charAt(i));
            int curr = ithLetter( s.charAt(i -1));
            if(prev > curr) return false;

        }
        return true;
}

public static char ithLetter (int i){
        return (char)(((int) 'a') + 1 ) ;
}

}