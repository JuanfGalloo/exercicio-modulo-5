import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja Bem-vindo(a)!");
        System.out.println("Gostariamos de te conhecer melhor, para isso, preciso saber de algumas informações sobre você");
        System.out.println("Qual o seu nome completo?");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", prazer em te conhecer!");
        System.out.println("Agora nos conte a sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos!");
        System.out.println("Agora nos conte o seu cpf:");
        String cpf = scanner.next();
        System.out.println("Seu cpf é " + cpf + "!");

        System.out.println("Agora nos conte a sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Você tem " + altura + " m de altura!");
        System.out.println("Agora nos conte o seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Você tem " + peso + " kg de peso!");
        System.out.println("Agora nos conte o seu estado civil:");

        String estadoCivil = scanner.next();
        System.out.println("Você é " + estadoCivil + "!");

        System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos, " + altura + " m de altura, pesa " + peso + " kg e " + "possui o cpf " + cpf + " e é " + estadoCivil + "!");

        scanner.close();
    }

}
