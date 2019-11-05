import java.util.Arrays;

public interface Sort {

    default void sort(int t[]) { Arrays.sort(t); }

    // SURCHARGEMENT DE LA METHODE SORT :

    default void sort(int[] t, int from, int to) {

    }

}



