package StacksAndQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class subsequencescore {
    class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        ArrayList<Pair> arr = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            arr.add(new Pair(nums2[i], nums1[i]));
        }
        Collections.sort(arr, (a, b) -> {
            return b.i - a.i;
        });

        // for (Pair pair : arr) {
        // System.out.println(pair.i + " " + pair.j);
        // }

        long sum = 0;
        long max = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Pair pair : arr) {
            pq.add(pair.j);
            sum += pair.j;

            if (pq.size() > k) {
                sum -= pq.poll();
            }

            if (pq.size() == k) {
                max = Math.max(max, sum * pair.i);
            }

        }

        return max;
    }
}
