import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int t[] = {3,0,2,17,9,14,5},
                t2[] = {56,4,9,2,8,7,2},
                t3[] = {3,99,0,8,5,2},
                t4[] = {7,85,46,92,3,4};

        /*ArrayUtil tab = new ArrayUtil();
        tab.swap(t,1,2);
        System.out.println(Arrays.toString(t));*/

        SelectionSort selection = new SelectionSort();
        QuickSort rapide = new QuickSort();
        BubbleSort bulle = new BubbleSort();
        OptimizedQuickSort opRapide = new OptimizedQuickSort();

        selection.sort(t);
        System.out.println("SelectionSort : " + Arrays.toString(t));
        rapide.sort(t2);
        System.out.println("QuickSort : " + Arrays.toString(t2));
        bulle.sort(t3);
        System.out.println("BulleSort : " + Arrays.toString(t3));
        opRapide.sort(t4);
        System.out.println("OptimizedQuickSort : " + Arrays.toString(t4));


        Instance arr1 = new Instance(1000000,1);
        Instance arr2 = new Instance(1000000,2);
        Instance arr3 = new Instance(1000000,4);
        Instance arr4 = new Instance(1000000,8);
        Instance arr5 = new Instance(1000000,16);
        Instance arr6 = new Instance(1000000,32);
        Instance arr7 = new Instance(1000000,64);

        Benchmark ben = new Benchmark();

        System.out.println("taille      |   Selection     |      Bubble     |       Quick sort     |       Optimized quick sort");
        System.out.println("taille=1   :    "+ ben.getTime(selection,arr1) + "ms               "+ben.getTime(bulle,arr1)+"ms             " + ben.getTime(rapide,arr1)+"ms             " + ben.getTime(opRapide,arr1));
        System.out.println("taille=2   :    "+ ben.getTime(selection,arr2) + "ms               "+ben.getTime(bulle,arr2)+"ms             " + ben.getTime(rapide,arr2)+"ms             " + ben.getTime(opRapide,arr2));
        System.out.println("taille=4   :    "+ ben.getTime(selection,arr3) + "ms               "+ben.getTime(bulle,arr3)+"ms             " + ben.getTime(rapide,arr3)+"ms             " + ben.getTime(opRapide,arr3));
        System.out.println("taille=8   :    "+ ben.getTime(selection,arr4) + "ms               "+ben.getTime(bulle,arr4)+"ms             " + ben.getTime(rapide,arr4)+"ms             " + ben.getTime(opRapide,arr4));
        System.out.println("taille=16  :    "+ ben.getTime(selection,arr5) + "ms               "+ben.getTime(bulle,arr5)+"ms             " + ben.getTime(rapide,arr5)+"ms             " + ben.getTime(opRapide,arr5));
        System.out.println("taille=32  :    "+ ben.getTime(selection,arr6) + "ms               "+ben.getTime(bulle,arr6)+"ms             " + ben.getTime(rapide,arr6)+"ms             " + ben.getTime(opRapide,arr6));
        System.out.println("taille=64  :    "+ ben.getTime(selection,arr7) + "ms               "+ben.getTime(bulle,arr7)+"ms             " + ben.getTime(rapide,arr7)+"ms             " + ben.getTime(opRapide,arr7));



        /*Possibilite for (int[] row : ben.getTab())
            System.out.println("Tableau :" + Arrays.toString(row));*/

        //System.out.println(Arrays.deepToString(arr1.getTab()));
    }
}
