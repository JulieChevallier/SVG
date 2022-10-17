package fr.umontpellier.iut.expressions;

public class AppExpression {

    public static void main(String[] args) {
        Expression monExpr;
        // pour construire une Expression, il faudra d'abord créer les Nombres,
        // puis les Expressions utilisant ces nombres, etc.
        Expression nb1 = new Nombre(5.00);
        Expression nb2 = new Nombre(7.00);
        Expression nb3 = new Nombre(14.00);
        monExpr = new Operation('/',nb1,nb2);
        monExpr = new Operation('+',monExpr,nb3);
        double resultat = monExpr.calculerValeur(); // évalue l'expression
        System.out.println(monExpr);

    }
}
