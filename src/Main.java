import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int t[] = {3,0,2,17,9,14,5}; // Creation d'un tableau nom trie

        Sort algoTri[] = { new SelectionSort(), new BubbleSort(), new QuickSort(), new OptimizedQuickSort()}; // Creation d'un tableau d'objets anonymes Sort

        System.out.println("Le tableau a trier : " + Arrays.toString(t));

        // Parcourir le tableau d'algo pour effectuer le tri puis l'afficher
        for (Sort algo : algoTri) {
            algo.sort(t); // On pourrait utiliser la methode a 3 argument si l'on chercher a trier une partie du tableau
            System.out.println(algo.getClass().getSimpleName() + " : " + Arrays.toString(t));
        }


        // Creation d'un tableau d'objets anonymes Instance
        Instance tab2D[] = { new Instance(1000000,1),
                new Instance(1000000,2),
                new Instance(1000000,4),
                new Instance(1000000,4),
                new Instance(1000000,8),
                new Instance(1000000,16),
                new Instance(1000000,32),
                new Instance(1000000,64)};


        // Afficher sous formes d'un tableau le temps de tri pour chaque algorithme
        Benchmark ben = new Benchmark();
        System.out.println("taille      |   Selection     |      Bubble     |       Quick sort     |       Optimized quick sort");
        int i = 1;
        for (Instance arr : tab2D){
            System.out.println("taille=" + i + "   :    "+ ben.getTime(algoTri[0],arr) + "ms               "+ben.getTime(algoTri[1],arr)+"ms             " + ben.getTime(algoTri[2],arr)+"ms             " + ben.getTime(algoTri[3],arr));
            i*=2;
        }

    }
}