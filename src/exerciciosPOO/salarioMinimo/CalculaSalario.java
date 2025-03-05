package exerciciosPOO.salarioMinimo;

public class CalculaSalario {
    double salarioMinimo = 1412.0;
    private double salarioUsuario;

    public double getSalarioUsuario() {
        return salarioUsuario;
    }

    public void setSalarioUsuario(double salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }

    public double calcularSalarios(double salarioUsuario){
        int contador;
        double somaSalario = 0;

        if (salarioUsuario < salarioMinimo){
            System.out.println("O salario do usuário é menor que o salario minimo atual");
            return 0;
        }
        for(contador = 0; salarioMinimo < salarioUsuario; contador++){
            somaSalario = somaSalario + salarioMinimo;
            System.out.println(contador);
            System.out.println("----------");
            salarioMinimo = salarioMinimo + salarioMinimo;
        }
        System.out.println("A quantidade de sálarios é: "+ contador);
        return 0;
    }
}
