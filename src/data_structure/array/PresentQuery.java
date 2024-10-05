package data_structure.array;

import java.util.Scanner;

public class PresentQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" element: ");
            arr[i] = sc.nextInt();
        }
        int[] freqArr = makeFreqArr(arr);
        System.out.println("Enter the number of queries: ");
        int query = sc.nextInt();
        while (query > 0){
            System.out.println("Enter the number which needs to be searched: ");
            int x = sc.nextInt();
            if (freqArr[x] > 0) System.out.println("YES");
            else System.out.println("NO");
            query--;
        }
    }
    public static int[] makeFreqArr(int[] arr){
        int[] freq = new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
}
