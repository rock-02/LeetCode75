package Arrays;
public class maxOnes {

    public int longestOnes(int[] nums, int k) {

        int c = 0;
        int i = 0;
        int j = 0;
        while (i < k) {
            if (nums[i] == 1)
                c++;
        }

        while (i < nums.length) {
     
        }

        return c;
    }

}
