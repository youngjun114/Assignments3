// Youngjun Woo
// CS 240
// Assignment3
// May 18, 2018

public class BubbleSortIterative
    {
        // SELECTION SORT
        /** Sorts the first n objects in an array into ascending order.
         @param a  An array of Comparable objects.*/


        public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n)
        {
            for (int index = 0; index < n ; index++)
            {
                bubbleSort(a, 0, n);

                display(a, a.length);
            }
        }


        public static <T extends Comparable<? super T>> void bubbleSort(T[] a, int first, int last)
        {
            T max = a[first];
            for (int index = first + 1; index <= last; index++)
            {
                if (a[index].compareTo(max) < 0)
                {
                    swap(a, index, index-1);
                    max = a[index-1];

                } // end if

                max = a[index];

                // Assertion: min is the smallest of a[first] through a[index].
            } // end for


        } // end getIndexOfSmallest

        private static void swap(Object[] a, int i, int j)
        {
            Object temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        } // end swap


    // end ArraySorter

    public static void display(Object[] array, int n)
    {
        for (int index = 0; index < n; index++)
            System.out.print(array[index] + "\t");
        System.out.println();
    } // end display

}
