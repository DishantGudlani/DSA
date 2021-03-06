class QuickSort
{
    static int  partition(int[] array, int low, int high)
    {
        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(array[j] < pivot)
            {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i+1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    void sort( int[] array, int low, int high)
    {
        if(low < high)
        {
            int pIndex = partition(array, low, high);

            sort(array, low, pIndex - 1);
            sort(array, pIndex + 1, high);
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
        int[] array = {10, 7, 8, 9, 1, 5}; 
        int len_arr = array.length;

        Quicksort quicksort = new Quicksort();

        printArray(array);
        quicksort.sort(array, 0, len_arr-1);

        System.out.println("------------------");

        printArray(array);
    }
}