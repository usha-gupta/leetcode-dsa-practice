package LinkList;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));


        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();

        System.out.print("result :::: ");
       print(middleNode(list1));
    }

    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        int count =0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }

        int mid = Math.abs(count / 2);
        System.out.println("mide :: "+mid);
        int i =0;
        current = head;
        while(i < mid){
            if(i == mid){
                head = current;
            }
            current = current.next;
            i++;
        }
        return head;
    }
}
