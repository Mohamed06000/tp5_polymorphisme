import java.util.Arrays;

public interface Sort {

    default void sort(int t[]) { Arrays.sort(t); }
    default void sort(int [] t, int from, int to){ Arrays.sort(t); }
}



