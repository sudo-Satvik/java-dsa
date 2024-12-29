package data_structure.b_linkedlist.doubly_linkedlist.basics;

public class DLLConstructor {

    class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public DLLConstructor(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println("Head: " + head.data);
    }
    public void getTail() {
        System.out.println("Tail: " + tail.data);
    }
    public void length() {
        System.out.println("Length: " + length);
    }

    // Operations on last elements
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (length == 0) return;
        else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
    }

    // Operations on first element
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public void removeFirst() {
        if (length == 0) return;
        else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
    }
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.data = value;
            return true;
        }
        return false;
    }
    public boolean insertAt(int index, int value) {
        if (index < 0 || index > length) return false;
        else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
          Node newNode = new Node(value);
          Node before = get(index - 1);
          Node after = before.next;
          newNode.prev = before;
          newNode.next = after;
          before.next = newNode;
          after.prev = newNode;
          length++;
        }
        return true;
    }
    public void remove(int index) {
        if (index < 0 || index > length) return;
        else if (index == 0) removeFirst();
        else if (index == length - 1) removeLast();
        else {
            Node temp = get(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
        }
        length--;
    }
}
