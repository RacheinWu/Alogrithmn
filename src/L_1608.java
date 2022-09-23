import java.util.Arrays;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/12
 * @Description
 */
public class L_1608 {


    public int specialArra1y(int[] nums) {
        //sort:
        Arrays.sort(nums);
        //极限情况：如果整个数组的最小都比 i要大 （i 是 题目描述的x，i取值范围在 0 ~ nums.length()）;
        if (nums[0] >= nums.length) return nums.length;
        for (int i = 0; i <= nums.length; i++) {
            int amount = 0;
            for (int num : nums) {
                //终止条件，防止算力浪费：如果 【数量】 > i 显然已经不符合好【恰好】
                if (amount > i) break;
                //如果当前元素 >= i, 数量 就++
                if (num >= i) amount ++;
            }
            //如果【内循环】出来后，【数量】恰好==i，说明 i 为特征值
            if (amount == i) return i;
        }
        return -1;
    }


    public int specialArray(int[] nums) {
        //优化
        Arrays.sort(nums);
        int n = nums.length;
        //极限情况：如果整个数组的最小都比 i要大 （i 是 题目描述的x，i取值范围在 0 ~ nums.length()）;
        if (nums[0] >= n) return n;
        //本题解的 特点是 从倒叙开始，为什么呢？ 因为可以直接算出来>=的个数是多少，具体可以对比一下上面的题解
        for (int i = 1; i < n; i++) {
            /**
             * [0，1，2，3，5，8，9]
             *                  ^
             *                  这里开始，只要碰到<的就停止
             */
            if (nums[n-i] >= i) return i;
        }
        return -1;
    }

}
