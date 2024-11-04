package data_structure.linkedlist.basics;
// This is where the code will run
public class LL1Constructor {
    public static void main(String[] args) {
        LL1Constructor2 linkedList = new LL1Constructor2(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.removeFromEnd();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printList();
    }
}
