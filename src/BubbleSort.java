public class BubbleSort implements Sort {


    /**
     * Algorithme de tri a bulle pour trier tout le tableau
     * @param t Un tableau
     */
    @Override
    public void sort(int t[]) { sort(t, 0, t.length-1); }


    /**
     * Redefinition de la mathode sort() de l'interface Sort, implementant l'algorithme de tri a bulle
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     */
    @Override
    public void sort(int[] t, int from, int to) {
        for(int i = to; i > from; i--){
            boolean swapped = false;
            for(int j = 0; j <= (i - 1); j++){
                if (t[j + 1] < t[j]){
                    ArrayUtil.swap(t, j+1, j);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}