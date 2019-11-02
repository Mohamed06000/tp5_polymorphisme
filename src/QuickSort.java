public class QuickSort implements Sort {


    public static int partitionner(int t[], int first, int last){
        int pivot = t[last];
        int i = first-1;

        for (int j=first; j<last; j++){
            if (t[j] < pivot){
                i++;
                ArrayUtil.swap(t,j,i);
            }
        }

        ArrayUtil.swap(t,i+1, last);

        return i+1;
    }


    public void sort(int t[], int first, int last){

        if (first < last){
            int pivot = partitionner(t, first, last);

            sort(t, first, pivot-1);
            sort(t, pivot+1, last);
        }
    }



}
