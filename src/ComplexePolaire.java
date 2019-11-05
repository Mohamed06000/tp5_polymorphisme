import java.math.*;

/**
 * Class agissant sur un complexe avec des calculs polaire
 */
public class ComplexePolaire implements Complexe{

    double module,argument;

    /**
     * Constructeur de complexe polaire
     * @param m
     * @param a
     */
    ComplexePolaire(double m, double a) {
        this.module = m;
        this.argument = a;
    }

    /**
     * Redefinition de la methode reelle() de Complexe
     * @return Le reel du complexe
     */
    @Override
    public double reelle() {
        return module*Math.cos(argument);

    }

    /**
     * Redefinition de la methode imaginaire de Complexe
     * @return L'imaginaire du complexe
     */
    @Override
    public double imaginaire() {
        return module*Math.sin(argument);
    }

    /**
     * Redefinition de la methode module de Complexe
     * @return Le module du complexe
     */
    @Override
    public double module() {
        return this.module;
    }

    /**
     * Redefinition de la methode argument de Complexe
     * @return L'argument du complexe
     */
    @Override
    public double argument() {
        return this.argument;
    }



}
