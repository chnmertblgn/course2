public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Araba", "2022 model arabadýr.", 125000, 15, "Mavi");
        //Product product = new Product();

        /*
        product.id = 1;
        product.name = "Araba";
        product.description = "2022 model arabadýr.";
        product.price = 125000;
        product.stockAmount = 15;
        product.color = "Mavi";

        System.out.println(product.id);
        System.out.println(product.name);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);
        System.out.println(product.color);
        */

        /*product.setId(1);
        product.setName("Araba");
        product.setDescription("2022 model arabadýr.");
        product.setPrice(125000);
        product.setStockAmount(15);
        product.setColor("Mavi");*/

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println(product.getColor());
        System.out.println(product.getCode());

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
