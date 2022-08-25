import java.util.Arrays;
import java.io.*;

/* Lab by Ryan S and Nik B.*/
/*  result[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Starting and Ending indexes in result[]
    index  ---> Current index in data[]
    result.length ---> Size of a combination to be printed */
public class Combination {
    public static void combinationUtil(int[] result, int data[], int start, int end, int index){
        
        // Current combination is ready to be printed, print it
        if (index == result.length){
            for (int j=start; j<result.length; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= result.length-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=0; i<=end && end-i+1 >= result.length-index; i++){
            data[index] = result[i];
            combinationUtil(result, data, i+1, end, index+1);
        }
    }

    // The main function that prints all combinations of size result.length
    // in result[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int result[], int n)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[result.length];
 
        // Print all combination using temporary array 'data[]'
        combinationUtil(result, data, 0, n-1, 0);
    }
 
    /*Driver function to check for above function*/
    public static void main(String[] args) {
            int x = 3;
            int[] result = new int[x];
            for(int i = 1; i <= x; i++) {
                result[i] = i;
            }
            printCombination(result, result.length);
    }
}