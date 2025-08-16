package com.niloufar.training.learningspring.algorithms.StringsAndArrays;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysStrings {
    // **********************************************************************************************************************
    // BASICs - REVERSE - TWO SUM - ANAGRAM - DUBLICATES - Palidrom
    // **********************************************************************************************************************
   //1
    public static void ReverseString(String s){
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() -1 ;
        while(i < j ){
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i ++;
            j--;
        }
        System.out.println(String.valueOf(characters));// put into String
        System.out.println(Arrays.toString(characters));//put into an array
    }
    // **********************************************************************************************************************
    public static void  ReverseArray(int[] arr){
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
    public static String reverseBySB (String s ) {
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        //another approach
        // new String biulder(s)
        //sb.reverse().toString
        //new StringBuilder(s).reverse().toString();
        return sb.toString();
    }
    //**********************************************************************************************************************
    public static String reverseByString(String str){
        String newString= "";
        for (int i = str.length() -1 ; i >=0 ; i--){
            newString += str.charAt(i);
        }
        return newString;
    }
    //**********************************************************************************************************************
    public static String  reverseByPointers(char[] s) {
        // String s ----> char [] chars = s.toCharArray();
        //char [] chars ---> new String(chars)
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i ++;
            j--;
        }
        // String rev = "";
        // int i = s.length -1;
        // while (i >= 0){
        //     rev = rev + s[i];
        //     i--;
        // }
        return Arrays.toString(s);
    }
    //**********************************************************************************************************************
    public static String reverseEachWord (String s){
        if (s.isEmpty()) {
            return s;
        }
        List<String> listrstr = Arrays.asList(s.split(" "));

        for (int i = 0; i < listrstr.size(); i++) {
            StringBuilder sb = new StringBuilder(listrstr.get(i)); //create new string
            listrstr.set(i, sb.reverse().toString());///reverse it and put it back in the array List
        }
        return listrstr.toString();

    }
    //**********************************************************************************************************************
    public static String reverseWords(String s) {

        s = s.trim();//to remove spaces before and after

        List<String> liststr = Arrays.asList(s.split("\\s+"));

        StringBuilder sb = new StringBuilder();

        Collections.reverse(liststr);

        return String.join(" ", liststr);
    }
    //**********************************************************************************************************************
    //----Reverse---Reverse vowels -- Palindrome ---Palidrome premutation---Anagram --
    public static boolean isPalindrome1(String s) {

        int i = 0,  j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrome2(String s) {
        if (s == null) return false; // Handle null case
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // Skip non-letter characters
            if (!isLetter(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isLetter(s.charAt(right))) {
                right--;
                continue;
            }
            // Convert to lowercase manually
            if (toLower(s.charAt(left)) != toLower(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Check if a character is a letter (A-Z or a-z)
    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    // Convert uppercase letter to lowercase manually
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32); // Convert uppercase to lowercase
        }
        return c; // If already lowercase or non-letter, return as is
    }
    // **********************************************************************************************************************
    public static void twoSum(int [] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){

            if(map.containsKey(target - nums[i])){
               System.out.println("If you add : " +nums[i] + " Plus " + (target - nums[i]) + "you will have " + target);
           }
            map.put(nums[i], i );// number and it;s index
        }

    }
    // **********************************************************************************************************************
    public static void SumOfKConsecutives(int [] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (counter < k - 1) {
                sum += nums[j];
                counter++;
            }
            res.add(sum);
            counter = 0;
            sum = 0;
        }
        System.out.println(res);;
    }
    public static void ksum(int [] nums){
    }
    // **********************************************************************************************************************
    public static void isAnagram(String s){
        char [] charsArray = s.toCharArray();
        StringBuilder rev = new StringBuilder();
        int i = s.length() - 1 ;
        while (i >= 0){
            rev.append(charsArray[i]);
            i--;
        }
        System.out.println( rev.toString() + rev.toString().equals(s));
    }
    // *******************************************//this have error***************************************************************************
    public static  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        // atee : a :1, t : 1 , e : 2
        //eate : e : 2 , a : 1, t:1
        // loop through
        List<Map<Character, Integer>> listmap = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < strs.length - 1  ; i ++){
            for (Character c : strs[i].toCharArray()) {
                listmap.get(i).put(c, map.getOrDefault(c, 0) + 1);
            }

        }
        System.out.println(listmap);
        return  res;
    }
    // *******************************************//Maybe this ? it reverse an array of string ! ***************************************************************************
    public static void GroupAnagrom (String [] str){

        for(int i = 0; i < str.length -1 ; i ++ ){
            StringBuilder sb = new StringBuilder(str[i]);
            str[i] =sb.reverse().toString();
        }
        System.out.println(Arrays.asList(str));
    }
    // **********************************************************************************************************************
    public static boolean isAnagram(String s, String t){
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        return Arrays.equals(str1, str2);
    }
    // **********************************************************************************************************************
    public static void RemoveDublicates(String s){
//     Map<Character, Integer> map = new HashMap<>();
//     for(char c : s.toCharArray()){
//         map.put(c, map.getOrDefault(c,0) + 1 );
//     }

        String input = "banana";
        StringBuilder result = new StringBuilder();
        // LinkedHashSet preserves order
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }
        System.out.println(result.toString()); // prints "ban"
    }

    // **********************************************************************************************************************
    public static void RemoveDublicates(int[] nums ){
        if (nums.length == 0) System.out.println(" 0");

        int insertIndex = 1;
        for (int i = 1; i < nums.length ; i++){
            nums[insertIndex] = nums[i];
            if (nums[insertIndex] != nums[insertIndex - 1] )
                insertIndex++;
        }

        System.out.println(insertIndex);
    }
    // *********************When I need to show the result *************************************************************************************************
    public static int removeDuplicates(int[] nums) { //array is sorted
        if (nums.length == 0) return 0;
        int insertIndex = 1;
        for (int i = 1; i < nums.length ; i++){
            nums[insertIndex] = nums[i];
            if (nums[insertIndex] != nums[insertIndex - 1] ) insertIndex++;
        }
        return insertIndex;
    }
    // **********************************************************************************************************************
    public static void removeDublicateSortedArray2(int [] nums){ //array is sorted
        // 1 ,2,2,3,4,4,5 --> 1,2,3,4,5
        List<Integer> res = new ArrayList<>();
        int Index = 1;
        res.add(nums[0]);
        for (int i = 1; i < nums.length  ; i ++){
            nums [Index] = nums[i];
            if(nums[Index] != nums[Index -1]){
                Index ++;
                res.add(nums[i]);
            }

        }
        System.out.println(res);
    }
    // **********************************************************************************************************************
    public boolean containsDuplicate(int[] nums) { //hasDublicats?
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) return true;
            map.put(nums[i], i);
        }
        return false;
    }
    // ****************************Using Map******************************************************************************************
    public  static  void removedublicatedNotSortedArray(int [] nums){
        //1, 2,3,,4,1 ,5,1, 4 --> 1,2,3,4,5
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<=nums.length -1 ;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) == 1)
                res.add(nums[i]);
        }
        System.out.println(res);

    }
    // **********************Using Set ************************************************************************************************
    public  static  void removedublicatedNotSortedArray2(int [] nums){
        //1, 2,3,,4,1 ,5,1, 4 --> 1,2,3,4,5
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i<=nums.length -1 ;i++){
            if(seen.add(nums[i])){
                res.add(nums[i]);
            }
        }
        System.out.println(res);
    }
    // **********************Only returns dublicates number ************************************************************************************************
    public static List<Integer> getDuplicates(List<Integer> nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num); // if already seen, it's a duplicate
            }
        }

        return new ArrayList<>(duplicates); // return only the duplicates
    }
    // **********************************************************************************************************************
    public static  int removeDuplicatesMoreThanTwoElements(int[] nums) { //array is sorted
        if (nums.length == 0) return 0;
        int j = 2;
        for (int i = 2; i < nums.length ; i++){
            nums[j] = nums[i];
            Arrays.stream(nums).forEach(System.out::print);
            if (nums[j] != nums[j - 2] )  j++;
        }
        return j;
    }
    // **********************************************************************************************************************
    public static void SingleNumber(int [] nums) {  //find the only UNIQUE numbers in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) { // 1 : 2 , 2 :3, 3:1  counting occurences
            map.put(i, map.getOrDefault(i, 0) + 1);//map.put(i, map.get(i) + 1) --- > map.getordefault(i,0) + 1
        }
        for (int i : nums) {
            if (map.get(i) == 1) {// check for each key to see if their values are equals to one or is Unique
                System.out.println(" numbers that are singles exists :");
            }
        }
        System.out.println("no single numbers exists");
    }
    //******************************************************************************************************************
    public static void CountRepeatation () {
        String str = "aaaabcdef";
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0) + 1 );

            for (Map.Entry e : map2.entrySet()) {
                System.out.println(e.getKey() + " , " + e.getValue());
            }
        }
    }
    // **********************************************************************************************************************
    //SUB ARRAY MANIPULATION -HAVING MORE THAN ONE STRING TO FIND A PATTERN -2
    // **********************************************************************************************************************
    //loop 1 start of the sub array
    //loop 2 end of subarray
    //loop 3 from start to end of sub array add to a list !

    public static List<List<Integer>> PrintAllSubArray(int [] nums){
        List<List<Integer>> subArray = new ArrayList<>();
        for (int i =0; i < nums.length ; i++){
            for( int j = i; j <nums.length; j ++){
                List<Integer> subs = new ArrayList<>();
                for(int k = i; k<= j ; k++){
                    System.out.println("k is : " + k );
                    System.out.println("nums[k] : " + nums[k]);
                    subs.add(nums[k]);
                }
                System.out.println(subs);
                subArray.add(subs);
            }
        }
        return subArray;
    }
    // *****************************Getting An array of string*****************************************************************************************
    public static void PrintAllSubArrayOfString( String [] str){
        List<List<String>> subArray = new ArrayList<>();
        for(int i = 0; i < str.length; i ++){
            for(int j = i; j< str.length; j++){
                List<String> subs= new ArrayList<>();
                for (int k = i; k<=j; k++){
                    subs.add(str[k]);
                }
                subArray.add(subs);
            }
        }
        System.out.println(subArray);
        //return subArray;
    }
    // ***********Getting an String ***********************************************************************************************************
    public static void PrintSubArraysOfString(String str){
        //abc --. a , b, c ,ab ,ac, bc, abc
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i <str.length() ; i ++){
            for (int j = i; j< str.length() ; j++ ){
                List<String> subs = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <= j ; k++){
                    sb.append(str.charAt(k));
                    subs.add(sb.toString());
                }
                res.add(subs);
            }
        }
        System.out.println(res);
    }
    //---------------------------getting int [] ------------------------------------------------------------------------------------------------
    public static void PrintAllPossibleSubArrays(){
        int [] nums = {1,2,3,4};
        List<List<Integer>> allSubs = new ArrayList<>();
        for(int i =0; i< nums.length; i ++){ //
            for (int j = i; j < nums.length; j ++){
                List<Integer> subs = new ArrayList<>();
                for(int k = i; k<=j; k++){
                    subs.add(nums[k]);
                }
                allSubs.add(subs);
            }

        }
        System.out.println(allSubs);
    }
    //**********************************************************************************************************************
    public static void printSubarraysOfSizeK() {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int n = nums.length;

        for (int start = 0; start <= n - k; start++) { //[0,1,2], [1,2,3], [2,3,4], [3,4,5]
            for (int end = start; end < start + k; end++) {// start + k
                System.out.print(nums[end] + " ");
            }
            System.out.println(); // New line after each subarray
        }
    }
    public  static void SubArrayOfKSize(int [] nums, int size) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= nums.length - size; i++) {
            List<Integer> subs = new ArrayList<>();// <----- pay attention to create the sub IN THE FOR LOOP
            for (int j = i; j < i + size; j++) {
                subs.add(nums[j]);
            }
            res.add(subs);
        }
        System.out.println(res);
    }
    // **********************************************************************************************************************
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || target < 0) {
            throw new IllegalArgumentException("Input array is null");
        }
        int len = nums.length;
        int start = 0;
        int end = 0;
        int minLen = len + 1;

        while (end < len) {
            target -= nums[end];
            end++;

            while (target <= 0) {
                minLen = Math.min(minLen, end - start);
                target += nums[start];
                start++;
            }
        }
        return minLen % (len + 1);
    }
    //O(n^3)
    public static int minSubArrayLen2 (int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k]; // sum = sum + nums[k];
                }
                if (sum >= target) {
                    minLength = Math.min(minLength, j - i + 1); // len of new sub Array
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    // **********************************************************************************************************************
    public static List<List<Integer>> PrintAllSubArraysOfSizeK(int [] nums, int k){
        List<List<Integer>> subArray = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList());
        for (int i =0; i < nums.length ; i++){
            for( int j = i; j <nums.length; j ++){
                List<Integer> subs = new ArrayList<>();
                for(int x = i; x<= j ; x++){
                    subs.add(nums[x]);
                }
                if(subs.size() == k)
                    subArray.add(subs);
            }
        }
        return subArray;
    }
    //**********************************************************************************************************************
    public static void isSubsequence (String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // move both pointers or just the right pointer
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
    }
    //**********************************************************************************************************************
    public static  boolean isSubsequence2(String str , String sub){
        //abc , ab --> true
        //cab  ,ab -->
        if (sub == null || str == null) return false;
        int i = 0; // Pointer for sub
        int j = 0; // Pointer for str
        while (i < sub.length() && j < str.length()) {
            if (sub.charAt(i) == str.charAt(j)) {
                i++; // Move in sub if there's a match
            }
            j++; // Always move in str
        }
        return  i == sub.length();
    }
    //***************DP!************************Kadane's Algorithm + Subarray Tracking*****************
    //Given an array of integers (positive, negative, or zero), find the contiguous subarray with the maximum sum.**************
    public static int findMaxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // reset current sum if adding arr[i] makes it worse
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Optional: to return the actual subarray as well
    public static int[] findMaxSubarrayWithIndices(int[] arr) {
        int maxSum = arr[0], currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // extract subarray
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    // **********************************************************************************************************************
    //--------MOVING (SHIFT, ROTATE, REVERSE )
    // **********************************************************************************************************************
    public static void rotate(int[] nums, int k) {  // shift to right and put at the begining of array

        k = k % nums.length ;//to know how many number to rotate;
        reverse (nums, 0, nums.length-1);//[1,2,3,4,5,6,7] -->7,6,5,4,3,2,1
        reverse(nums,0, k-1);//5,6,7,   4,3,2,1
        reverse(nums, k , nums.length-1); //5,6,7 1,2,3,4

    }
    // **********************************************************************************************************************
    public static void reverse(int [] nums, int start, int end){//doing just the swap
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    // **********************************************************************************************************************
    public static void duplicateZeros(int[] arr) {  //dublicates and shift to the right  Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4]
        int zeros = 0;
        for (int a : arr) {
            if (a == 0) zeros++;
        }
        for (int i = arr.length - 1, j = arr.length + zeros - 1; i < j; --i, --j) {
            if (j < arr.length) arr[j] = arr[i];
            if (arr[i] == 0)
                if (--j < arr.length) arr[j] = arr[i];
        }
    }
    // **********************************************************************************************************************
    // INTERVALS
    // **********************************************************************************************************************
    public static int[][] InsertInterval(int [][] intervals, int [] newInterval){
        LinkedList<int []> res = new LinkedList<>();
        int index = 0;
        //those behind interval
        while (index < intervals.length &&  intervals[index][0] < newInterval[0]){
            res.add(intervals[index]);
            index ++;
        }
        //if every interval is after new interval
        if (res.isEmpty()) res.add(newInterval);
        //those after new interval  with  no overlap
        else {
            if(res.getLast()[1] < newInterval[0] ) res.add(newInterval);
            else
                res.getLast()[1] = Math.max(res.getLast()[1], newInterval[1]);
        }
        while (index< intervals.length){
           newInterval = intervals[index];
            if(res.getLast()[1] <  intervals[index][0]) res.add(newInterval);
            else
                res.getLast()[1] = Math.max(res.getLast()[1], intervals[index][1]);
            index ++;
        }
        return res.toArray(new int[res.size()][2]);

    }
    // **********************************************************************************************************************
    public void removeInterval( int [][] intervals, int [] toBeremoved){
        List<List<Integer>> res = new ArrayList<>();
        for(int [] interval : intervals){
            if(interval[0] > toBeremoved[1] || interval[1] < toBeremoved[0])
                res.add(Arrays.asList(interval[0], interval[1]));
            else{
                if(interval[0] < toBeremoved[0])
                    res.add(Arrays.asList(interval[0], toBeremoved[0]));
                if(interval[1]> toBeremoved[1])
                    res.add(Arrays.asList(toBeremoved[1],interval[1]));
            }
        }

    }
    // **********************************************************************************************************************
    public static void FindMissingRanges(int [] nums, int lower, int upper){
        List<List<Integer>> res = new ArrayList<>();

       int start = lower;
        for (int num : nums){
            if( start < num ){
                res.add(Arrays.asList(start,num-1));
            }
            start = num + 1;
        }
        if(start <= upper){
            res.add(Arrays.asList(start, upper));
        }
        System.out.println(res);
    }
    public static void PrintAllPermutations(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        PermuteBacktracking(new ArrayList<>(), res, nums);
       // System.out.println(res);
    }
    // **********************************************************************************************************************
    //  PERMUTATIONS    // A permutation of a string is a rearrangement of its characters in every possible order.
    // **********************************************************************************************************************
    public static void PermuteBacktracking(List<Integer> sublist, List<List<Integer>> res,int [] nums ){
        if (sublist.size() == nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(int num : nums){
            if(!sublist.contains(num)) {
                sublist.add(num);
                System.out.println("calling :  sublist :"+  sublist  + "  result : " + res );
                PermuteBacktracking(sublist, res, nums);
                sublist.remove(sublist.size() -1 );
                System.out.println("sublist" + sublist);
            }
        }
    }
    // **********************************************************************************************************************

    public static void PrintAllPermutations(String str){
        List<List<Character>> res = new ArrayList<>();
        PermuteBacktracking(new ArrayList<>(), res, str);
        System.out.println(res);
     }
    // **********************************************************************************************************************
     public static void PermuteBacktracking(List<Character> sublist, List<List<Character>> res , String str ){
        if(sublist.size() == str.length()){
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(Character c : str.toCharArray()){
            if(!sublist.contains(c)){
                sublist.add(c);
                PermuteBacktracking(sublist, res, str);
                sublist.remove(sublist.size() -1 );
            }
        }
     }
    // **********************************************************************************************************************
    // OPERATIONS
    // **********************************************************************************************************************
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // move along the input array starting from the end
        for (int idx = n - 1; idx >= 0; --idx) {
            // set all the nines at the end of array to zeros
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            // here we have the rightmost not-nine
            else {
                // increase this rightmost not-nine by 1
                digits[idx]++;
                // and the job is done
                return digits;
            }
        }
        // we're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
    //---Operation ---String to int and reverse------add binary ----convert to roman and revese
    //map the roman numbers, loop through -- if i < i + 1 -> - : +
    public static void Roman (String s){
        int ans = 0;
        int[] roman = new int[128];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for (int i = 0; i + 1 < s.length(); i++) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                ans -= roman[s.charAt(i)];
            } else
                ans += roman[s.charAt(i)];
        }
        ans += roman[s.charAt(s.length() - 1)];
        System.out.println(ans);
    }
    //********************to change from upper case to lower case and wiseversa skip the numbers *************************************************
    public static void SwapUpperAndLowerCases(String str) {

        char [] result = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char c = str.toCharArray()[i]; // Get character manually
            if (c >= 'A' && c <= 'Z') {
                result[i] = (char) (c + 32); // Convert uppercase to lowercase
            } else if (c >= 'a' && c <= 'z') {
                result[i] = (char) (c - 32); // Convert lowercase to uppercase
            } else {
                result[i] = c; // Keep numbers and special characters unchanged
            }
        }
    }
    //************************* // Swap ONLY  adjacent characters*********************************************************
    public String swapPairs(String s) {
        char [] result = s.toCharArray();

        for (int i = 0; i < result.length - 1; i += 2) {
            result[i] = s.toCharArray()[i + 1]; // Swap adjacent characters
            result[i + 1] = s.toCharArray()[i];
        }
        return new String(result);
    }
    //**********************************************************************************************************************
    public List<String> fizzBuzz ( int n){
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0) res.add("Fizz");
            else if (i % 5 == 0) res.add("Buzz");
            else res.add(String.valueOf(i));
        }
        return res;

    }
    //**********************************************************************************************************************
    //LOOPS AND CONVERSIONS
    //**********************************************************************************************************************
    public static void Loop () {
        String s = "salam";
        System.out.println(" using regular for loop ");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(" using to char array to loop ");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
        String[] strs = {"flower", "flow", "flight"};
        for (String str : strs) {
            System.out.println(str);
        }
        for (String str : strs) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println("character" + i + " is " + str.charAt(i));
            }
        }
        List<String> sentences = Arrays.asList("Hello Nilloufar", "GoodBye Niloufar");
        for (String sentence : sentences){
            System.out.println(sentence);
        }
        //using streams
        sentences.stream().flatMap(sentence-> Arrays.stream(sentence.split(" "))).collect(Collectors.toList()).forEach(System.out::println);

        char[] charArray = {'J', 'a', 'v', 'a'};
        String str = String.valueOf(charArray);

        String convertedString = "";
        for (char c : charArray) {
            convertedString += c; // Manually append characters
        }
    }

    // **********************************************************************************************************************
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];

        int idx = 0;
        for (int s : set1) output[idx++] = s;

        return output;
    }
    public static void RemoveDublicateInPlace(int[] ints){
        int [] arr = {1,2,2,3,4,4};
        //arr = {1,2,3,4,null,null)
        int index = 0;
        for (int i = 1; i < arr.length  ; i ++){
            if( arr[i] != arr[index]) {
                index++;
                System.out.println( "i is " + i + "and a[i] is : " + arr[i] );
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
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);// map.put (key , map.get(key) + 1 ) map.put(arr[i], map.getorDefault(arr[]i, 0)  + 1
        }
        //loop the map for value > 2
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= 2){
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

}
