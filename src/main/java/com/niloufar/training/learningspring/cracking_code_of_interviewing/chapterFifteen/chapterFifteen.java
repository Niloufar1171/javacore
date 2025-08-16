package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterFifteen;
//567. Permutation in String
public class chapterFifteen {
    public static void main(String[] args) {
        char [] sentence = new char[15];
        String str = "this is a test";
        sentence=  str.toCharArray();

    }
    public static void decoodeString(char[] str , int trueLength){
        int spaceCount =0;
        for (int i =0; i < str.length; i++ ){
            if(str[i] == ' ') spaceCount ++;
        }

       int  index = trueLength + spaceCount * 2;

        if(trueLength < str.length ) str[trueLength] = '\0';
        for (int i = trueLength -1 ; i >= 0 ; i--){
            if(str[i] == ' '){
                str[index- 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
            }else{
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
