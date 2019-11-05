import java.util.Arrays;
import java.util.Random;

public class Instance {
    int len,number, t[][]; // number--> nombre de tableau a cree ;;; len ---> taille des tableaux cree
    Random rand = new Random(); // generer un nombre aleatoire rnd

    Instance (int number,int length)
    {

        this.len = length;
        this.number = number;
        this.t = new int[number][length];

        for (int i=0; i<number; i++)
        {
            for (int j=0; j<length; j++)
            {
                this.t[i][j] = rand.nextInt(501);   // on remplit tout les tableau element par element avec des nombres aleatoires entre 0 et 500 .
            }
        }

    }

    public int[][] get()
    {
        int copyDeT[][] = new int[number][len];

        for (int i=0; i<number; i++)
        {
            for (int j=0; j<len; j++)
            {
                copyDeT[i][j] = t[i][j];
            }
        }
        return copyDeT;
    }



    /*   pour afficher les tableau un par un on peut utiliser la methode Arrays.deepToString(this.get()) !!! */
}


