public class MergeSortedLists {

    public static void main(String[] args) {

        ListNode ln11 = null;//new ListNode(1);
        ListNode ln12 = new ListNode(2);
        ListNode ln13 = new ListNode(4);
        //ln11.next = ln12;
        //ln12.next = ln13; ln13.next = null;
        System.out.print("Input 1: ");
        printNode(ln11);
        System.out.println("");
        ListNode ln21 = new ListNode(0);
        ListNode ln22 = new ListNode(3);
        ListNode ln23 = new ListNode(4);
        //ln21.next = ln22; ln22.next = ln23; ln23.next = null;
        System.out.print("Input 2: ");
        printNode(ln21);
        System.out.println("");
        ListNode result = mergeTwoLists(ln11, ln21);
        System.out.println("Result: ");
        printNode(result);

    }

    public static void printNode(ListNode node){
        if (node == null) {
            return;
        }
         System.out.print(node.val + "->");
         printNode(node.next);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result;

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null)  {
            return l2;
        } else  if (l2 == null) {
            return l1;
        }

        final int l1Val = l1.val;
        final int l2Val = l2.val;

        if (l1Val < l2Val) {

            ListNode tmp1 = new ListNode(l1Val);
            tmp1.next = mergeTwoLists(l1.next, l2);;
            result = tmp1;


        } else if (l1Val > l2Val) {

            ListNode tmp2 = new ListNode(l2Val); ;
            tmp2.next = mergeTwoLists(l1, l2.next);;
            result = tmp2;


        } else {

            ListNode tmp2 = new ListNode(l2Val);
            ListNode tmp1 = new ListNode(l1Val);
            tmp2.next = mergeTwoLists(l1.next , l2.next);;
            tmp1.next = tmp2;
            result = tmp1;
        }
        return result;
    }

    public static  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }
}
