package Arrays;
public class productOfArray {

    public static void print(int spro[]) {
        for (int i : spro) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static int[] productExceptSelf(int[] nums) {
        int ppro[] = new int[nums.length];

        int p = 1;
        for (int i = 0; i < ppro.length - 1; i++) {
            p = p * nums[i];
            ppro[i + 1] = p;
        }

        print(ppro);
        p = 1;
        for (int i = ppro.length - 1; i > 0; i--) {
            p *= nums[i];

            ppro[i - 1] *= p;
        }

        ppro[0] = p;
        print(ppro);

        return ppro;
    }

    public static void main(String[] args) {

        // int a[] = { 1, 2, 3, 4 };
        int a[] = { -1, 1, 0, -3, 3 };

        productExceptSelf(a);

    }
}
