package fr.umontpellier.iut.svg;

public class SkewX extends Transform{
    private double x;

    public SkewX(double x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "skewX(" + x + ")";
    }
}
