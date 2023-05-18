package LinkList;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
//        ListNode head = new ListNode(4, new ListNode(2, new ListNode(4, new ListNode(3))));
//        print(head);

//        System.out.println("result :: " +sortList(head));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(5);
        queue.add(3);
        queue.add(8);
        queue.add(1);
        queue.add(2);
        queue.add(2);

        // Print the elements of the queue
        System.out.println("Elements in the queue: " + queue);
        queue.poll();
        System.out.println("Elements in the queue: " + queue);

        queue.poll();
        System.out.println("Elements in the queue: " + queue);


        Map<Integer, ListNode> map = new HashMap();

        List<Integer> list = new ArrayList();



    }

    public static void print(ListNode listNode) {
        System.out.println();
        while (listNode != null) {
            System.out.print(" " + listNode.val + " -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            int val1 = current.val;
            while(next != null){
                int val2 = next.val;
                if (val1 > next.val) {
                    int temp = val1;
                    val1 = val2;
                    next.val = temp;
                }
                current.val = val1;
                next = next.next;
            }
            current = current.next;
        }
        return head;
    }
}
