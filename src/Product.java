public class Product {
    private String product;
    private double productValue;

    public Product(String product, double productValue) {
        this.product = product;
        this.productValue = productValue;
    }

    @Override
    public String toString() {
        return "\n" + product + " - R$" + productValue + '\n';
    }


}
