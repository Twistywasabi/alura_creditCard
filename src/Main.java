import com.sun.security.auth.NTNumericCredential;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double creditLimitRead =read.nextDouble();
        read.nextLine();
        CreditCard creditCard = new CreditCard(creditLimitRead);
        int menuOptions = 1;
        ArrayList<Product> productList = new ArrayList<>();

        while(menuOptions == 1) {

        System.out.println("Digite a descrição da compra: ");
        String productRead =read.nextLine();
        System.out.println("Digite o valor da compra: ");
        double productPriceRead =read.nextDouble();

        if (creditLimitRead >= productPriceRead){
            creditLimitRead -= productPriceRead;
            Product product = new Product(productRead, productPriceRead);
            productList.add(product);
            System.out.println("Compra realizada com sucesso");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            menuOptions = read.nextInt();
            read.nextLine();
        } else {
            System.out.println("Saldo Insuficiente !");
            menuOptions = 0;
        }
        }
        System.out.println("**************************************");
        System.out.println("Compras realizadas:");
        System.out.println(productList.toString());
        System.out.println("**************************************");
        creditCard.setCreditLimit(creditLimitRead);
        System.out.println("Saldo cartão: R$ " + creditCard.getCreditLimit());
        System.out.println("**************************************");

    }
}
