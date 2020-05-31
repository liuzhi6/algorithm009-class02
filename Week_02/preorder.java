package com.company.twoWeek.operation;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * N叉树的前序遍历
 */
public class preorder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        public List<Integer> preorder(Node root) {
            List<Integer> res = new LinkedList<>();
            if (root == null) return res;
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node cur = stack.pop();
                res.add(cur.val);
                for (int i = cur.children.size() - 1; i >= 0; i++) {
                    stack.push(cur.children.get(i));
                }
            }
            return res;
        }

    }
}