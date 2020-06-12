package com.interview.datastructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftSideView {
	public List<Integer> leftSideView(TreeNode root) {
        if(root == null)
        {
            return new ArrayList();
        }
        List<Integer> rightSide = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            TreeNode curr = queue.peek();
            rightSide.add(curr.val);
            
            int n = queue.size();
            for(int i=0; i<n; i++)
            {
                TreeNode temp = queue.poll();
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
        
        return rightSide;
    }
}
