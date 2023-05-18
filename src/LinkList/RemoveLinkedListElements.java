package LinkList;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();


//        System.out.println("result ::: "+removeElements(list1, 6));
        System.out.print("result :::: ");
        print(removeElements(list1, 6));
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode prev = null, current = head;
        while(current != null){
            if(val == current.val){
                if(prev != null){
                    prev.next = current.next;
                } else {
                    prev = current;
                }
            }
            current = current.next;
        }
        return prev == null ? prev : head;
    }

    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }
}
