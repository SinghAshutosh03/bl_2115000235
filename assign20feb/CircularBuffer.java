
public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int front;
    private int rear;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void insert(int value) {
        if (size == buffer.length) {
            front = (front + 1) % buffer.length; // Overwrite the oldest element
        } else {
            size++;
        }

        buffer[rear] = value;
        rear = (rear + 1) % buffer.length;
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % buffer.length]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();

        buffer.insert(4);
        buffer.display();
    }
}

