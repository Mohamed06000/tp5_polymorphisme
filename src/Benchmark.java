public class Benchmark {


    static double getTime(Sort algoTri, Instance ins)
    {
        int len = ins.len;
        double startTime = System.currentTimeMillis();
        for (int[] tab : ins.get())
        {
            algoTri.sort(tab, 0, len-1);
        }
        double  endTime = System.currentTimeMillis();

        double T=endTime - startTime;
        return T;
    }
}
