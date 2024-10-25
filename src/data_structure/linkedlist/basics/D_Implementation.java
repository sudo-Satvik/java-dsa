package data_structure.linkedlist.basics;
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
        // optimising length
        int size = 0;
        void insertAtStart(String data){
            Node temp = new Node(data);
            if (head == null) insertAtEnd(data);                  // head = temp;
            else temp.next = head;
            head = temp;
            size++;
        }
        void insertAtEnd(String data){
            Node temp = new Node(data);
            // Empty list
            if (head == null) head = temp;
            // Non-Empty List
            else tail.next = temp;
            tail = temp;
            size++;
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
        // Inserting element anywhere!
        void insertAtIndex(int index, String value){
            // Node of the value which is going to be created
            Node t = new Node(value);
            Node temp = head;
            // Tail update fix
            if (index == size){
                insertAtEnd(value);
                return;
            }
            if (index == 0){
                insertAtStart(value);
            }
            /*
            * Agar humko index 3 me add krna h iss diye hue LL me
            * 1 -> 2 -> 3 -> 4 -> 5
            * 0    1    2    3    4
            * Toh humko index 0 se lekar 2 tk chalna pdega
            * aur phr pehle insert krne wali value k next ko assign krna hoga index k wale pr
            * then uske phle wale index ko data ke saath
            * */
            for (int i = 1; i < index; i++) {
                // Simple Traversal
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
//        int size(){
//            Node temp = head;
//            int count = 0;
//            while (temp != null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
//        O(n)
        String getElement(int index){
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int index){
            if (index == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = temp.next.next;
            size--;
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
        ll.insertAtIndex(5, "GTA");
        ll.display();
        ll.deleteAt(5); // last index
        ll.display();
        // Tail is not updated here
        System.out.println(ll.tail.data);
        System.out.println(ll.getElement(0));
        System.out.println("Size is: "+ll.size);
    }
}