package fr.umontpellier.iut.svg;

public class SkewY extends Transform{
    private double x;

    public SkewY(double x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "skewY(" + x + ")";
    }
}
