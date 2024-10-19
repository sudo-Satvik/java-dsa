public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] mat = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(main.maximumPopulation(mat));
    }
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            arr[birth-1950]++;
            arr[death-1950]--;
        }

        int max = arr[0];
        int year = 1950;
        for(int i = 1 ; i < 101; i++) {
            arr[i] += arr[i-1];
            if(arr[i] > max) {
                max = arr[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}