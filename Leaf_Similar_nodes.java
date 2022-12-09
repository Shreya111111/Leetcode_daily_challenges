/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         ArrayList<Integer> leaf_1 = new ArrayList<>();
          ArrayList<Integer> leaf_2 = new ArrayList<>();
        leaf_1 =L_Nodes(root1,leaf_1);
        leaf_2 =L_Nodes(root2,leaf_2);
        
        return leaf_1.equals(leaf_2);
         
    }
    
    public static ArrayList<Integer> L_Nodes(TreeNode root,ArrayList<Integer> leaf)
    {
        if(root == null){
            return null;
        }
        
        if(root.left == null && root.right == null){
            leaf.add(root.val);
        }
        
        L_Nodes(root.left,leaf);
        L_Nodes(root.right,leaf);
        
        return  leaf;
    }
}
