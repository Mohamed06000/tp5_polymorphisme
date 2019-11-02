public class SelectionSort implements Sort{


    public void sort(int t[]){
        for (int i=0; i<(t.length-1); i++) {
            int min = i;
            for (int j=i+1; j<(t.length); j++) {
                if (t[j] < t[min]) {
                    min = j;
                }
            }
            if (min != i) {
                ArrayUtil.swap(t,i,min);
            }
        }
    }
}