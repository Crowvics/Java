package projetodolar;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ProjetoDolar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do dólar: ");
        double dolar = sc.nextFloat();
        System.out.print("Informe o valor de dólares a serem comprados: ");
        double bought = sc.nextFloat();
        double total = CurrencyConverter.convert(dolar, bought);
        System.out.printf("Valor total: %.2f%n", total);
    }
    
}
