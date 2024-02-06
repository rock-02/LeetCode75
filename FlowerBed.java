public class FlowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        int fone = -1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0)
                c++;
            else {
                fone = i;
                break;
            }
        }

        int max = c / 2;
        c = 0;
        int lone = flowerbed.length - 1;
        for (int i = flowerbed.length - 1; i >= 0; i--) {
            if (flowerbed[i] == 0)
                c++;
            else {
                lone = i;
                break;

            }

        }

        max += c / 2;
        c = 0;
        System.out.println(fone + " " + lone);

        for (int i = fone + 1; i <= lone; i++) {
            if (flowerbed[i] == 0)
                c++;
            else {
                // System.out.println(c + "");
                max += (c - 1) / 2;
                c = 0;
            }
        }
        if (fone == -1) {
            if (c % 2 == 0)
                return c / 2 >= n;
            else
                return (c + 1) / 2 >= n;
        }
        System.out.println(max);
        return max >= n;
    }

    public static void main(String[] args) {

        int a[] = { 1, 0, 0, 0, 1 };

        canPlaceFlowers(a, 1);
    }
}
