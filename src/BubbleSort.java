public class BubbleSort implements Sort {

    @Override
    public void sort(int[] t, int from, int to)
    {
        for(int i = to; i > from; i--)
        {
            boolean swapped = false;
            for(int j = 0; j <= (i - 1); j++)
            {
                if (t[j + 1] < t[j])
                {
                    ArrayUtil.swap(t, j+1, j);
                    swapped = true;
                }
            }
            if (swapped == false)
            {
                break;
            }
        }
    }
}