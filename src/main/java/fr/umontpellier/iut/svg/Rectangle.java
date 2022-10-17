package fr.umontpellier.iut.svg;

import java.util.Locale;

public class Rectangle extends Tagable{
    private double x;
    private double y;
    private double width;
    private double height;
    private double rx;
    private double ry;


    public Rectangle(double x, double y, double width, double height) {
        super("rect");
        this.x = x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public Rectangle(double x, double y, double width, double height, double rx, double ry) {
        this(x,y,width,height);
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String getParameters() {
        return String.format(Locale.US, "x=\"%f\" y=\"%f\" width=\"%f\" height=\"%f\"", x, y, width, height);
    }


}
