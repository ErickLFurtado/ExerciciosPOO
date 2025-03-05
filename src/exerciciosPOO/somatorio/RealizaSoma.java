package exerciciosPOO.somatorio;



public class RealizaSoma {
    public int soma;

    public int somar(int num1, int num2){
        soma = num1 + num2;
        System.out.println(soma);
        return soma;
    }

    public int verificarMaior(int num1, int num2, int num3){
        somar(num1, num2);
        if(soma > num3){
            System.out.println("O resultado da soma: "+ soma + " é maior que: "+ num3);
            return 0;

        }
        else if(soma == num3){
            System.out.println("O resultado da soma: "+ soma + " é igual a: "+ num3);
            return 0;
        }
        else System.out.println("O resultado da soma: "+ soma + "é menor que: "+ num3);
        return 0;
    }

}
