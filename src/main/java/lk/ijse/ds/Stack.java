package lk.ijse.ds;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Stack {
    private int[] elementData;
    private int top;

    public Stack(int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data) {
        if (top == elementData.length - 1) {
            grow();
        }
        elementData[++top] = data;
    }

    public void grow() {
        int[] temp = elementData;
        elementData = new int[elementData.length * 2];
        for (int i = 0; i < top; i++) {
            elementData[i] = temp[i];
        }
    }


    public int peak() {//top
        return elementData[top];
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elementData[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
