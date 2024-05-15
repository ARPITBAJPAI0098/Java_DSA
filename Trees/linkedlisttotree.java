class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        // Find the middle of the linked list
        ListNode mid = findMiddle(head);
        
        // Create a new TreeNode with the value of the middle node
        TreeNode root = new TreeNode(mid.val);

        // If there's only one node in the list, no need for further recursion
        if (head == mid) {
            return root;
        }

        // Recursively construct the left and right subtrees
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect the left half from the middle node
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}
