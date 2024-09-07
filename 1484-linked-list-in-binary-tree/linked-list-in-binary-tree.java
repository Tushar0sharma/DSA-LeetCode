/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        if(check(head,root)) return true;
        return isSubPath(head,root.right) || isSubPath(head,root.left);
    }
    public boolean check(ListNode head, TreeNode root){
        if(head==null && root==null) return true;
        if(head==null && root!=null) return true;
        if(head!=null && root==null) return false;
        if(head.val!=root.val) return false;
        return check(head.next,root.left)||check(head.next,root.right);
    }
}