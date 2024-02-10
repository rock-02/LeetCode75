package StacksAndQues;

import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(-nums[i]);
        }
        int kth = -10;
        while (k-- > 0) {
            kth = -1 * pq.remove();
        }

        return kth;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };

        int k = findKthLargest(nums, 2);

        System.out.println(k);

    }
}
