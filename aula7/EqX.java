package aula7;

import java.lang.Math;

public class EqX extends Delta{
    private double xN;
    private double xP;

    //#region Encapsulamento
    public double getxN() {
        return xN;
    }
    public void setxN(double xN) {
        this.xN = xN;
    }
    public double getxP() {
        return xP;
    }
    public void setxP(double xP) {
        this.xP = xP;
    }
    //#endregion

    //#region Regras de Negócio 
    public double calculaXn(){
        xN = - super.getB() + Math.sqrt(super.getDelta()) / 2 * super.getA();
        return xN;
    }

    public double calculaXp(){
        xP = - super.getB() - Math.sqrt(super.getDelta()) / 2 * super.getA();
        return xP;
    }
    

    //#endregion
}
