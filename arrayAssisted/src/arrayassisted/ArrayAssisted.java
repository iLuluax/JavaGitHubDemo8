package arrayassisted;

public class ArrayAssisted {

    public static void main(String[] args) {

//single-dimensional array
        int a[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) {
            System.out.println("Element "+i+" of array [A]: " + a[i]);
        }

//multidimensional array
        int[][] b = {
            {2, 4, 6, 8},
            {3, 6, 9}};

        System.out.println("\nLength of row 1 from array [B]: " + b[0].length);
    }
}
