package problem;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Problem_21 {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l12.next = l13;
        l11.next = l12;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        l21.next = l22;

        ListNode l1 = l11;

        ListNode l2 = l21;

        ListNode result = mergeTwoLists(l1,l2);
        return;

    }

    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(Integer.MAX_VALUE);
        ListNode temp = result;
        while(l1!=null && l2!=null){
            if(l2.val<l1.val){
                temp.next = new ListNode(l2.val);
                temp = temp.next;

                l2 = l2.next;
            }else {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }

        }
        if(l1==null && l2!=null){
            temp.next = l2;
        }
        if(l1!=null && l2==null){
            temp.next = l1;
        }
        return result.next;

    }
}

