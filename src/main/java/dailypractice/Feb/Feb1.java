package dailypractice.Feb;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class Feb1 {
   public static void main (String [] args ){


//       we have an array of integers with length of N, we want to calculate all sums of every k consecutive elements and return the result in another array
//
//       Example 1:
         int []arr = {2,6,1,7,9,-1,0};
         int k = 3;
//       Output: [9, 14, 17, 15, 8]
//
//       Example 2:
//       Input arr =[3, 7,  1],  k = 2
//       Output: [10, 8]

        //  kSum(arr, k);
       System.out.println(SumofKs(arr, 3));

//

   }
    public static List<Integer> kSum (int [] arr, int k){
        List<Integer> res = new ArrayList<>();
        int counter = 0;
        int sum =0;
        int i = 0;
            while (i < arr.length) {
                while (counter < k - 1) {
                    sum = sum + arr[i];
                    counter ++;
                }
                res.add(sum);
                counter = 0;
                sum =0;
                i++;
        }
        System.out.println(res);
        return res;
    }
    public static List<Integer> SumofKs(int [] nums, int k){
       List<Integer> res = new ArrayList<>();
       int sum = 0;
       int counter = 0;
       for(int i = 0; i < nums.length; i ++){
           int j = i;
           while (counter < k -1){
               sum += nums[j];
               counter ++;
           }
           res.add(sum);
           counter = 0;
           sum =0;
       }
       return res;


    }
}
