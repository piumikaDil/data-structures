package lk.ijse.ds.linkedlist;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Main {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnding(1000);

        ll.insertAtBegining(10);
        ll.insertAtBegining(20);
        ll.insertAtBegining(80);
        ll.insertAtBegining(90);

        ll.insertAtEnding(30);

        ll.insertForSpesipicPotition(500,2);
        ll.traverse();

        ll.deleteAtBegining();
        ll.traverse();

        ll.deleteAtEnding();
        ll.traverse();

        ll.deleteAtPosition(1);
        ll.traverse();

        System.out.println("size : "+ll.size());


    }
}
