package uom.cs;

public class LinkedQueueOfStrings {
    private LinkedQueueOfStrings.Node first,last;
    int n;

    private class Node {
        String item;
        LinkedQueueOfStrings.Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    }

    public String dequeue() {


        String item = first.item;
        first = first.next;
        return item;
    }

    public int size() {
        return n;
    }

    public static void main(String[] args) {

    }
}
