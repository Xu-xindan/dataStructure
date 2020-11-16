package leetcode;

import BinaryTree.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:15:16
 */
//输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
//如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
//求结点左右子树高度 判断是否相等
public class balanceTreeJZ55 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lefth=getHeight(root.left);
        int righth=getHeight(root.right);
        int dif=lefth-righth;
        if(!(dif==-1||dif==0||dif==1)){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.right),getHeight(root.left))+1;
    }
}
