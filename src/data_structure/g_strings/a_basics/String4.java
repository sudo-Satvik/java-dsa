package data_structure.g_strings.a_basics;
// Interning and new
public class String4 {
    public static void main(String[] args) {
        // INTERNING
        String str = "Hello";
        String gtr = "Hello";
        // Above both reference variable points to same "Hello" in heap memory
        // This concept of saving space is known as Interning

        // We can use the 'new' keyword to avoid the Interning
        // new keyword create the "Hello" on different address in heap memory
        String x = new String("Hello");
    }
}
