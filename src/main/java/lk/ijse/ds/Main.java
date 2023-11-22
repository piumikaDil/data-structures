package lk.ijse.ds;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peak = stack.peak();
        System.out.println("peak : "+peak);

        stack.push(40);
        int peak1 = stack.peak();
        System.out.println("peak : "+peak1);

        stack.push(50);
        int peak2 = stack.peak();
        System.out.println("peak : "+peak2);

        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());

        stack.printStack();

        stack.push(100);
        stack.printStack();
    }
}
