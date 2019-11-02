
public class ComplexeCartesien implements Complexe {

    double reelle,imaginaire;

    ComplexeCartesien(double r, double i) {
        this.reelle = r;
        this.imaginaire = i;
    }

    @Override
    public double reelle() {
        return this.reelle;
    }

    @Override
    public double imaginaire() {
        return this.imaginaire;
    }

    @Override
    public double module() {
        return Math.sqrt((reelle*reelle)+(imaginaire*imaginaire));
    }

    @Override
    public double argument() {
        return Math.atan2(imaginaire, reelle);
    }

}
