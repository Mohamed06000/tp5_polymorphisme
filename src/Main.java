import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // TEST DE CHAQUE ALGO DE TRI :

            int tab1[] = {10,5,8,9,66,825,2},
                tab2[] = {7,8,6,55,2,778,24,36},
                tab3[] = {12,0,14,584,3,25,48},
                tab4[] = {147,11,18,87,65,25,66,3};

        SelectionSort triSelection = new SelectionSort();
        QuickSort triRapide = new QuickSort();
        BubbleSort triBulle = new BubbleSort();
        OptimizedQuickSort opTriRapide = new OptimizedQuickSort();


        System.out.printf("le triSelectionSort de %s ---> ", Arrays.toString(tab1));
        triSelection.sort(tab1);
        System.out.printf("%s%n", Arrays.toString(tab1));
        System.out.printf("le tri QuickSort de %s ---> ", Arrays.toString(tab2));
        triRapide.sort(tab2);
        System.out.printf("%s%n" ,Arrays.toString(tab2));
        System.out.printf("le triBulle  de %s ---> ", Arrays.toString(tab3));
        triBulle.sort(tab3);
        System.out.printf("%s%n" ,Arrays.toString(tab3));
        System.out.printf("le tri OptimizedQuickSort  de %s ---> ", Arrays.toString(tab4));
        opTriRapide.sort(tab4);
        System.out.printf("%s%n" ,Arrays.toString(tab4));



        // CREATION DES INSTANCES , UNE INSTANCE EST COMPOSEE DE TABLEAU DE 1000000 TABLEAUX DONT LA TAILLE DE CHAQUE TABLEAU EST EGALE A LENGTH DONNEE :

        Instance setTab1 = new Instance(1000000,1);
        Instance setTab2 = new Instance(1000000,2);
        Instance setTab3 = new Instance(1000000,4);
        Instance setTab4 = new Instance(1000000,8);
        Instance setTab5 = new Instance(1000000,16);
        Instance setTab6 = new Instance(1000000,32);
        Instance setTab7 = new Instance(1000000,64);

        // SCÉNARIO QUI PERMET DE COMPARER L'EFFICACITÉ DES DIFFÉRENTS TRIS IMPLÉMENTÉS :

        Benchmark triBen = new Benchmark();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------- TABLEAU DE COMPARAISON ---------------------------------------------------------------");


        System.out.println("taille      |   triSelection     |      Bubble     |       Quick sort     |       Optimized quick sort");
        System.out.println("taille=1   :    "+ triBen.getTime(triSelection,setTab1) + "ms               "+triBen.getTime(triBulle,setTab1)+"ms             " + triBen.getTime(triRapide,setTab1)+"ms               " + triBen.getTime(opTriRapide,setTab1)+"ms");
        System.out.println("taille=2   :    "+ triBen.getTime(triSelection,setTab2) + "ms               "+triBen.getTime(triBulle,setTab2)+"ms             " + triBen.getTime(triRapide,setTab2)+"ms               " + triBen.getTime(opTriRapide,setTab2)+"ms");
        System.out.println("taille=4   :    "+ triBen.getTime(triSelection,setTab3) + "ms               "+triBen.getTime(triBulle,setTab3)+"ms             " + triBen.getTime(triRapide,setTab3)+"ms               " + triBen.getTime(opTriRapide,setTab3)+"ms");
        System.out.println("taille=8   :    "+ triBen.getTime(triSelection,setTab4) + "ms               "+triBen.getTime(triBulle,setTab4)+"ms             " + triBen.getTime(triRapide,setTab4)+"ms               " + triBen.getTime(opTriRapide,setTab4)+"ms");
        System.out.println("taille=16  :    "+ triBen.getTime(triSelection,setTab5) + "ms               "+triBen.getTime(triBulle,setTab5)+"ms             " + triBen.getTime(triRapide,setTab5)+"ms               " + triBen.getTime(opTriRapide,setTab5)+"ms");
        System.out.println("taille=32  :    "+ triBen.getTime(triSelection,setTab6) + "ms               "+triBen.getTime(triBulle,setTab6)+"ms             " + triBen.getTime(triRapide,setTab6)+"ms               " + triBen.getTime(opTriRapide,setTab6)+"ms");
        System.out.println("taille=64  :    "+ triBen.getTime(triSelection,setTab7) + "ms               "+triBen.getTime(triBulle,setTab7)+"ms             " + triBen.getTime(triRapide,setTab7)+"ms               " + triBen.getTime(opTriRapide,setTab7)+"ms");

    }
}
