import java.util.Arrays;
import java.util.Random;

/**
 * Class qui genere et stocke un tableau et agit sur un tableau
 */
public class Instance {
    int len,number, t[][];
    Random alea = new Random();

    /**
     * Constructeur de Instance qui genere et stocke un tableau 2D
     * @param number Le nombre de sous-tableaux a generer
     * @param length Le nombre d'elements des sous-tableaux
     */
    Instance (int number,int length) {

        this.len = length;
        this.number = number;
        this.t = new int[number][length];

        for (int i=0; i<number; i++){
            // Possibilite : t[i] = ArrayUtil.getRandomArray(length)
            for (int j=0; j<length; j++){
                this.t[i][j] = alea.nextInt(100);
            }
        }

    }

    /**
     * Copier un tableau
     * @return Un tableau copie
     */
    public int[][] getTab(){

        int copyT[][] = new int[number][len];

        for (int i=0; i<number; i++){
            for (int j=0; j<len; j++){
                copyT[i][j] = t[i][j];
            }
        }
        return copyT;
    }

    /**
     * Afficher un tableau 2D
     */
    public void afficheTab(){
        System.out.println(Arrays.deepToString(this.getTab()));
    }


}


