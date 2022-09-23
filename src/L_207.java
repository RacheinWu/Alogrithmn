import java.util.*;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/23
 * @Description
 */
public class L_207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
       //Map 是记录每个节点有多少个入点
        Map<Integer, Integer> inDegree = new HashMap<>();
        //先将每一个点进行初始化，默认每一个点入度都为1:
        for (int i = 0; i < numCourses; i++) {
            inDegree.put(i, 0);
        }
        //邻接表:
        Map<Integer, List<Integer>> adj = new HashMap<>();

        //初始化入度和邻接表：
        for (int[] relation : prerequisites) {
            int cur = relation[1];
            int next = relation[0];
            if (!adj.containsKey(cur)) {
                adj.put(cur, new ArrayList<>());
            }
            adj.get(cur).add(next);
            inDegree.put(next, inDegree.get(next) + 1);
        }

        //将入度为0的结点放入队列：
        Queue<Integer> queue = new LinkedList<>();
        for (Integer key : inDegree.keySet()) {
            if (inDegree.get(key) == 0) {
                queue.offer(key);
            }
        }
        //从入度=0的结点中 取出一个：
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (!adj.containsKey(cur)) continue;
            //BFS:
            List<Integer> adj_points = adj.get(cur);
            for (Integer p : adj_points) {
                inDegree.put(p, inDegree.get(p) - 1);
                if (inDegree.get(p) == 0) {
                    queue.offer(p);
                }
            }
        }

        //遍历入度表，如果入度！= 0 证明有回路：
        for (int key : inDegree.keySet()) {
            if (inDegree.get(key) != 0) return false;
        }
        return true;
    }
}
