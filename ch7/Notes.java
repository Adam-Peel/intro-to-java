

public class Notes {

  public static void main (String[] args) {

    // Different methods for declaring an array and initialising the values.

    double[] myDoubleArray = new double[5];
    myDoubleArray[0] = 1.0;
    myDoubleArray[1] = 2.0;
    myDoubleArray[2] = 3.0;
    myDoubleArray[3] = 4.0;
    myDoubleArray[4] = 5.0;

    int[] myIntArray = {3, 1, 4, 2, 5};

    // Use of 'for each' in Java is as follows:

    for (int element : myIntArray) {
      System.out.println(element);
    }
  selectionSort(myIntArray);
  }

   public static void selectionSort(int[] unsortedArray) {

    // Outer loop to go through each element
    for (int sortCount = 0; sortCount < unsortedArray.length - 1; sortCount++) {
        int minIndex = sortCount;

        // Inner loop to find the smallest element in the unsorted portion of the array
        for (int i = sortCount + 1; i < unsortedArray.length; i++) {
            if (unsortedArray[i] < unsortedArray[minIndex]) {
                minIndex = i;  // update the minIndex if a smaller element is found
            }
        }

        // If minIndex changed, swap the elements
        if (minIndex != sortCount) {
            int temp = unsortedArray[sortCount];
            unsortedArray[sortCount] = unsortedArray[minIndex];
            unsortedArray[minIndex] = temp;
        }
    }

    // Print the sorted array
    for (int e : unsortedArray) {
        System.out.println(e);
    }
}

// End of class
}