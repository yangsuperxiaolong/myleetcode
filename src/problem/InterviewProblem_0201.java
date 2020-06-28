package problem;

import java.util.HashSet;

/**
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * <p>
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * <p>
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 * <p>
 * 如果不得使用临时缓冲区，该怎么解决？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-node-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class InterviewProblem_0201 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(2);
//        ListNode node6 = new ListNode(1);

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);

        node5.next = node6;
        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        head.next = node2;

        removeDuplicateNodes(head);

        return;
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            hashSet.add(temp.val);
            //判断下一个节点是否重复
            if (temp.next != null) {
                if (hashSet.contains(temp.next.val)) {
                    temp.next = temp.next.next;
                }else {
                    temp = temp.next;
                }
            }else {
                return head;
            }
        }
        return head;
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
