package lk.ijse.ds;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Stack {
    private final int[] elementData;
    private int top;

    public Stack(int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data) {
        elementData[++top] = data;
    }

    public int peak() {//top
        return elementData[top];
    }

    public int pop(){
        return  elementData[top--];
    }

    public void printStack(){
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i]+", ");
        }
        System.out.println("\b\b]");
    }
}
