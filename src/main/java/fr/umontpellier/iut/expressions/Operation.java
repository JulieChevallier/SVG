package fr.umontpellier.iut.expressions;

public class Operation implements Expression {
    private char operateur;
    private Expression expressionGauche;
    private Expression expressionDroite;

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
         this.operateur = operateur;
         this.expressionDroite=expressionDroite;
         this.expressionGauche=expressionGauche;
    }

    @Override
    public double calculerValeur() {
        double calcul = 0;
        switch (operateur){
            case '*':
                calcul = expressionGauche.calculerValeur() * expressionDroite.calculerValeur();
                break;
            case '/':
                if(expressionDroite.calculerValeur()==0 || expressionGauche.calculerValeur()==0){
                    throw new ArithmeticException("Division par zéro");
                }
                else{
                    calcul = expressionGauche.calculerValeur() / expressionDroite.calculerValeur();
                }
                break;
            case '-':
                calcul = expressionGauche.calculerValeur() - expressionDroite.calculerValeur();
                break;
            case '+':
                calcul = expressionGauche.calculerValeur() + expressionDroite.calculerValeur();
                break;
        }
        return calcul;
    }

    @Override
    public String toString() {
        return "(" + expressionGauche + operateur + expressionDroite + ")";
    }
}
