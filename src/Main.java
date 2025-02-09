import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println((int)'a');
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length, rotCount = 0;
        int[][] ansMat = rotate(mat, n, n);
        while(rotCount < 4){
            if(Arrays.deepEquals(ansMat, target)){
                return true;
            }
            rotCount++;
        }
        return false;
    }
    public int[][] rotate(int[][] mat, int r, int c){
        transpose(mat, r, c);
        // Reversing row only
        for(int i = 0 ; i < r ; i++){
            reverse(mat, i);
        }
        return mat;
    }
    public void transpose(int[][] mat, int r, int c){
        for(int i = 0 ; i < c ; i++){
            for(int j = i ; j < r ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public void reverse(int[][] nums, int row){
        int left = 0, right = nums[row].length - 1;
        while (left < right) {
            int temp = nums[row][left];
            nums[row][left] = nums[row][right];
            nums[row][right] = temp;
            left++;
            right--;
        }
    }
}