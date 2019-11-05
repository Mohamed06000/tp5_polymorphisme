/**
 * Class agissant sur un complexe avec des calculs cartesien
 */
public class ComplexeCartesien implements Complexe {

    double reelle,imaginaire;

    /**
     * Constructeur de complexe cartesien
     * @param r Un reel
     * @param i Un imaginaire
     */
    ComplexeCartesien(double r, double i) {
        this.reelle = r;
        this.imaginaire = i;
    }

    /**
     * Redefinition de la methode reelle() de Complexe
     * @return Le reel du complexe
     */
    @Override
    public double reelle() {
        return this.reelle;
    }

    /**
     * Redefinition de la methode imaginaire de Complexe
     * @return L'imaginaire du complexe
     */
    @Override
    public double imaginaire() {
        return this.imaginaire;
    }

    /**
     * Redefinition de la methode module de Complexe
     * @return Le module du complexe
     */
    @Override
    public double module() {
        return Math.sqrt((reelle*reelle)+(imaginaire*imaginaire));
    }

    /**
     * Redefinition de la methode argument de Complexe
     * @return L'argument du complexe
     */
    @Override
    public double argument() {
        return Math.atan2(imaginaire, reelle);
    }

}
