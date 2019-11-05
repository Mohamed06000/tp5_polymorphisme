/**
 * Interface Complexe permettant d'effectuer des operations sur des complexes
 */
public interface Complexe {

    double reelle();
    double imaginaire();
    double module();
    double argument();

    /**
     * Additionner deux complexes
     * @param nb Un objet de type Complexe
     * @return Un nouveau Complexe
     */
    default Complexe add(Complexe nb) {
        double re=this.reelle()+nb.reelle();
        double im=this.imaginaire()+nb.imaginaire();
        return new ComplexeCartesien(re,im);
    }

    /**
     * Soustraire deux complexes
     * @param nb Un objet de type Complexe
     * @return Un nouveau complexe
     */
    default Complexe sub(Complexe nb) {
        double re=this.reelle()-nb.reelle();
        double im=this.imaginaire()-nb.imaginaire();
        return new ComplexeCartesien(re,im);
    }

    /**
     * Une multiplication de deux complexes
     * @param nb Un objet de type Complexe
     * @return Un nouveau complexe
     */
    default Complexe mult(Complexe nb) {
        double argument=this.argument()+nb.argument();
        double module=this.module()*nb.module();
        return new ComplexePolaire(module,argument);
    }

    /**
     * Une division de deux complexes
     * @param nb Un objet de type Complexe
     * @return Un nouveau complexe
     */
    default Complexe div (Complexe nb) {
        double argument=this.argument()-nb.argument();
        double module=this.module()/nb.module();
        return new ComplexePolaire(module,argument);
    }


}


