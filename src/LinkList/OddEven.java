package LinkList;

public class OddEven {
    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        ListNode list = createList(num);
        System.out.println("list  is :: ");
        print(list);

        System.out.println("result is :: ");
        print(oddEvenList(list));


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

    public static void print(ListNode listNode) {
        System.out.println();
        while (listNode != null) {
            System.out.print(" " + listNode.val + " -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        ListNode current = head, oddPoint = null, evenPoint = null;

        while(current != null) {

            int val = current.val;
            ListNode next = current.next;
            if(val % 2 == 0){
                if(evenPoint == null){
                    evenPoint = current;
                    current = current.next;
                } else {
                    evenPoint = evenPoint.next;
                    current = current.next;
                }
            } else {
                if(oddPoint == null){
                    oddPoint = current;
                    current = current.next;
                } else {
                    ListNode newNode =  new ListNode(current.val, oddPoint.next);
                    oddPoint.next = newNode;
                    oddPoint = oddPoint.next;
                    if(next != null){
                        current.val = next.val;
                    }
                    current.next = current.next;
                }
            }  

        }
//        ListNode next = oddPoint.next;
//
//        System.out.println("yes");
//        return head;
        System.out.println("odd :: ");
        print(oddPoint);
        System.out.println("even :: ");
        print(evenPoint);
        System.out.println("head");
        print(head);
        ListNode next = oddPoint.next;

        System.out.println("yes");
        return head;
    }
}
