
public class Benchmark {

    /**
     * Retourner Le temps de tri d'un algorithme de tri pour un tableau en ms
     * @param algoTri Un algorithme de tri
     * @param instance Un objet Instance
     * @return Le temps en ms
     */
    static double getTime(Sort algoTri, Instance instance){
        int len = instance.len;
        double startTime = System.currentTimeMillis();
        for (int[] row : instance.getTab()){
            algoTri.sort(row, 0, len-1);
        }
        double  endTime = System.currentTimeMillis();

        return endTime-startTime;
    }
}
