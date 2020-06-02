class SelectionSort
{
    void sort(int array[])
    {
        int len_arr = array.length;

        for(int i = 0; i < len_arr - 1; i++)
        {
            int min_index = i;
            for(int j = i + 1; j < len_arr; j++)
            {
                if(array[j] < array[min_index])
                    min_index = j;

                
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    void printArray(int[] array)
    {
        int len_arr = array.length;

        for(int i = 0; i < len_arr; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        SelectionSort selectionSort = new SelectionSort();
        int array[] = {64, 25, 12, 22, 11};
        selectionSort.printArray(array);
        
        System.out.println("-----------------");
        selectionSort.sort(array);
        selectionSort.printArray(array);

    }
}