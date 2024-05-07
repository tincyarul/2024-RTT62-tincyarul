import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Inserting an element at a specific index
        array = insertElement(array, 2, 10);
        System.out.println("Array after inserting 10 at index 2: " + Arrays.toString(array));
        array = insertElement(array, 4, 15);
        System.out.println("Array after inserting 15 at index 4: " + Arrays.toString(array));


        // Deleting an element at a specific index
        array = deleteElement(array, 3);
        System.out.println("Array after deleting element at index 3: " + Arrays.toString(array));
        array = deleteElement(array, 5);
        System.out.println("Array after deleting element at index 3: " + Arrays.toString(array));
    }

    // Method to insert an element into an array at a specific index
    public static int[] insertElement(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

    // Method to delete an element from an array at a specific index
    public static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }
}


