public class SelectionSort implements SortingAlgorithm
{

    @Override
    public void sort(int[] a)
{
    int min;
    for (int i = 0; i < a.length - 1; i++)
    {
        min = i;
        for (int j = i + 1; j < a.length; j++)
        {
            if (a[j] < a[min])
            {
                min = j;
            }
        }
        swap(a, min, i);
    }
}


    public void swap(int[] a, int i, int j)
    {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
