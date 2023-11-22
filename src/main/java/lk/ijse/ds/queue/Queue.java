package lk.ijse.ds.queue;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Queue {
    private int[] elementData;
    private int front;
    private int back;

    public Queue(int initData) {
        elementData = new int[initData];
        front = -1;
        back = -1;
    }

    public void enQueue(int data) {
        if (isFull()){
            grow();
        }
        if (front == -1) {
            front = 0;
        }
        elementData[++back] = data;
    }

    public int deQueue() {
        if (isEmpty()){
            System.out.println("Empty!");
        }
        return elementData[front++];
    }

    public boolean isFull(){
        return back == elementData[elementData.length-1 ] || front > back;

    }

    private void grow() {
        int[] temp = elementData;
        elementData = new int[elementData.length * 2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public int peak() {
        return elementData[front];
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = front; i <= back; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public int size() {
        return (back - front) + 1;
    }

    public void clear() {
        back = -1;
        front = -1;
    }
}
