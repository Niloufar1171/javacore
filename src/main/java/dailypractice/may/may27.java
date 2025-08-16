//package dailypractice.may;
//
//import java.util.ArrayList;
//import java.util.List;
//public class may27 {
//    public static void main (String [] args){
//    }
//    public class ListNode{
//        int val;
//        ListNode next;
//        ListNode (int data){
//            val = data;
//        }
//    }
//    public  ListNode RemoveNthFromEnd(ListNode head, int n){
//        ListNode dummy = new ListNode(0);
//        dummy.next= head;
//
//        ListNode first = dummy;
//        ListNode second = dummy;
//        for(int i = 0 ; i <= n ; i++){
//            first = first.next;
//        }
//        while(first != null){
//            first = first.next;
//            second = second.next;
//        }
//        second.next = second.next.next;
//        return dummy;
//    }
//    public ListNode ReverseList(ListNode head){
//        ListNode prev = head;
//        ListNode curr = head;
//        while(curr != null){
//            ListNode temp = new ListNode(0);
//            temp = curr.next;
//
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//        ListNode dummy = new ListNode(0);
//        ListNode prev = dummy;
//
//        while(l1 != null || l2 != null){
//            if(l1.val <= l2.val ){
//                prev.next = l1;
//                l1= l1.next;
//            }else if(l1.val > l2.val){
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        prev.next = l1 == null? l2: l1;
//
//        return dummy.next;
//    }
//    public boolean isPalidrome(ListNode head){
//        List<Integer> arr = new ArrayList<>();
//        ListNode curr = head;
//        while(curr != null ) {
//            arr.add(curr.val);
//            curr = curr.next;
//        }
//        int i = 0;
//        int j = arr.size();
//        while(i< arr.size()) {
//            if (arr.get(i) == arr.get(j)){
//                i++;
//            j--;
//        }
//            else return false;
//        }
//        return true;
//    }
//    public boolean hasCycle(ListNode head){
//        if(head == null) return false;
//        ListNode slow = head;
//        ListNode fast = head;
//        while (slow != fast){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//    }
//    class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    public int maxlevel (TreeNode root){
//        if(root == null ) return -1;
//        else{
//            int left_dep = maxlevel(root.left);
//            int right_dep = maxlevel(root.right);
//            return Math.max(left_dep, right_dep) + 1 ;
//        }
//    }
//
//}
