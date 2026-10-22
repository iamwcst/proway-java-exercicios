import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = s.nextLine();

        System.out.println("Idade: ");
        int idade = s.nextInt();
        s.nextLine(); // para tirar o enter que o Scanner deixou.

        System.out.println("Cargo: ");
        String cargo = s.nextLine();

        System.out.println("====== FICHA DO FUNCIONARIO ======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);

        s.close();
    }
}
