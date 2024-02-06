import java.util.*;

public class MergeAlternate {

    public static String mergeAlternativelyString(String word1, String word2) {

        String ans = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            ans = ans + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }

        while (i < word1.length()) {
            ans = ans + word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            ans = ans + word2.charAt(j);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Hellp WOrld");
        }

        String ans = mergeAlternativelyString("abcd", "pqr");
        System.out.println(ans);
        sc.close();
    }
}
