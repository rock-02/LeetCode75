package StacksAndQues;

import java.util.*;

public class SmallestInfiniteSet {
    PriorityQueue<Integer> q;
    HashSet<Integer> hs;

    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        hs = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            q.add(i);
        }
    }

    public int popSmallest() {
        if (!q.isEmpty()) {
            int val = q.remove();
            hs.add(val);

            return val;
        }
        return -1;
    }

    public void addBack(int num) {
        if (hs.contains(num)) {
            q.add(num);

            hs.remove(num);
        }

    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */