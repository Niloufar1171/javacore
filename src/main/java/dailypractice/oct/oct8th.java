package dailypractice.oct;

import java.util.*;

public class oct8th {
    public static void main(String[] args) {
        ReverseArray(new int[] {1,2,3,4});
        ReverseString(new String("abcd"));
        twoSum(new int [] {1,2,4,5}, 9);
    }
    public static void ReverseString (String str){
        char [] chars= str.toCharArray();
        int i = 0;
        int j = str.length() -1 ;
        while(i< j){
            char temp = chars[i];
            chars[i] =chars[j];
            chars[j] = temp;
            i ++;
            j--;
        }
        System.out.println(chars);
    }
    public static void  ReverseArray(int[]  arr){
        int i = 0;
        int j = arr.length -1 ;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++;
            j --;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void twoSum(int [] nums, int target){

        //1 : 0, 2: 1 , 3 :2 , 4 : 3 , 5: 4
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i ++){
            if( map.containsKey(target - nums[i])){
                int [] res = new int[]{i, map.get(target - nums[i])};
                System.out.println( Arrays.toString(res));
            }
            map.put(nums[i],i );
        }
    }

    public static  void kSum(int [] nums, int k){
        int sum = k;
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();
        while (i < nums.length){
            j = i ;
            while(sum - nums[i] < k){
          //      res.add(nums[i])

            }
        }
    }

}
