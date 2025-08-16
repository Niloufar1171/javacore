package com.niloufar.training.learningspring.algorithms.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {

   static int maxLevel = -1;
   public class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;

       public TreeNode(int val, TreeNode left, TreeNode right){
           this.left = left;
           this.right = right;
           this.val = val;
       }
   }
//-------BASICS----Valid-Traversal-----------------------------------------------------------------------------------------------------------------------------
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        int left = root.left.val;
        int right = root.right.val;
        if ( (root.left.val != 0 && root.val <= root.left.val) || (root.right.val != 0 && root.val >= root.right.val))
            return false;
        else
            return isValidBST(root.left) && isValidBST(root.right);

    }
//-------------------------------------------------------------------------------------------------------------------------------------------
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root ==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    /*
  One step right and then always left
  */
    public int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    /*
    One step left and then always right//memorize this
    */
    public int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;


        if (key > root.val) root.right = deleteNode(root.right, key);

        else if (key < root.val) root.left = deleteNode(root.left, key);

        else {

            if (root.left == null && root.right == null) root = null;

            else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }

            else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }
    //------------level order traversal or BFS-------------------------------------------------------------------------------------------------------------------------------
        public void printRightView(TreeNode root) {
            if (root == null) return;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
//--------------------------------
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();

                    // Print the last node of the current level
                    if (i == size - 1) {
                        System.out.print(node.val + " ");
                    }
//---------------------
                    // Add left and right children
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
        }
    //-------------------------------------------------------------------------------------------------------------------------------------------
        public void printRightView_re(TreeNode root, int level) {
            if (root == null) return;

            if (level > maxLevel) {
                System.out.print(root.val + " ");
                maxLevel = level;
            }

            // Visit right before left
            printRightView_re(root.right, level + 1);
            printRightView_re(root.left, level + 1);
        }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.left, t2.right);
    }
//-------------------------------------------------------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int [] a = {2,1,3};
//        Solution bst = new Solution();
//        TreeNode tree = new TreeNode()
//        bst.inorderTraversal();
//
//    }



    }
