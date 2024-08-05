import java.util.Arrays;
public class Problem1508 {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int k = (n * (n + 1)) / 2;
        long[] output = new long[k];
        int p = 0;
        int q = 0;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[q];
            output[i] = sum;
            q++;
            if (q == n) {

                p++;
                q = p;
                sum = 0;
            }

        }
        Arrays.sort(output);
        int mod =(int)(Math.pow(10, 9)+7);
        long result = 0;
        for (int i = left-1; i < right; i++) {
            result = (result+output[i])%mod;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Problem1508 p = new Problem1508();
        int[] nums = new int[1000];
        Arrays.fill(nums, 100);  // Filling the array with 100s
        System.out.println(p.rangeSum(nums, nums.length, 1, 500500)); // Expected output: 716699888
    }
}
