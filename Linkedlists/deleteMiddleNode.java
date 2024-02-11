package Linkedlists;

public class deleteMiddleNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }

        public ListNode deleteMiddle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;
            int s = 0;
            while (slow != null) {
                slow = slow.next;
                s++;
            }
            if (s == 1) {
                return null;
            }
            slow = head;
            while (fast.next != null && fast.next.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            if (s % 2 == 0) {
                prev = slow;
                slow = slow.next;
                prev.next = slow.next;
                return head;
            }

            prev.next = slow.next;
            return head;
        }
    }
}
