import java.util.Scanner;

import exerciciosPOO.somatorio.RealizaSoma;
import exerciciosPOO.salarioMinimo.CalculaSalario;



public class Main{

    public static void main(String[] args) {
        Scanner salarioUsuario = new Scanner(System.in);
        CalculaSalario calcularSalario = new CalculaSalario();

        System.out.println("Digite o seu salario: ");
        double salarioUser = salarioUsuario.nextDouble();

        calcularSalario.setSalarioUsuario(salarioUser);

        System.out.println("=======Salario========");
        System.out.println(calcularSalario.getSalarioUsuario());
        System.out.println("=======================");
        calcularSalario.calcularSalarios(salarioUser);




    }
}
