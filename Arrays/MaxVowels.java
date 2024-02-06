package Arrays;
public class MaxVowels {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitivity
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {

        // while (j < s.length()) {
        // int c = 0;
        // for (int j2 = i; j2 < j; j2++) {
        // if (isVowel(s.charAt(j2)))
        // c++;
        // }
        // i++;
        // j++;
        // mc = Math.max(mc, c);
        // }

        int vc = 0;
        int i = 0;
        int j = 0;
        int mc = 0;
        while (i < k) {
            if (isVowel(s.charAt(i)))
                vc++;

            System.out.println(vc + " i " + i);
            i++;
        }
        mc = vc;
        while (i < s.length()) {
            if (isVowel(s.charAt(i)))
                vc++;
            if (isVowel(s.charAt(j)))
                vc--;
            System.out.println("Mc - > " + mc + " , " + "VC -> " + " " + vc);
            mc = Math.max(mc, vc);

            i++;
            j++;
        }

        System.out.println(mc);
        return mc;

    }

    public static void main(String[] args) {

        System.out.println(maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));
    }
}
