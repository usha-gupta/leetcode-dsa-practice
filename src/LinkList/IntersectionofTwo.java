package LinkList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwo {
    public static void main(String[] args) {
        int[] l1 = {1,2, 3};
        int[] l2 = {3,4};
        ListNode list1 = createList(l1);
        ListNode list2 = list1.next;

        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();

        System.out.print("list 2 :::: ");
        print(list2);
        System.out.println();


        System.out.println("result ::: ");
        print(getIntersectionNode(list1, list2));

    }
    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode createList(int[] values){
        ListNode head = null, current = null;
        for(int i =0; i < values.length; i++) {
            if(head == null){
                head = new ListNode(values[i]);
                current = head;
            } else {
                current.next = new ListNode(values[i]);
                current = current.next;
            }
        }
        return head;

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        while(headA != null || headB != null){
            if(headA == headB || set.contains(headA)){
                return headA;
            } else if(set.contains(headB)){
                return headB;
            }
            set.add(headA);
            set.add(headB);
            headA= headA != null ? headA.next : null;
            headB= headB != null ? headB.next : null;
        }
        return null;
    }
}
