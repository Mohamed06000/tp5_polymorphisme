import java.util.Arrays;
import java.util.Random;

public class Main {

    /* methode de generation de tableau pour tester les algo de tri  */
    static int[] tableauTest(){
        int t[] = new int[10];
        Random rand = new Random();
        for (int i=0; i<10; i++) t[i] = rand.nextInt(100);
        return t;
    }
    /* -------------------------------------------------------------- */


    public static void main(String[] args) {
        // TEST DE CHAQUE ALGO DE TRI :


        Sort [] algoTri={new SelectionSort(),new BubbleSort(),new QuickSort(),new OptimizedQuickSort()};
        for (Sort algo : algoTri)
        {
            int[] t= tableauTest();
            System.out.printf("l'algo de %s sur %s   --->  ", algo.getClass().getSimpleName(),Arrays.toString(t));
            algo.sort(t);
            System.out.printf(" %s%n", Arrays.toString(t));
        }


        /*  CREATION DES INSTANCES , UNE INSTANCE EST COMPOSEE DE TABLEAU DE 1000000 TABLEAUX DONT LA TAILLE DE CHAQUE TABLEAU EST EGALE A LENGTH DONNEE , ON CREE ALORS UN TABLEAU (NOM= MATRICE)
            DE TYPE INSTANCE QUI CREE ET STOCK 7 INSTANCES DEDANS ET QUI PAR LA SUITE PERMET UNE FACTORISATION DE CODE POUR AMÉLIORER LA LISIBILITÉ DU CODE ET EN FACILITER LA CORRECTION ET
            LES MODIFICATIONS ULTÉRIEURES .
         */

        Instance[] matrice =
                {
                new Instance(1000000, 1), new Instance(1000000, 2),
                new Instance(1000000, 4), new Instance(1000000, 8),
                new Instance(1000000, 16), new Instance(1000000, 32), new Instance(1000000, 64)
                };


        // SCÉNARIO QUI PERMET DE COMPARER L'EFFICACITÉ DES DIFFÉRENTS TRIS IMPLÉMENTÉS : //

        Benchmark triBen = new Benchmark();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------- TABLEAU DE COMPARAISON ---------------------------------------------------------------");



        System.out.println(" taille      |   triSelection     |      Bubble     |       Quick sort     |      Optimized quick sort" );
        int acc=1;
        for (Instance tab : matrice)
        {
            System.out.println("taille="+acc+"   :    "+ triBen.getTime(algoTri[0],tab) + "ms               "+triBen.getTime(algoTri[1],tab)+"ms             " + triBen.getTime(algoTri[2],tab)+"ms               " + triBen.getTime(algoTri[3],tab)+"ms");
            acc*=2;
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
    }

}
