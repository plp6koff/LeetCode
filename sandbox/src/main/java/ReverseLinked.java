

public class ReverseLinked {


    public static void main(String[] args) {

        //1->2->3->4->5->NULL
        ListNode head = new ListNode(1);

        ListNode n1 = new ListNode(2);
        head.next = n1;
        ListNode n2 = new ListNode(3);
        n1.next = n2;
        ListNode n3 = new ListNode(4);
        n2.next = n3;
        ListNode n4 = new ListNode(5);
        n3.next = n4;


        ListNode tmp = reverseList(head);
        while(tmp.next != null) {
            System.out.print(tmp.val + "->");
            tmp = tmp.next;
        }
        if (tmp.next == null) {
            System.out.print(tmp.val + "->NULL");
        }

    }

    public static class ListNode {

         int val;
         ListNode next;
         ListNode(int x) {
           val = x;
         }
    }


    public static ListNode reverseList(ListNode head) {

        ListNode newHead  = null;
        ListNode tmp = head;
        while(tmp != null) {
            ListNode currNode = rv(head);
            if (newHead == null) {
                newHead = currNode;
            } else {
                newHead.next = currNode;
            }
            tmp = tmp.next;
        }
        return newHead;
    }

    public static ListNode rv(ListNode head) {

        if (head.next == null) {
            return head;
        }

        ListNode nextTmp = rv(head.next);
        ListNode tmp  = nextTmp;
        while (true) {
            if(tmp.next == null) {
                break;
            } else {
                tmp = tmp.next;
            }
        }
        head.next = null;
        tmp.next = head;
        return nextTmp;
    }

}
