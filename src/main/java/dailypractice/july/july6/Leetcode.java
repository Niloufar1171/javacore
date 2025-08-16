package dailypractice.july.july6;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Leetcode  {

    public static void main(String[] args) {

        System.out.println( fibonachi(5));

        System.out.println(isIsogram("ab"));

        System.out.println(isPrime(6));

        SqrtOfNPrimeNumber(10);


    }
//if there are any repeatatiob
public static boolean isIsogram (String str){
    Set<Character> seen = new HashSet<>();
    for(char c : str.toCharArray()){
        if(!seen.add(c)) return true;
    }
    return false;

}
    public static int fibonachi(int n){
        if(n<=1)
            return n;
        else
        return fibonachi(n-1) + fibonachi(n -2);
    }
    public static boolean isPrime(int num){
        return num > 1 && IntStream.range(2,num)
                                    .noneMatch(digit->num % digit == 0);
    }
    ////2 method referencing :) one is customize and the other is from java util meaning sout!
    public static void SqrtOfNPrimeNumber(int num){
        List<Double> sqrtOf10Prime = Stream.iterate(1, i->i+1)
                .filter(Leetcode::isPrime).peek(System.out::println)
                .map(Math::sqrt)
                .limit(num)
                .collect(Collectors.toList());
    }
}
