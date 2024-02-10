package StacksAndQues;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class RecentCounter {
    
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {

        if (q.isEmpty()) {
            q.add(t);
            return 1;
        } else {
            if (t < q.peek()) {
                q.add(t);
                return q.size();
            } else {
                while (!q.isEmpty() && q.peek() < t - 3000) {
                    q.remove();
                }
                q.add(t);
                return q.size();


            }
        }

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
