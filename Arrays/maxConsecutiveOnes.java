package Arrays;
public class maxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = -1;
        int zc = 0;
        int mc = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                zc++;
            i++;
            while (zc > k) {
                j++;
                if (nums[j] == 0)
                    zc--;
            }
            mc = Math.max(mc, i - j - 1);
        }
        return mc;
    }
}
