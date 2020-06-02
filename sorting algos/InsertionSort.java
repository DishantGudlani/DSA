class InsertionSort
{
    void sort(int[] array)
    {
        int len_arr = array.length;

        for(int i = 1; i < len_arr; i++)
        {
            int key = array[i];

            int j = i - 1;

            while(j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

    }

    static void printArray(int[] array)
    {
        int len_arr = array.length;

        for(int i = 0; i < len_arr; i++)
        {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args)
    {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {12,13,11,5,6};

        printArray(array);
        insertionSort.sort(array);
        System.out.println("------------");
        printArray(array);
    }
}