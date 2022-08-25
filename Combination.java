import java.util.Arrays;
import java.io.*;

/* Lab by Ryan S and Nik B.
Setting up program to list all possible
 * permutations of n integers
 */
public class Combination {
    static void combinationUtil(result, int data[], int start, int end, int index, int r){
        if (index == r){
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++){
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    public static void main {
    
        public static void Permutations(int n) {
            int[] result = new int[n];
            for(int i = 1; i <= n; i++) {
                result[i] = i;
            }
        }
    }
}