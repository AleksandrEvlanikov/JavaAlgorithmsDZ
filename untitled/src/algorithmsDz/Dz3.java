package algorithmsDz;

public class Dz3 {
    public Node head;
    public void List(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int num) {
            this.data = num;

        }
    }

    public void add(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void revers(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
