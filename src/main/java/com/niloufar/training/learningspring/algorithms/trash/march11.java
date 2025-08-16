package com.niloufar.training.learningspring.algorithms.trash;

import java.util.*;
import java.util.stream.Collectors;

public class march11 {
    public static void main(String[] args) {
        System.out.println(nextClosestTime("17:23"));
        int result = findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println(result);
        int findEvenNumber = findNumbers(new int [] {12,345,2,6,7896});
        System.out.println(findEvenNumber);

        ReverseString();
        LowerCase();
        UpperCase();
        RemoveDublicates();
        RemoveDublicateInPlace();
        removeDuplicates2();
        hasDuplicateInOrderArray();
        hasDuplicateUnOrderedArray();
         hasDuplicateUnorderedArray2();
         PrintAllPossibleSubArrays();
         PrintAllSubArrayOfSizek();
         printSubarraysOfSizeK();

    }
    //---------------------------------------------------------------------------------------------------------------------------
    public static String nextClosestTime(String time) {

        char [] chars = time.toCharArray();
        String [] hour = time.split(":");
        int [] arr = {1,2,3,4};

        //List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList()); ;
        List<Integer> nums = Arrays.stream(time.split(":") ).map(Integer::parseInt).collect(Collectors.toList());
        return hour[1];
    }
    //---------------------------------------------------------------------------------------------------------------------------
    public static int findMaxConsecutiveOnes(int[] nums) {
        int Max= 0;
        int tempMax= 0;
        for(int i = 0; i < nums.length ; i ++){
            if(nums[i] == 1 )
            {
                tempMax ++;
                Max = Math.max(Max, tempMax);
            }else{
                tempMax = 0;
            }
        }
        return Max;
    }
    //---------------------------------------------------------------------------------------------------------------------------
    public static  int findNumbers(int[] nums) {
        int AllEvenNumber = 0;
        for(int num : nums){
            int numSize = 0;
            while(num > 0){
                num = num/10;
                numSize++;
            }
            if(numSize%2 == 0) AllEvenNumber++;
        }
        return AllEvenNumber;
    }
    //---------------------------------------------------------------------------------------------------------------------------
    public int[] sortedSquares(int[] nums) {
        for(int num : nums){
            num = num * num;
        }
        Arrays.sort(nums);
        return   nums;
    }
    //---------------------------------------------------------------------------------------------------------------------------

    public static void ReverseString (){
        String name = "Niloufar";
        char [] chars = name.toCharArray();
        int i =0;
        int j = name.length() - 1;
        while (i < j){
            char temp =chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
        System.out.println(chars);
    }
    //--------------------------------------------------------------------------------------------------------------------------
    public static void LowerCase(){
        String s = "NILOUFSR";
        s.toLowerCase();
        char [] chars= s.toCharArray();
        for (int i = 0;i <s.length(); i ++ ){
            if(chars[i] >= 'A' || chars[i] <='Z'){
                chars[i]= (char)( chars[i] + 32);
            }
        }
        System.out.println(chars);
    }
    //--------------------------------------------------------------------------------------------------------------------------
    public static void UpperCase(){
        String s = "niloufar";
        char [] chars = s.toCharArray();
        for (int i =0; i < s.length(); i ++){
            if(chars[i] >= 'a' || chars[i] <='z'){
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.println("making the string Upper case : " + Arrays.toString(chars));
    }
    //-----------------------------------------------------------------------------------------------------------------------
    public static void RemoveDublicates(){
        int [] arr = {1,1,0,2,2,3,4,4,5};
        //arr = {1,2,3,4,}
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i ++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    public static void RemoveDublicateInPlace(){
        int [] arr = {1,2,2,3,4,4};
        //arr = {1,2,3,4,null,null)
        int index = 0;
        for (int i = 1; i < arr.length  ; i ++){
            if( arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDuplicates2() {
        int [] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int j = 0; // Pointer for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { // Found a new unique element
                j++;
                nums[j] = nums[i]; // Move unique element forward
            }
        }
        for (int i = j + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));; // Return new length of unique elements
    }
    //--------------------------------------------------------------------------------------------
    public static void hasDuplicateInOrderArray(){
        int [] arr = {1,2,2,3,4,4,5,6,7,7,7};
        boolean res = false;
        for (int i = 0; i < arr.length; i ++){
            if(arr[i] == arr[i++]){
               res = true;
            }
        }
        System.out.println("Do we have dublicates?"+ res );
    }
    public static  void hasDuplicateUnOrderedArray(){
        int [] arr = {1,2,2,3,4,4,5,6,7,7,7,1,3,4,5,6,7};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++){  //map --> [1 : 2, 2 : 2, 3: 2]
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        //loop the map for value > 2
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >=2){
                System.out.println("I have founnd repeatation in the array in " + e.getKey());
            }
        }
    }

    public static void hasDuplicateUnorderedArray2(){
        int [] arr = {1,1,2,2,3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i ++){
            if(map.containsKey(arr[i])){
                System.out.println("I have found repeatation for  values " + arr[i]);
            }
            map.put(arr[i],i);
        }
    }
    //---------------------------------------------------------------------------------------------------------------------------
    public static void PrintAllPossibleSubArrays(){
        int [] nums = {1,2,3,4};
        List<List<Integer>> allSubs = new ArrayList<>();
        for(int i =0; i< nums.length; i ++){ //
            for (int j = i; j < nums.length; j ++){
                List<Integer> subs = new ArrayList<>();
                for(int k=i; k<=j; k++){
                    subs.add(nums[k]);
                }
                allSubs.add(subs);
            }

        }
        System.out.println(allSubs);
    }
    //
    public static void PrintAllSubArrayOfSizek() {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> allSubs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> subs = new ArrayList<>();
                for (int s = i; s <= j; s++) {
                    subs.add(s);
                }
                if(subs.size()== 3)
                    allSubs.add(subs);
            }
        }
        System.out.print(allSubs);
    }
    public static void printSubarraysOfSizeK() {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int n = nums.length;

        for (int start = 0; start <= n - k; start++) { //[0,1,2], [1,2,3], [2,3,4], [3,4,5]
            for (int end = start; end < start + k; end++) {//
                System.out.print(nums[end] + " ");
            }
            System.out.println(); // New line after each subarray
        }
    }

}
