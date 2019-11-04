public class QuickSort implements Sort {


    public static int partitionner(int t[], int from, int to){
        int pivot = t[to];
        int i = from -1;

        for (int j = from; j<to; j++){
            if (t[j] < pivot){
                i++;
                ArrayUtil.swap(t,j,i);
            }
        }

        ArrayUtil.swap(t,i+1, to);

        return i+1;
    }

    @Override
    public void sort(int t[], int from, int to){

        if (from < to){
            int pivot = partitionner(t, from, to);

            sort(t, from, pivot-1);
            sort(t, pivot+1, to);
        }
    }

    @Override
    public void sort(int t[]){
        sort(t, 0, t.length-1);
    }



}
