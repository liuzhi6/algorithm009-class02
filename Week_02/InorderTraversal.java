package com.company.twoWeek.operation;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中序遍历
 */
public class InorderTraversal {

   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res =new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(stack.size() > 0 || root != null){
            //不断往左子树方向走，每走一次就将当前节点保存到栈中
            //这是模拟递归的调用
            if(root !=null){
                stack.add(root);
                root = root.left;
            }else {
                //当前节点为空，说明左边走到头了，从栈中弹出节点并保存
                //然后转向右边节点，继续上面整个过程
                TreeNode tmp = stack.pop();
                res.add(tmp.val);
                root = tmp.right;
            }
        }
        return res;
    }


}
