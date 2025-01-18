package data_structure.f_hashset.a_basics;

import java.util.HashSet;

public class A_FirstHashSet {
    public static void main(String[] args) {
        HashSet<String> hS = new HashSet<>();
        // In terms of duplicate, the term case-sensitive isn't present!!
        hS.add("Satvik");
        hS.add("Mayank");
        hS.add("SatviK");
        hS.add("Satvik");
        System.out.println(hS);
        System.out.println("Size: " + hS.size());
        boolean isContained = hS.contains("Mayank");
        System.out.println(isContained);
//        hS.remove("SatviK");
        System.out.println("Size: " + hS.size());

//        Iterating
        for (String s : hS) {
            System.out.print(s + " => ");
        }
    }
}
