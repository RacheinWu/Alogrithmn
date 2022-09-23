/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/13
 * @Description
 */
public class L_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int cur_gas = 0;
        int total_gas = 0;
        int start_index = 0;
        for (int i = 0; i < length; i++) {
            cur_gas += gas[i] - cost[i];
            total_gas += gas[i] - cost[i];
            if (cur_gas < 0) {
                start_index = i + 1;
                cur_gas = 0;
            }
        }
        if (total_gas < 0) return -1;
        return start_index;
    }
}
