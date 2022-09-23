/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/13
 * @Description
 */
public class L_55 {

    public boolean canJump(int[] nums) {
        int max_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max_index < i) return false;  // 如果最远都去不了这个点的位置，那就说明这个点都访问不到
            max_index = Math.max(max_index, i + nums[i]);  // 更新最远结点index
        }
        return true;
    }
}
