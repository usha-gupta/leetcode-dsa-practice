package LinkList;

public class AddTwoNumbers {
    public static void main(String[] args) {

//        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

//        System.out.println("resulrt ::"+removeNthFromEnd);

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        System.out.print("list 1  ::: ");
        print(l1);

        System.out.println();

        System.out.print("list 1  ::: ");
        print(l2);

        System.out.println();

        System.out.print("result ::: ");
        addTwoNumbers2(l1, l2);
//        print(addTwoNumbers2(l1, l2));
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {


        ListNode prevL1 = null, prevL2 = null;
        while(l1 != null || l2 != null){
            if(l1 != null){
                ListNode nextL1 = l1.next;
                l1.next = prevL1;
                prevL1 = l1;
                l1 = nextL1;
            }
            if(l2 != null) {
                ListNode nextL2 = l2.next;
                l2.next = prevL2;
                prevL2 = l2;
                l2 = nextL2;
            }

        }
        System.out.println("list 1 :: ");
        print(prevL1);
        System.out.println("list 1 :: ");
        print(prevL2);
        int carry = 0;
        ListNode resultHead = null, current = null;
        while(prevL1 != null || prevL2 != null){
            int val1 = prevL1 != null ? prevL1.val : 0;
            int val2 = prevL2 != null ? prevL2.val : 0;
            int sum = val1 + val2 + carry;
            System.out.println("sum :: "+sum);
            carry = 0;
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }
            ListNode node = new ListNode(sum);
            if(current == null){
                current = node;
            } else {
                node.next = current;
                current = node;
            }
            prevL1 = prevL1 != null ? prevL1.next : null;
            prevL2 = prevL2 != null ? prevL2.next : null;
        }
        if(carry > 0){
            ListNode node = new ListNode(carry);;
            node.next = current;
            current = node;
        }
        System.out.println("result  :: ");
        print(current);
        return current;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;
        while(l1 != null || l2 != null){

            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int sum = num1 + num2 + carry;
            System.out.println("sum ::: "+sum);
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }
            System.out.println(":::: sum ::: "+sum);
            System.out.println(":::: carry ::: "+carry);
            if(current == null) {
                current = new ListNode(sum);
                result = current;
            } else {
                current.next = new ListNode(sum);
                current = current.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result.next;
    }

    public static void print(ListNode listNode){

        System.out.println();
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head, prevNode = null;
        int counter = 0;
        while (currentNode != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }
        currentNode = head;
        prevNode = null;

        int targerIndex = counter - n;
        counter = 0;
        while (currentNode != null) {
            if (counter == targerIndex) {
                ListNode next = currentNode.next;
                if(prevNode == null){
                    head = next;
                } else{
                    prevNode.next = next;
                }
                currentNode = next;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }
        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode currentNode = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = l1.val+l2.val+carry;
            int value = sum  % 10;
            carry = sum / 10;
            if(result == null){
                result = new ListNode(value);
                currentNode = result;
            } else {
                currentNode.next = new ListNode(value);
                currentNode = currentNode.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }



        return result;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }