import java.math.*;
public class ComplexePolaire implements Complexe{

    double module,argument;

    ComplexePolaire(double m, double a) {
        this.module = m;
        this.argument = a;
    }

    @Override
    public double reelle() {
        return module*Math.cos(argument);

    }

    @Override
    public double imaginaire() {
        return module*Math.sin(argument);
    }

    @Override
    public double module() {
        return this.module;
    }

    @Override
    public double argument() {
        return this.argument;
    }



}
