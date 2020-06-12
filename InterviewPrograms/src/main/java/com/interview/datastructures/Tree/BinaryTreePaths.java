package com.interview.datastructures.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryRec(root, paths, "");
        return paths;
    }
    
    public void binaryRec(TreeNode root, List<String> paths, String path) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            path += root.val;
            paths.add(path);
            return;
            
        }
        
        binaryRec(root.left, paths, path + root.val +"->");
        binaryRec(root.right, paths, path + root.val +"->");
    }
}
