public class MyLinkedList {


    public class Node {
        int val  = -1;
        Node next = null;
        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    int lenght = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if (index < 0 || index > lenght) {
            return - 1;
        }
        int i = 0;
        Node tmp = head;
        while (i < index) {
            tmp = tmp.next;
            i++;
        }
        if (tmp != null) {
            return tmp.val;
        } else {
            return -1;
        }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        if ( val < 0 || val > 1000) {
            return;
        }
        Node n = new Node(val);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
        this.lenght ++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {


        if (lenght==0) {
            addAtHead(val);
        } else {
            if ( val < 0 || val > 1000) {
                return;
            } else {
                Node tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = new Node(val);
                lenght++;
                return;
            }
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {


        if (index > lenght || index < 0) {
            return;
        } else  if (lenght == 0 && index == 0) {
            addAtHead(val);
            return;
        } else  {
            int i = 0;
            Node tmp = head;
            while (i < index-1) {
                tmp = tmp.next;
                i++;
            }
            Node n = new Node(val);
            n.next = tmp.next;
            tmp.next = n;
            lenght++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (lenght == 0) {
            return;
        } else if (index > lenght || index < 0) {
            return;
        } else {
            Node tmp = head;
                int i = 0;
                while (i < index-1) {
                    if (tmp.next != null) {
                        tmp = tmp.next;
                        i++;
                    }
                }
                if (tmp.next != null) {
                    tmp.next = tmp.next.next;
                    lenght--;
                }
        }
    }
}
