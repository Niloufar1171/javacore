package dailypractice.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class may29 {
    public static void main (String [] args){

    }
    public class TreeNode{
        TreeNode left ;
        TreeNode right;
        int val;
    public TreeNode (int val){
        this.val = val;
    }
        public TreeNode(int val, TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private int value;
    public boolean isValidBST(TreeNode root){
     value = 0;
     return inOrder(root);
    }
    public boolean inOrder(TreeNode root){
        if (root == null) return true;
        if(!inOrder(root.left)) return false;
        if(value != 0  && root.val <= value){
            return false;
        }
        value = root.val;
        return inOrder(root.right);
    }
    public boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1== null && t2== null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.right,t2.left) && isMirror(t1.left,t2.right);
    }
    List<List<Integer>> list = new LinkedList<>();
    public List<List<Integer>> leverOrder(TreeNode root){
        if(root == null) return list;
        bfs(root, 0);
        return list;
    }
    public void bfs(TreeNode root, int level){
        if(list.size() == level) list.add(new ArrayList<Integer>());
        list.get(level).add(root.val);
        if(root.left != null) bfs(root.left, level++);
        if(root.right != null)bfs(root.right, level++);
    }
    public TreeNode sortedArrayToBST(int []nums){

       TreeNode tree = new TreeNode(nums[0]);
        for(int num : nums){
           if(tree.val < num ) tree.left.val = num;
           else if (tree.val > num) tree.right.val = num;
       }
        return tree;
    }
    public void merge(int [] nums1, int m, int [] nums2, int n){
        for(int i = 0 ; i < n; i ++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

}
