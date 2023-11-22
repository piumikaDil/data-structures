package lk.ijse.ds.queue;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Queue {
    private int[] elementData;
    private int front;
    private  int back;

    public Queue(int initData) {
        elementData = new int[initData];
        front = -1;
        back = -1;
    }

    public void enQueue(int data) {
        if (front == -1){
            front=0;
        }
        elementData[++back] = data;
    }

    public int deQueue() {
        return elementData[front++];
    }

    public void printStack() {
        System.out.print("[");
        for (int i = front; i <= back; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
