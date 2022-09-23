import java.util.Objects;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/3
 * @Description
 */

/**
 * 执行结果：
 * 通过
 * 显示详情
 * 添加备注
 *
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 41.8 MB
 * , 在所有 Java 提交中击败了
 * 19.43%
 * 的用户
 * 通过测试用例：
 * 1568 / 1568
 */
public class L_2 {

    public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length_l1 = getLength(l1);
        int length_l2 = getLength(l2);
        ListNode head = new ListNode();
        if (length_l2 >= length_l1) {
            head.next = l2;
            x(l2, l1, 0, head);
        }
        else {
            head.next = l1;
            x(l1, l2, 0, head);
        }
        return head.next;
    }

    private void x(ListNode m_l, ListNode s_l, int cx, ListNode pre) {
        int s_v;
        if (m_l == null && cx == 1) {
            ListNode tail = new ListNode();
            tail.val = 0;
            pre.next = tail;
            return;
        }
        if (m_l == null && cx == 0) return;
        if (s_l == null) s_v = 0;
        else s_v = s_l.val;
        int l_v = m_l.val;
        int sum  = l_v + s_v + cx;
        m_l.val = sum % 10;
        x(m_l.next, ck(s_l), sum / 10, m_l);

    }

    private ListNode ck(ListNode cxac) {
        if (cxac == null) return null;
        return cxac.next;
    }

    private int getLength(ListNode note) {
        int l = 0;
        while (note != null) {
            l++;
            note = note.next;
        }
        return l;
    }

}
