public class SelectionSort implements Sort{


    /**
     * Algorithme de tri par selection pour trier tout le tableau
     * @param t Un tableau
     */
    @Override
    public void sort(int t[]){ sort(t, 0, t.length-1); }

    /**
     * Redefinition de la mathode sort() de l'interface Sort, implementant l'algorithme de tri par selection
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     */
    @Override
    public void sort(int[] t, int from, int to){

        for(int i = from; i<=to-1; i++){
            int min = i;
            for(int j = i+1; j <= to; j++){
                if (t[j] < t[min]) {
                    min = j;
                }
            }

            if (min != i) {
                ArrayUtil.swap(t,i,min);
            }
        }
    }
}