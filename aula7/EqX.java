package aula7;

import java.lang.Math;

public class EqX extends Equacao{
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
    public double calculaXn(Delta delta){
        xN =  -(delta.getB() + Math.sqrt(delta.getDelta())) / (2 * delta.getA());
        return xN;
    }

    public double calculaXp(Delta delta){
        xP =  -(delta.getB() - Math.sqrt(delta.getDelta())) / (2 * delta.getA());
        return xP;
    }
    //#endregion
}
