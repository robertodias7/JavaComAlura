public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoDePlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        }else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoDePlano.equals("Plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Filme não liberado");
        }
    }
}
