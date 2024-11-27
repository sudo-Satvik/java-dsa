package data_structure.linkedlist.doubly_linkedlist.basics;

public class DLLMain {
    public static void main(String[] args) {
        DLLConstructor myDLL = new DLLConstructor(7);

        myDLL.append(12);
        myDLL.append(13);
        myDLL.append(14);
        myDLL.append(15);
        myDLL.append(16);

        myDLL.removeLast();
        myDLL.removeLast();

        myDLL.getHead();
        myDLL.getTail();
        myDLL.length();

        myDLL.printList();


    }
}
