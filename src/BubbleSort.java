public class BubbleSort implements Sort {


    public void sort(int t[]) {
        for (int i = t.length; i >= 1; i--) {
            for (int j = 0; j < (i - 1); j++) {
                if (t[j + 1] < t[j]) {
                    ArrayUtil.swap(t,j,j+1);
                }
            }
        }
    }
}