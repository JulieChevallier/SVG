package fr.umontpellier.iut.svg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Modélisation des paramètres de style d'une balise SVG
 */
public class Style{

    private ArrayList<Transform> transforms = new ArrayList<>();

    /**
     * Couleur de remplissage
     */
    private String fill;

    /**
     * Couleur du tracé
     */
    private String stroke;

    /**
     * Épaisseur du trait
     */
    private Double strokeWidth;

    /**
     * Transparence du remplissage
     */
    private Double fillOpacity;

    /**
     * Renvoie la représentation du style sous forme d'une chaîne de caractères qui peut être insérée dans une
     * balise SVG.
     *
     * @return représentation du style au format SVG
     */
    public String toSVG() {
        StringJoiner elements = new StringJoiner(" ");
        if(transforms.size() > 0){
            Collections.reverse(transforms);
            elements.add("transform=\"");
            for(Transform t : transforms){
                elements.add(t.toString());
            }
            elements.add("\"");
        }
        if (fill != null) {
            elements.add("fill=\"" + fill + "\"");
        }
        if (stroke != null) {
            elements.add("stroke=\"" + stroke + "\"");
        }
        if (strokeWidth != null) {
            elements.add("stroke-width=\"" + strokeWidth + "\"");
        }
        if (fillOpacity != null) {
            elements.add("fill-opacity=\"" + fillOpacity + "\"");
        }

        return elements.toString();
    }

    public void addTransform(Transform t){
        transforms.add(t);
    }

    public String getFill() {
        return fill;
    }

    public String getStroke() {
        return stroke;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
    }
}
