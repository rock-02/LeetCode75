package StacksAndQues;

import java.util.*;

public class kworkers {

    public long totalCost(int[] costs, int k, int candidates) {

        long totalCost = 0;

        if (candidates * 2 >= costs.length) {
            Arrays.sort(costs);

            for (int i = 0; i < k; i++) {
                totalCost += costs[i];
            }

            return totalCost;
        }

        PriorityQueue<Integer> s = new PriorityQueue<>();
        PriorityQueue<Integer> t = new PriorityQueue<>();

        int l = 0;
        int r = costs.length - 1;

        for (int i = 0; i < candidates; i++) {
            s.add(costs[l++]);
            t.add(costs[r--]);
        }
        System.out.println(s);
        System.out.println(t);
        while (l <= r && k > 0) {
            if (t.peek() < s.peek()) {
                int ch = t.peek();
                totalCost += t.remove();
                t.add(costs[r--]);
                System.out.println("chosen Element : " + ch);
            } else {
                int ch = s.peek();
                totalCost += s.remove();
                s.add(costs[l++]);
                System.out.println("chosen Element : " + ch);
            }
            k--;

        }

        while (k > 0) {
            if (!s.isEmpty() && !t.isEmpty()) {
                if (t.peek() < s.peek()) {
                    totalCost += t.remove();
                } else {
                    totalCost += s.remove();
                }
            } else if (!s.isEmpty()) {
                totalCost += s.remove();
            } else if (!t.isEmpty()) {
                totalCost += t.remove();
            }

            k--;

        }
        return totalCost;

    }

}
