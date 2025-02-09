package data_structure.g_strings.c_practice;
// Do this: PhysiCS -> pHYSIcs
public class B_ToggleChar {
    public static StringBuilder togglingCharacter(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            // for uppercaseCheck
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90)
                str.setCharAt(i, (char)(ascii+32));
            else if(ascii >= 97 && ascii <= 122)
                str.setCharAt(i, (char)(ascii-32));
            else
                continue;
        }
        return str;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("PhysiCS");
        System.out.println(togglingCharacter(str));
    }
}
