package fr.umontpellier.iut.svg;

import java.util.ArrayList;

public class Group extends Tagable{
    private SVG group;

    public Group() {
        super("g");
        group=new SVG(0,0);
    }

    public void add(Tagable t) {
        group.add(t);
    }

    @Override
    public String getContent() {
        return group.getContent();
    }

    @Override
    public String getParameters() {
        return super.getParameters();
    }
}
