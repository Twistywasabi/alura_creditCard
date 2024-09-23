import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double creditLimitRead =read.nextDouble();
        read.nextLine();
        System.out.println("Digite a descrição da compra: ");
        String productRead =read.nextLine();
        System.out.println("Digite o preço do produto: ");
        double productPriceRead =read.nextDouble();

        System.out.println("Limite cartão: R$" + creditLimitRead);
        System.out.println("Produto: " + productRead);
        System.out.println("Preço Produto: " + productPriceRead);



    }
}
