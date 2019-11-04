import java.util.Random;

public class ArrayUtil {

    // methode SWAP qui échange les éléments aux indices i et j du tableau d'entiers t

    public static void  swap(int t[],int i , int j) {
        int c = t[i];
        t[i] = t[j];
        t[j] = c;
    }

    //methode shuffle qui mélange le tableau qui lui est passé en paramètre

    public static void shuffle(int t[]) {
        Random rand = new Random();
        for (int i = t.length-1; i>=1; i--) {
            swap(t, i,rand.nextInt(i+1));
        }
    }

    //methode getRandomArray qui prend en paramètre un entier n et qui renvoie un tableau d'entiers de taille n

    public static int[] getRandomArray(int n) {
        int t[] = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = i;
        }

        ArrayUtil.shuffle(t);
        return t;
    }
}
