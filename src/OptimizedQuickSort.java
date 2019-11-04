public class OptimizedQuickSort implements Sort{

    /*COMME NOS ALOG DE TRI IMPLEMENTE L'INTERFACE SORT ON PEUT ALORS UTILISER LE POLYMORPHISME POUR CREE NOS OBJETS.
     ON CREE UN TABLEAU DE TYPE SORT QUI CONTIENT 2 ALGO TRI RAPIDE ET TRI SELECTION ! */

    Sort [] algoTri ={new QuickSort(),new SelectionSort()};


    /* LE TRI RAPIDE OPTIMOSE EST UN TRI DONT ON A CHANGER LE CAS DE BASE , POUR LES TABLEAU DE PETITES TAILLES (< 16), ON UTILISE UN TRI PAR INSERTION
       SINON ON UTILISE UN TRI RAPIDE !
     */
    @Override
    public void sort(int t[], int from, int to) {

        if (t.length < 16)
        {
            algoTri[1].sort(t, from, to);
        }
        else
            {
            algoTri[0].sort(t,from,to);
            }
    }
}
