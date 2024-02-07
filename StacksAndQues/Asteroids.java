package StacksAndQues;

import java.util.Arrays;
import java.util.Stack;

public class Asteroids {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (s.isEmpty()) {
                s.push(asteroids[i]);
            } else {
                while(!s.isEmpty()){
                    if(s.peek() > 0 && asteroids[i] < 0){
                        if(s.peek() == Math.abs(asteroids[i])){
                            s.pop();
                            break;
                        } else if(s.peek() > Math.abs(asteroids[i])){
                            break;
                        } else {
                            s.pop();
                            if(s.isEmpty()){
                                s.push(asteroids[i]);
                                break;
                            }
                        }
                    } else {
                        s.push(asteroids[i]);
                        break;
                    }
                }
            }
        }
        int[] ans = new int[s.size()];

        for (int i = s.size() - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }


        return ans;
    }
}
