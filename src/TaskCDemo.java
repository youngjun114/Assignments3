// Youngjun Woo
// CS 240
// Assignment3
// May 18, 2018

public class TaskCDemo {
    public static void main(String[] args){
        Integer[] array = {8, 2, 6, 4, 9, 7, 1};
        System.out.println("Before Sorting");
        BubbleSortIterative.display(array, array.length);

        System.out.println();
        System.out.println("After Sorting");
        BubbleSortIterative.selectionSort(array,array.length-1);
    }
}

/*
Output:

Before Sorting
8	2	6	4	9	7	1

After Sorting
2	6	4	8	7	1	9
2	4	6	7	1	8	9
2	4	6	1	7	8	9
2	4	1	6	7	8	9
2	1	4	6	7	8	9
1	2	4	6	7	8	9
*/