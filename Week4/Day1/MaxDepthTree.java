class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
       return height(root);
    }
    public int height(TreeNode node){
        if(node == null){
         return 0;
        }
    int leftheight = height(node.left);
    int rightheight = height(node.right);
    return Math.max(leftheight,rightheight)+1;
}
}
