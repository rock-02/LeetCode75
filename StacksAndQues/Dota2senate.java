package StacksAndQues;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2senate {
    class Pair {
        int i;
        char val;

        Pair(int i, char j) {
            this.i = i;
            this.val = j;
        }
    }

    public String predictPartyVictory(String senate) {

        Queue<Pair> R1 = new LinkedList<>();
        Queue<Pair> D1 = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                R1.add(new Pair(i, senate.charAt(i)));
            else
                D1.add(new Pair(i, senate.charAt(i)));
        }

        while (!R1.isEmpty() && !D1.isEmpty()) {
            Pair r = R1.poll();

            Pair d = D1.poll();

            if (r.i < d.i) {
                R1.add(new Pair(r.i + n, r.val));
            } else if (r.i > d.i) {
                D1.add(new Pair(d.i + n, d.val));
            } else {
                continue;
            }
        }
        return R1.size() > D1.size() ? "Radiant" : "Dire";
    }

}
