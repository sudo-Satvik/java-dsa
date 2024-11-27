package data_structure.linkedlist.singly_linkedlist.basics;
// This is where the code will run
public class LL1Constructor {
    public static void main(String[] args) {
        LL1Constructor2 linkedList = new LL1Constructor2(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.prepend(1);
        linkedList.removeFirst();
        linkedList.set(4, 12);
        linkedList.insert(2, 100);
        linkedList.remove(5);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printList();
        linkedList.reverse();
        System.out.println();
        linkedList.printList();

//        System.out.println("\n"+linkedList.removeLast().data);
//        System.out.println(linkedList.removeLast().data);
    }
}
