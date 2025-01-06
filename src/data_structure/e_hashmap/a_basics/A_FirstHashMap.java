package data_structure.e_hashmap.a_basics;

import java.util.HashMap;

// Consider I have a stationery shop and I want to enter the quantity (frequency) of the products
public class A_FirstHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> stationeryShop = new HashMap<>();
        stationeryShop.put("Scissors", 100);
        stationeryShop.put("Pens", 30);
        stationeryShop.put("Rubbers", 55);
        stationeryShop.put("Metric Scales", 120);
        stationeryShop.put("Stencils", 42);
        stationeryShop.put("Sharpners", 95);

        System.out.println("I have these in stocks: ");
        for (String s : stationeryShop.keySet()) {
            System.out.print(s +", ");
        }
    }
}
