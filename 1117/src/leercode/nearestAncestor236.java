package leercode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/17
 * TIME:14:51
 */
//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
public class nearestAncestor236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root||q==root){
            return root;
        }
        boolean pInleft=search(root.left,p);
        boolean qInleft=search(root.left,q);

        //都在左子树
        if(pInleft&&qInleft){
            return lowestCommonAncestor(root.left,p,q);
        }
        //都在右子树
        else if(!pInleft&&!qInleft){
            return lowestCommonAncestor(root.right,p,q);
        }

        else{
            return root;
        }

    }

    private boolean search(TreeNode root, TreeNode t) {
        if(root==null){
            return false;
        }
        if(root==t){
            return true;
        }
        return search(root.left,t)||search(root.right,t);
    }
}
