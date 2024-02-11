package Linkedlists;

import Linkedlists.deleteMiddleNode.Solution.ListNode;

public class maxTwinSum {
    public void sum(ListNode head, int i) {
        if (head == null)
            return;

        size++;
        sum(head.next, i + 1);

        if (i >= size / 2) {
            max = Math.max(max, head.val + temp.val);
            temp = temp.next;
        }

        return;
    }

    static ListNode temp = null;
    static int max = Integer.MIN_VALUE;
    static int size = 0;

    public int pairSum(ListNode head) {
        temp = head;
        sum(head, 1);
        size = 0;
        int ans = max;
        max = Integer.MIN_VALUE;
        return ans;
    }
}
