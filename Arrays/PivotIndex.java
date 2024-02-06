package Arrays;
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int lsum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum -= nums[j];
            if (lsum == sum)
                return j;
            lsum += nums[j];
        }
        return -1;
    }
}
