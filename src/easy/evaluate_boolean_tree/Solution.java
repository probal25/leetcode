package easy.evaluate_boolean_tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static List<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println(evaluateTree(root));
    }

    public static boolean evaluateTree(TreeNode root) {
        traverse(root);
        System.out.println(results);
        return false;
    }

    private static void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);
        traverse(node.right);
        results.add(node.val);
    }

    private static TreeNode createTree() {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode rightLeft = new TreeNode(0);
        TreeNode rightRight = new TreeNode(1);

        root.left = left;
        root.right = right;
        root.right.left = rightLeft;
        root.right.right = rightRight;

        return root;
    }
}
