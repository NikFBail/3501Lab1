import java.util.Arrays;
/* Lab by Ryan S and Nik B.
Setting up program to list all possible
 * permutations of n integers
 */
public class main {
    
    public static void Permutations(int n) {
        int[] result = new int[n];
        for(int i = 1; i <= n; i++) {
            result[i] = i;
        }
    }
}