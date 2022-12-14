// Lab by Ryan S and Nik B.

// Java program to print all permutations using
// Heap's algorithm
public class Combination {
    // Prints the array
    public void printArr(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
 
    // Generating permutation using Heap Algorithm
    public void heapPermutation(int a[], int size, int n) {
        // if size becomes 1 then prints the obtained permutation
        if (size == 1)
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
 
            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
 
            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
 
    // Driver code
    public static void main(String args[]) {
        long time1 = System.currentTimeMillis();
        Combination obj = new Combination();
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        obj.heapPermutation(arr, arr.length, arr.length);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}