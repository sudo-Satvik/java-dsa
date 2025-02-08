package data_structure.g_strings.a_basics;
// substring(beginIndex, endIndex) and substring(beginIndex) function of Strings

public class String3 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str.substring(0, 6));


        String data = "GrandTheftAuto";

        for (int i = 2; i < 5; i++) {
            System.out.print(data.substring(i));
        }
    }
}
