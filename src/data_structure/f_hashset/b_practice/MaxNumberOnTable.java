package data_structure.f_hashset.b_practice;
import java.util.HashSet;

public class MaxNumberOnTable {
    public static int maxNumbersOnTable(int[] bag) {
        HashSet<Integer> table = new HashSet<>();
        int max = -1;
        for (int i = 0; i < bag.length; i++) {
            int num = bag[i];
            if (table.contains(num)){
                table.remove(num);
            } else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 3, 4, 5};
        System.out.println(maxNumbersOnTable(arr));
    }
}
