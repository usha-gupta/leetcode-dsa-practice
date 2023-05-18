package LinkList;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();
        System.out.print("list 2 :::: ");
        print(list2);


        System.out.println("result ::: ");
        print(mergeTwoLists(list1, list2));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null, current = head;

        while(list1 != null || list2 != null){
            ListNode node = null;
            int num1 = list1.val;
            int num2 = list2.val;
            if(num1 <=num2){
                node = list1;
                list1 = list1.next;
            } else {
                node = list2;
                list2 = list2.next;
            }

            if(head == null){
                head = node;
                current = head;
            } else {
                current.next = node;
            }
            current = current.next;
        }
        return head;

    }


    public static void print(ListNode listNode){

        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }

    }
}
