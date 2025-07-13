package arrays;

public class ArrayRotation {
    
    public static void rotateLeft(int[] arr, int n) {
        n = n % arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    
    public static void rotateRight(int[] arr, int n) {
        n = n % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] A = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        
        System.out.println("Original array:");
        printArray(A);
        
        int[] leftRotated = A.clone();
        rotateLeft(leftRotated, 3);
        System.out.println("Left rotated by 3:");
        printArray(leftRotated);
        
        int[] rightRotated = A.clone();
        rotateRight(rightRotated, 3);
        System.out.println("Right rotated by 3:");
        printArray(rightRotated);
    }
}
