package Arrays;

import java.util.HashMap;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> hm1 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            hm1.put(word1.charAt(i), hm1.getOrDefault(word1.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < word2.length(); i++) {
            hm2.put(word2.charAt(i), hm2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (hm1.size() != hm2.size())
            return false;

        // HashSet<Integer> hs1 = new HashSet<>(hm1.values());

        HashMap<Integer, Integer> hm3 = new HashMap<>();

        for (char c : hm1.keySet()) {
            hm3.put(hm1.get(c), hm3.getOrDefault(hm1.get(c), 0) + 1);
        }

        for (char c : hm2.keySet()) {
            int val = hm2.get(c);

            if (!hm1.containsKey(c))
                return false;
            else {
                if (!hm3.containsKey(val))
                    return false;
                else {
                    hm3.put(val, hm3.get(val) - 1);
                    if (hm3.get(val) == 0)
                        hm3.remove(val);
                }
            }

        }
        return true;
    }
}
