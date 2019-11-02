import java.util.Arrays;
import java.util.Random;

public class Instance {
    int len,number, t[][];
    Random alea = new Random();

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

    public int[][] getTab(){

        int copyT[][] = new int[number][len];

        for (int i=0; i<number; i++){
            for (int j=0; j<len; j++){
                copyT[i][j] = t[i][j];
            }
        }
        return copyT;
    }

    public void afficheTab(){
        System.out.println(Arrays.deepToString(this.getTab()));
    }


}


