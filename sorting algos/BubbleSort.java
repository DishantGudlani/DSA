class BubbleSort
{
    void bubbleSort(int array[])
    {
        int len_arr = array.length;
        boolean swapped;

        for(int i = 0; i < len_arr - 1; i++)
        {
            swapped = false;
            for(int j = 0; j < len_arr - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false)
                break;
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
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.printArray(array);

        bubbleSort.bubbleSort(array);

        System.out.println("-------------------");

        bubbleSort.printArray(array);


    }
}