package data_structure.linkedlist.basics;
//02:03:38
public class D_Implementation{
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }
    private static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtStart(String data){
            Node temp = new Node(data);
            if (head == null) insertAtEnd(data);                  // head = temp;
            else temp.next = head;
            head = temp;
        }
        void insertAtEnd(String data){
            Node temp = new Node(data);
            // Empty list
            if (head == null) head = temp;
            // Non-Empty List
            else tail.next = temp;
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println(" ");
        }
        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args){
        /*
        * We know that we can implement array like this:
        * int[] arr = new int[4];
        * But in case of linkedList, we can't do!
        * So we're expected to perform like this:
        * LinkedList ll = new LinkedList();
        * ll.insertAtEnd(13);
        * ll.display() -> to output the LL
        * */
        LinkedList ll = new LinkedList();
        ll.insertAtEnd("Satvik");
        ll.display();
        ll.insertAtEnd("Satan");
        ll.display();
        ll.insertAtEnd("Eren");
        ll.display();
        ll.insertAtEnd("Itachi");
        ll.display();
        ll.insertAtStart("Mayank");
        ll.display();
        System.out.println("Size is: "+ll.size());
    }
}