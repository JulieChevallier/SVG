package fr.umontpellier.iut.svg;

import org.w3c.dom.css.Rect;

public class AppSVG {
    public static void main(String[] args) {
        /*
        SVG svg = new SVG(50,50);
        Circle c = new Circle(5,3,1.3);
        Rectangle r = new Rectangle(8,6,34,49);
        Group g = new Group();

        g.add(c);
        g.add(r);
        Style s = r.getStyle();
        s.addTransform(new Scale(3,3));
        s.setFill("green");
        s.setStroke("blue");
        svg.add(g);
        svg.saveAsFile("test.svg");
         */




        // Q12 //
        /*
        SVG svg = new SVG(1000,1000);

        Rectangle rect1 = new Rectangle(0,0,1000,1000);
        Style s1 = rect1.getStyle();
        s1.setFill("lightblue");


        //grp
        Group g1 = new Group();

        Style groupeStyle = new Style();
        groupeStyle.setStroke("black");
        groupeStyle.setStrokeWidth(20.0);
        groupeStyle.setFillOpacity(0.8);

        Rectangle rect2 = new Rectangle(100,100,200,200);
        Style s2 = rect2.getStyle();
        s2.setFill("#080");

        Rectangle rect3 = new Rectangle(200,200,400,400);
        Style s3 = rect3.getStyle();
        s3.setFill("#0C0");

        //grp
        Group g2 = new Group();

        Style groupeStyle2 = new Style();
        groupeStyle2.addTransform(new Rotate(-45,100,50));
        groupeStyle2.addTransform(new Translate(0.0,700.0));

        Rectangle rect4 = new Rectangle(100,100,200,200);
        Style s4 = rect4.getStyle();
        s4.setFill("#800");

        Rectangle rect5 = new Rectangle(200,200,400,400);
        Style s5 = rect5.getStyle();
        s5.setFill("#C00");
        //
        g2.add(rect4);
        g2.add(rect5);
        //
        g1.add(rect2);
        g1.add(rect3);
        g1.add(g2);

        g1.setStyle(groupeStyle);
        g2.setStyle(groupeStyle2);


        svg.add(rect1);
        svg.add(g1);
        svg.saveAsFile("q12.svg");
        */




        //Q13
        SVG svg2 = new SVG(1000, 1000);

        Style GroupStyle = new Style();
        GroupStyle.setStroke("black");
        GroupStyle.setStrokeWidth(5.0);
        GroupStyle.setFillOpacity(0.5);


        Style c1Style = new Style();
        c1Style.setFill("red");

        Style c2Style = new Style();
        c2Style.setFill("green");

        Style c3Style = new Style();
        c3Style.setFill("blue");


        Group grup = new Group();
        grup.setStyle(GroupStyle);

        Circle c1 = new Circle(500, 450, 200);
        Circle c2 = new Circle(400, 300, 200);
        Circle c3 = new Circle(600, 300, 200);

        c1.setStyle(c1Style);
        c2.setStyle(c2Style);
        c3.setStyle(c3Style);

        grup.add(c1);
        grup.add(c2);
        grup.add(c3);

        svg2.add(grup);
        svg2.saveAsFile("q13.svg");






        //Q14
        /*
        SVG s = new SVG(100,100);
        Style gs = new Style();
        gs.addTransform(new SkewX(4));
        gs.addTransform(new SkewY(5));
        Group group = new Group();
        group.setStyle(gs);
        group.add(rect1);
        s.add(group);
        s.saveAsFile("q14.svg");
        */
    }
}
