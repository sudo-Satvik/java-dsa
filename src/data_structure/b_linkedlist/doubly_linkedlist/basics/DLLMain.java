package data_structure.b_linkedlist.doubly_linkedlist.basics;

public class DLLMain {
    public static void main(String[] args) {
        DLLConstructor myDLL = new DLLConstructor(7);

        myDLL.append(12);
        myDLL.append(13);
        myDLL.append(14);
        myDLL.append(15);
        myDLL.append(16);

//        myDLL.removeLast();
//        myDLL.removeLast();

        myDLL.prepend(1000);
        myDLL.removeFirst();
        myDLL.insertAt(3, 1023234);
        myDLL.remove(3);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.length();

        myDLL.printList();


    }
}
