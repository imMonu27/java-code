import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - n - 1;  // index of last non-vacant cell in X
        int j = n - 1;      // index of last element in Y
        int k = m - 1;      // index of last cell in merged array
        
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in Y, place them in X
        while (j >= 0) {
            X[k] = Y[j];
            j--;
            k--;
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println(Arrays.toString(X));
    }
}
