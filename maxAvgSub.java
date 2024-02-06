public class maxAvgSub {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        double sum = 0;

        int j = 0;
        while (i < k) {
            sum += nums[i];
        }
        double avg = sum / k;

        while (i < nums.length) {
            sum -= nums[j];
            sum += nums[i];
            avg = Math.max(avg, sum / k);

            j++;
            i++;
        }

        return avg;
    }
}
