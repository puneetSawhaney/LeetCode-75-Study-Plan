// code by Puneet 
// please visit to explanation file of this code to understand the approach

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
class Solution {
    public ListNode deleteMiddle(ListNode head) {// If linked list is empty/ has only one node, there is no middle node to delete, so the method returns null.
        if(head == null || head.next == null){
            return null;
        }
        // slow pointer advances one node at a time
        ListNode slow = head;
        // the fast pointer advances two nodes at a time.
        ListNode fast = head.next.next;
//  loop iterates until the fast pointer reaches the end of the list (null) or the second-to-last node.
        while(fast != null && fast.next != null){
            // slow pointer moves one step
            slow = slow.next;
            // fast pointer moves two steps
            fast = fast.next.next;
        }
        // slow pointer will be at the middle node when the loop exits
        // (slow.next) to skip the middle node.
        slow.next = slow.next.next;
        // updated head
        return head;
    }
}
