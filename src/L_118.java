import java.util.ArrayList;
import java.util.List;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/20
 * @Description
 */
public class L_118 {

    public List<List<Integer>> generate(int numRows) {
        int[] dp = new int[30];
        List<List<Integer>> res = new ArrayList();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l2.add(1);
        l2.add(1);
        res.add(l1);
        res.add(l2);
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < numRows; j++) {
                list.add(dp[j] + dp[j+1]);
            }
        }
        return null;
    }
}
