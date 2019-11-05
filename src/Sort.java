import java.util.Arrays;

/**
 * Interface permetant le tri d'un tableau
 */
public interface Sort {

    /**
     * Trier tout le tableau
     * @param t
     */
    default void sort(int t[]) { Arrays.sort(t); }

    /**
     * Trier un partie du tableau
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     */
    default void sort(int [] t, int from, int to){ Arrays.sort(t); }
}



