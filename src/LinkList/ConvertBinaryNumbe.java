package LinkList;

public class ConvertBinaryNumbe {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(0, new ListNode(1)));

        System.out.println("result :: "+getDecimalValue(list1));

    }
    public static int getDecimalValue(ListNode head) {

        ListNode current = head;
        int sum =0;
        while(current != null){
            System.out.println("value :: "+current.val);

            sum = (sum*2)+current.val;
            System.out.println("sum :: "+sum);
            current = current.next;
        }
        return sum;

    }
}
