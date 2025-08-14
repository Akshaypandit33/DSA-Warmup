class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else  {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addNode(int data, int index) {
        Node newNode = new Node(data);
        Node temp = head;
        int count =1;
        while(count != index) {
            temp = temp.next;
            count++;
        }
        newNode.next =temp.next;
        temp.next = newNode;
        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public String toString()
    {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}

class Driver{
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(13);
        linkedList.addNode(14);
        System.out.println(linkedList);
        linkedList.addNode(15,0);
        System.out.println(linkedList);


    }
}


