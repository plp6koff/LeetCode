public class MyLinkedListTest {

    public static void main(String[] args) {

//["MyLinkedList","addAtHead","addAtHead","deleteAtIndex","addAtIndex","addAtHead","addAtHead","addAtHead","get","addAtTail","addAtIndex","addAtHead"]
//[[],[5],[2],[1],[1,9],[4],[9],[8],[3],[1],[3,6],[3]]
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(5);
        print(linkedList);
        linkedList.addAtHead(2);
        print(linkedList);
        linkedList.deleteAtIndex(1);
        print(linkedList);
        linkedList.addAtIndex(1, 9);
        print(linkedList);
        linkedList.addAtHead(4);
        print(linkedList);
        linkedList.addAtHead(9);
        print(linkedList);
        linkedList.addAtHead(8);
        print(linkedList);
        System.out.println(linkedList.get(3));
        linkedList.addAtTail(1);
        print(linkedList);
        linkedList.addAtIndex(3, 6);
        print(linkedList);
        linkedList.addAtHead(3);
        print(linkedList);
//        print(linkedList);
//        linkedList.addAtHead(2);
//        print(linkedList);
//        linkedList.addAtHead(1);
//        print(linkedList);
//        linkedList.addAtIndex(3, 0);
//        print(linkedList);

//        linkedList.addAtTail(3);
//        print(linkedList);
//        linkedList.addAtIndex(1, 2);
//        print(linkedList);
//        System.out.println(linkedList.get(1));
//        linkedList.deleteAtIndex(1);
//        print(linkedList);
//        System.out.println(linkedList.get(1));
//        linkedList.addAtIndex(0, 1);
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        print(linkedList);


//        linkedList.addAtHead(1);
//        print(linkedList);
//        linkedList.addAtIndex(1, 2);
//        print(linkedList);
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(2));
    }

    public static void print(MyLinkedList l){
        MyLinkedList.Node n = l.head;

        while(true){
            System.out.print(n.val + "->");
            if (n.next == null) {
                break;
            }
            n = n.next;
        }
        System.out.println();
    }

}
