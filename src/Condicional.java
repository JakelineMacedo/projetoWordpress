public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 1990;
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLacamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assitir!");
        }

        if (incluindoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");

        }
    }
}

