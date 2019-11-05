import java.util.Random;

/**
 * Une classe utilitaire permettant d'agir sur des tableaux
 */
public class ArrayUtil {

    /**
     * Permuter deux elements d'un tableau
     * @param t Un tableau
     * @param i Un premier index
     * @param j Un deuxieme index
     */
    public static void  swap(int t[],int i , int j) {
        int c = t[i];
        t[i] = t[j];
        t[j] = c;
    }

    /**
     * Remplir un tableau de nombre aleatoire
     * @param t Un tableau
     */
    public static void shuffle(int t[]) {
        Random rand = new Random();
        for (int i = t.length-1; i>=1; i--) {
            swap(t, i,rand.nextInt(i+1));
        }
    }

    /**
     * Creer un tableau et le remplir de nombre aleatoire
     * @param n La taille du tableau
     * @return Un tableau de nombre aleatoire
     */
    public static int[] getRandomArray(int n) {
        int t[] = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = i;
        }

        ArrayUtil.shuffle(t);
        return t;
    }
}
