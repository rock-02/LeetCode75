import java.util.Arrays;

public class Twopointers {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;
        int c = 0;
        while (l < r) {
            if (nums[l] + nums[r] == k) {
                c++;
                l++;
                r--;
            } else if (nums[l] + nums[r] < k) {
                l++;
            } else if (nums[l] + nums[r] > k) {
                r--;
            }

        }
        return c;
    }
}
