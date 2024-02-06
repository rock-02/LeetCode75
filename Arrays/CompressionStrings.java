package Arrays;
public class CompressionStrings {
    public static int compress(char[] chars) {

        if (chars == null || chars.length == 0) {
            return 0; // Handle empty array case
        }
        int c = 1;
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length) {
                if (chars[i] == chars[i + 1]) {
                    c++;
                } else {
                    s.append(chars[i]);
                    if (c > 1) {
                        s.append(c);
                    }
                    c = 1;
                }
            } else {
                // Handle the last character separately
                s.append(chars[i]);
                if (c > 1) {
                    s.append(c);
                }

            }
        }

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();
    }

    public static void main(String[] args) {

        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c' };

        System.out.println(compress(chars));
    }
}
