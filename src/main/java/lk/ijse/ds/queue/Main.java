package lk.ijse.ds.queue;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.printStack();

        queue.deQueue();
        queue.printStack();

        queue.deQueue();
        queue.printStack();

    }
}
