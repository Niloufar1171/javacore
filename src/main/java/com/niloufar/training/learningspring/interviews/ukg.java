package com.niloufar.training.learningspring.interviews;
import java.util.*;
public class ukg {



//1. What changes would you make to the "Range" class to make Line 45 print the range in the format "[from, to]" instead of something like "Main$Range@30f39991".
//2. Make the code change to sort the list "ranges" by "Range.to".
//3. Implement the method findOverlapping, it returns the list of ALL ranges that overlap with the one passed by parameter.
//4. What's the time complexity of the for loop "for(int i = 0; i < ranges.size(); i++){...", how can it be improved?.
public   static class Range {
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }
    public int getFrom(){
        return from;
    }
    public int getTo(){
        return to;
    }

    public List FindOverLapping (Range r, List<Range> ranges){

        List<Range> res = new LinkedList<>();
        for (Range range : ranges ){
            if (     r.to > range.to && r.from < range.from  ) {
                res.add(range);
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return this.from + "-" + this.to ;

     }

}

        // ranges = [1,9] [2,6],[7,12]
        // r = [3,5]
        // return - [1,9],[2,6]
        public static List<Range> findOverlapping(List<Range> ranges, Range r){
            List<Range> ret = new LinkedList<>();
            //TODO implement
            return ret;
        }

        public static void main(String[] args){
            List<Range> ranges = new LinkedList<>();

            ranges.add(new Range(15,17));
            ranges.add(new Range(10,16));
            ranges.add(new Range(20,23));
            ranges.add(new Range(1,7));

            //For Question #2
            ranges.sort(Comparator.comparingInt(a -> a.to));

            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(5);
            list.add(12);

            //list.stream().sorted().forEach(System.out::println);
            list.stream().sorted(Comparator.comparing(i->i)).forEach(System.out::println);
//List<String> result = names.stream().sorted(
//                 Comparator.comparing(n->n.toString())).collect(Collectors.toList());


            //TODO: Implement as part of question #2
            //replace Main$Range@30f39991, Main$Range@452b3a41, Main$Range@4a574795, Main$Range@f6f4d33,
            //with [15,17], [10,16], [20, 23], [1,7]
            for(int i = 0; i < ranges.size(); i++){
                System.out.print(ranges.get(i));
                System.out.print(", ");
            }
            System.out.println();

        }
    }
