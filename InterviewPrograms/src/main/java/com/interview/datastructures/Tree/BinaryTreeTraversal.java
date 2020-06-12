package com.interview.datastructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeTraversal {
    Node root;

    // An iterative process to print preorder traversal of Binary tree
    List<Integer> preorder(Node node) {
        List<Integer> resultList = new ArrayList<Integer>();
        // Base Case
        if (node == null) {
            return resultList;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        /*
         * Pop all items one by one. Do following for every popped item a) print
         * it b) push its right child c) push its left child Note that right
         * child is pushed first so that left is processed first
         */
        while (nodeStack.empty() == false) {
            Node mynode = nodeStack.pop();
            resultList.add(mynode.data);
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
        return resultList;
    }

    // An iterative function to do postorder traversal
    // of a given binary tree
    List<Integer> postorderTraversal(Node root) {
        List<Integer> res = new ArrayList<Integer>();

        if (root == null) {
            return res;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.peek();
            if (temp.left == null && temp.right == null) {
                Node pop = stack.pop();
                res.add(pop.data);
            } else {
                if (temp.right != null) {
                    stack.push(temp.right);
                    temp.right = null;
                }

                if (temp.left != null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }

        return res;
    }

    void inorder() {
        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0) {

            /*
             * Reach the left most Node of the curr Node
             */
            while (curr != null) {
                /*
                 * place pointer to a tree node on the stack before traversing
                 * the node's left subtree
                 */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /*
             * we have visited the node and its left subtree. Now, it's right
             * subtree's turn
             */
            curr = curr.right;
        }
    }

    void printLevelOrder(Node root) {
        // Base Case
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.printf("%d ", tempNode.data);
            if (tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    Queue<Integer> drill(Node node, int clevel, int rlevel, Queue<Integer> result) {
        if (clevel == rlevel) {
            result.add(node.data);
        } else {
            if (node.left != null)
                drill(node.left, clevel + 1, rlevel, result);
            if (node.right != null)
                drill(node.right, clevel + 1, rlevel, result);
        }
        return result;
    }
}
