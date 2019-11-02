
public interface Complexe {
    double reelle();
    double imaginaire();
    double module();
    double argument();

    default Complexe add(Complexe nb) {
        double re=this.reelle()+nb.reelle();
        double im=this.imaginaire()+nb.imaginaire();
        return new ComplexeCartesien(re,im);
    }
    default Complexe sub(Complexe nb) {
        double re=this.reelle()-nb.reelle();
        double im=this.imaginaire()-nb.imaginaire();
        return new ComplexeCartesien(re,im);
    }

    default Complexe mult(Complexe nb) {
        double argument=this.argument()+nb.argument();
        double module=this.module()*nb.module();
        return new ComplexePolaire(module,argument);
    }

    default Complexe div (Complexe nb) {
        double argument=this.argument()-nb.argument();
        double module=this.module()/nb.module();
        return new ComplexePolaire(module,argument);
    }


}


