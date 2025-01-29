package algorithms.f_searching.expert;
// Maximal Minima
public class RaceTrack {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 9};
        int k = 2;
        Solution sol = new Solution();
        System.out.println(sol.raceTrack(a, k));
    }
}

class Solution{
    public int raceTrack(int[] arr, int k) {
        int s = 0, e = (int)1e9;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (isPossible(arr, m, k)){ // can k kids be placed such that no 2 kids have distance lesser than mid
                ans = m;
                s = m + 1;
            } else{
                e = m - 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] a, int dist, int stud) {
        int kidPlaced = 1;
        int lastKid = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] - lastKid >= dist){
                kidPlaced++;
                lastKid = a[i];
            }
        }
        return kidPlaced >= stud;
    }
}
