public class OptimizedQuickSort implements Sort{

    SelectionSort selectSort = new SelectionSort();
    QuickSort rapideSort = new QuickSort();

    @Override
    public void sort(int t[]){ sort(t, 0, t.length-1); }

    @Override
    public void sort(int t[], int from, int to) {

        if (t.length < 16){
            selectSort.sort(t, from, to);
        }
        else{
            rapideSort.sort(t,from,to);
        }
    }
}
