package lk.ijse.ds.queue;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

//        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.printQueue();

        System.out.println("size : "+queue.size());
        System.out.println("peak : "+queue.peak());
        queue.deQueue();
        queue.printQueue();
        System.out.println("peak : "+queue.peak());
        System.out.println("size : "+queue.size());

        System.out.println(queue.deQueue());
        queue.printQueue();
        queue.clear();
        System.out.println("size : "+queue.size());

    }
}
