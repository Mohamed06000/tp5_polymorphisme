public class QuickSort implements Sort {


    /**
     * Partitionne le tri du tableau
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     * @return Le nouveau pivot
     */
    public static int partitionner(int t[], int from, int to){
        int pivot = t[to];
        int i = from -1;

        for (int j = from; j<to; j++){
            if (t[j] < pivot){
                i++;
                ArrayUtil.swap(t,j,i);
            }
        }

        ArrayUtil.swap(t,i+1, to);

        return i+1;
    }

    /**
     * Redefinition de la mathode sort() de l'interface Sort, implementant l'algorithme de tri rapide
     * @param t Un tableau
     * @param from Un index de debut
     * @param to Un index de fin
     */
    @Override
    public void sort(int t[], int from, int to){

        if (from < to){
            int pivot = partitionner(t, from, to);

            sort(t, from, pivot-1);
            sort(t, pivot+1, to);
        }
    }

    /**
     * Algorithme de tri rapide pour trier tout le tableau
     * @param t Un tableau
     */
    @Override
    public void sort(int t[]){
        sort(t, 0, t.length-1);
    }



}
