public class Queuey {

    Node front, rear;

    private static class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null) { // kön är tom
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        printQueue();
    }

    public String dequeue() {
        String ret;
        ret = front.value;
        front = front.next;
        printQueue();
        return ret;
    }

    public void printQueue() {
        System.out.print("Queue: ");
        Node n = front;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println("");
    }




    void circularArray() {
                       // 0     1     2      (length 3)
        String[] circ = { null, null, null };

        circ[0] = "foo"; // { "foo", null, null }
        circ[2] = "bar"; // { "foo", null, "bar" }

        // Om vi vill stöda cirkulär lagring:
        circ[2 % circ.length] = "bar";
        // 2 % 3 = 2, alltså { "foo", null, "bar" }
        circ[3] = "baz"; // IndexOutOfBounds ERROR
        circ[3 % circ.length] = "baz";
        // 3 % 3 = 0, alltså { "baz", null, "bar" }
        circ[4 % circ.length] = "boo";
        // 4 % 3 = 1, alltså { "baz", "boo", "bar" }

    }

}
