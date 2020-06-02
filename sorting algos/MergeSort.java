class MergeSort
{
    void merge(int[] left, int[] right, int[] mergedArray)
    {
        int length_left = left.length;
        int length_right = right.length;
        int pointerLeft, pointerRight, pointerFinalArray;
        pointerLeft = pointerRight = pointerFinalArray = 0;
        while(pointerLeft > length_left && pointerRight > length_right)
        {
            if(left[pointerLeft] <= right[pointerRight])
            {
                mergedArray[pointerFinalArray] = left[pointerLeft];
                pointerLeft++;
            }

            else
            {
                mergedArray[pointerFinalArray] = right[pointerRight];
                pointerRight++;
            }
            pointerFinalArray++;
        }

        while(pointerLeft < length_left)
        {
            mergedArray[pointerFinalArray] = left[pointerLeft];
            pointerLeft++;
            pointerFinalArray++;
        }

        while(pointerRight < length_right)
        {
            mergedArray[pointerFinalArray] = right[pointerRight];
            pointerRight++;
            pointerFinalArray++;
        }

    }

    void mergeSort(int[] array)
    {
        int len_arr = array.length;

        if(len_arr < 2)
            return;

        int mid = len_arr / 2;
        int[] left = new int[mid];
        int[] right = new int[len_arr - mid];



        for (int i = 0; i < mid; i++)
        {
            left[i] = array[i];
        }

        for( int i = mid; i < len_arr; i++)
        {
            right[i - mid] = array[i];
        }

        printArray(left);
        System.out.println("-----------------");
        printArray(right);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    static void printArray(int[] array)
    {
        int len_arr = array.length;

        for(int i = 0; i < len_arr; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void  main(String[] args)
    {
        MergeSort mergeSort = new MergeSort();
        int array[] = {12, 11, 13, 5, 6, 7}; 
        printArray(array);

        mergeSort.mergeSort(array);
        System.out.println("-----------------");
        printArray(array);
    }
}