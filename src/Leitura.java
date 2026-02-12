import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filme = scanner.nextLine();
        int anoDelancamento = scanner.nextInt();
        double avaliacao =  scanner.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelancamento);
        System.out.println(avaliacao);
    }
}
