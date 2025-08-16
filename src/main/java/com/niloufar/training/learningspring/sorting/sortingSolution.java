package com.niloufar.training.learningspring.sorting;

import java.util.Arrays;

public class sortingSolution {
    public static void InsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int j;
            for (j = i-1;j >= 0 && a[j] > curr; j--)
                a[j + 1] = a[j];
            a[j + 1] = curr;
        }
    }
    public static void swap(int []a, int x, int y){
        int temp = a[x];
            a[x]=a[y];
            a[y]= temp;
    }
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int  min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swap(arr,i, min_index);
        }
    }
    public static void heapSort(int[] arr) {
            for (int i = arr.length / 2 - 1; i >= 0; i--)
                maxHeapify(arr, arr.length, i);

            for (int i = arr.length - 1; i > 0; i--) {
              int temp = arr[i];
               arr[i] = arr[0];
               arr[0] = temp;
               swap(arr, i , 0);
                maxHeapify(arr, i, 0);
            }
        }
    public static void maxHeapify(int[] arr, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && arr[left] > arr[largest]) {
                largest = left;
            }
        if (right < heapSize && arr[right] > arr[largest]) {
                largest = right;
            }
        if (largest != index) {
            swap(arr, index,largest);
            maxHeapify(arr, heapSize, largest);
            }
        }
    public static int[] quickSortsolution(int[] nums) {
           quickSort(nums, 0, nums.length - 1);
           return nums;
       }
    public static void quickSort(int[] nums, int left, int right) {
           if (left >= right) {
               return;
           }
           int p = Partition(nums, left, right);
           quickSort(nums, left, p - 1);
           quickSort(nums, p + 1, right);
       }
    public static int Partition(int[] nums, int left, int right) {
          int pivot = right; int j = right - 1; int i = left;

           while (i <= j) {
               if (nums[i] < nums[pivot]) i++;
                else if (nums[j] >= nums[pivot]) j--;
                else {
                   swap(nums, i, j);
                   i++; j--;
               }
           }
           swap(nums, i, pivot);
           return i;
     }


    public static void main(String[] args) {
        int [] arr = {7,3,2,5,6,10,9,8,1};
       // InsertionSort(arr);
        //SelectionSort(arr);
      //  heapSort(arr);
        quickSortsolution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
