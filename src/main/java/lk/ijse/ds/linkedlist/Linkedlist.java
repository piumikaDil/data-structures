package lk.ijse.ds.linkedlist;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Linkedlist {



    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    public void insertAtBegining(int data){
        Node node = new Node(data);

        node.next=head;
        head = node;
    }

    public void insertAtEnding(int data) {
        if (head == null){
            insertAtBegining(data);
            return;
        }

        Node node = new Node(data);

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void traverse(){
        Node temp = head;

        System.out.print("[");
        while (temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }

    public void insertForSpesipicPotition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0){
            insertAtBegining(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position. List not long enough.");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBegining() {
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnding() {
        if (head == null){
            System.err.print("List is empty...");
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null){
            System.err.println("List is Empty");
            return;
        }
        if (position==0){
            deleteAtBegining();
            return;
        }
        Node temp = head;
        for (int i = 0; i < position-1; i++) {
           temp = temp.next;

        }
        temp.next = temp.next.next;
    }

    public int size() {
        int count = 0;

        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


}
