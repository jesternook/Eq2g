package aula7;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqX x = new EqX();


        System.out.println("Informe os valores da seguinte equação: Ax^2 Bx C = 0.");
        System.out.println("----------------------------------------------------");
        System.out.println("Insira o valor de A: ");
        delta.setA(entrada.nextDouble());
        System.out.println("Insira o valor de B: ");
        delta.setB(entrada.nextDouble());
        System.out.println("Insira o valor de C: ");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();
        System.out.println("  Resultados  ");
        System.out.println("Delta: " + delta.getDelta());
        System.out.println("X |: " + x.calculaXn());
        System.out.println("X ||: " + x.calculaXp());
    }
}