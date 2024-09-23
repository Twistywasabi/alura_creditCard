import com.sun.security.auth.NTNumericCredential;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double creditLimitRead =read.nextDouble();
        read.nextLine();
        CreditCard creditCard = new CreditCard(creditLimitRead);
        int menuOptions = 1;

        while(menuOptions == 1) {

        System.out.println("Digite a descrição da compra: ");
        String productRead =read.nextLine();
        System.out.println("Digite o valor da compra: ");
        double productPriceRead =read.nextDouble();

        if (creditLimitRead >= productPriceRead){
            creditLimitRead -= productPriceRead;
            System.out.println("Compra realizada com sucesso");
            System.out.println("Limite cartão: R$" + creditLimitRead);
            System.out.println("Produto: " + productRead);
            System.out.println("Preço Produto: " + productPriceRead);
            System.out.println("Digite 0 para sair ou 1 para continuar");
            menuOptions = read.nextInt();
            read.nextLine();
        } else {
            System.out.println("Saldo Insuficiente !");
            menuOptions = 0;
        }
        }






    }
}
