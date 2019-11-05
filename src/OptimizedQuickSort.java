public class OptimizedQuickSort implements Sort{

    /**
     * Algorithme de tri rapide optimise pour trier tout le tableau
     * @param t Un tableau
     */
    @Override
    public void sort(int t[]){ sort(t, 0, t.length-1); }

    /**
     * Redefinition de la mathode sort() de l'interface Sort, implementant l'algorithme de tri rapide optimise
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     */
    @Override
    public void sort(int t[], int from, int to) {

        if (t.length < 16){
            new SelectionSort().sort(t, from, to); // Utilisation d'un objet anonyme
        }
        else{
            new QuickSort().sort(t,from,to);
        }
    }
}
