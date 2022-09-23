/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/23
 * @Description
 */
public class L_198 {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        //0 1背包问题：
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], dp[i-1]);
        }
        return dp[length-1];
    }
}
