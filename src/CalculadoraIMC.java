import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, por favor digite o seu nome");
        String nome = scan.next();

        System.out.println("Digite seu peso em kg");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf(nome, " o seu IMC é: %.1f%n", imc);

        if (imc < 18.5) {
            System.out.println(" você está a baixo do peso.");
        } else if (imc < 25) {
            System.out.println(" você está o com peso ideal. Parabéns.");
        } else if (imc < 30) {
            System.out.println(" você está levemente acima do peso.");
        } else if (imc < 35) {
            System.out.println(" você está com obesidade de grau 1.");
        } else if (imc < 40) {
            System.out.println(" você está com obesidade de grau 2.");
        } else {
            System.out.println(" você está com obesidade de grau 3. Cuidado!");
        }
        scan.close();
    }
}