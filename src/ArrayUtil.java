import java.util.Random;

public class ArrayUtil {

    public static void  swap(int t[],int i , int j) {
        int c = t[i];
        t[i] = t[j];
        t[j] = c;
    }

    public static void shuffle(int t[]) {
        Random rand = new Random();
        for (int i = t.length-1; i>=1; i--) {
            swap(t, i,rand.nextInt(i+1));
        }
    }

    public static int[] getRandomArray(int n) {
        int t[] = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = i;
        }

        ArrayUtil.shuffle(t);
        return t;
    }
}
