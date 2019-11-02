public class Benchmark {

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
