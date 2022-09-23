import java.util.Arrays;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/13
 * @Description
 */
public class L_135 {

    public int candy(int[] ratings) {
        int length = ratings.length;
        if (length == 1) return 1;
        int[] left = new int[length];
        int[] right = new int[length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < length; i++) {
            if (ratings[i] > ratings[i-1]) {
                left[i] = left[i-1] + 1;
            }
            if (ratings[length - i - 1] > ratings[length - i]) {
                right[length - i - i] = right[length - i +1] + 1;
            }
        }
        //取最大值作为基准：
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Math.max(left[i], right[i]);
        }
        return sum;
    }

}
