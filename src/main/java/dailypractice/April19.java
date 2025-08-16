//package dailypractice;
//
//public class April19 {
//        public int[] sortArray(int[] nums) {
//            mergesort(nums, 0 , nums.length);
//
//            return nums;
//        }
//
//
//    public  void mergeFun(int[] arr, int l, int m, int r) {
//            int n1 = arr[m] - arr[l];
//            int n2 = arr[r] - arr [mid];
//            int [] l1 = new  int[n1];
//            for (int i = 0; i < n1; i++){
//                l1[i] = arr[i];
//            }
//            int [] l2 = new int [n2];
//            for (int j = 0 ; j < n2; j ++){
//                l2[j] = arr[j];
//            }
//
//            for(int k = 0 ; k < n1+n2; k++)){
//                if(l1[k] >l2[k]){
//                    int temp = l1[k];
//                    l1[k] = l2[k];
//                    l2[k] = temp;
//                }
//            }
//        }
//        public  void mergeSort(int[] arr, int low, int high) {
//            //find a mid
//            if(low< high )
//                int mid = high - low/2 + low;
//
//            meregsort(arr, low, mid);
//            mergesort(arr, mid+1, high);
//            mergefun(arr, low, mid, high);
//        }
//
//}
