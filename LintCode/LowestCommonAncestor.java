/**
 * Lowest Common Ancestor
 * http://www.lintcode.com/en/problem/lowest-common-ancestor/
 *
 * Given the root and two nodes in a Binary Tree. Find the lowest common
 * ancestor(LCA) of the two nodes.The lowest common ancestor is the node
 * with largest depth which is the ancestor of both nodes.
 *
 * Example
 * For the following binary tree:
 *     4
 *    / \
 *   3   7
 *     / \
 *    5   6
 *
 *    LCA(3, 5) = 4
 *    LCA(5, 6) = 7
 *    LCA(6, 7) = 7
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
  /**
   * @param root: The root of the binary search tree.
   * @param A and B: two nodes in a Binary.
   * @return: Return the least common ancestor(LCA) of the two nodes.
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
    // write your code here
    if (root == null || root.val == A.val || root.val == B.val) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, A, B);
    TreeNode right = lowestCommonAncestor(root.right, A, B);
    if (left != null & right != null) {
      return root;
    }
    if (left != null) {
      return left;
    }
    if (right != null) {
      return right;
    }
    return null;
  }
}