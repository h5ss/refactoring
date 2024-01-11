package OOP.advanced.lambda.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Laptop",150000.0),
        new Product("applePhone",300000.0),
        new Product("Tablet",50000.0),
        new Product("mouse",5000.0)
        );

        System.out.println("=========Product 리스트=========");
        products.forEach(System.out::println);

        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
        System.out.println("===가격별 정렬된 Product 리스트===");
        sortedProducts.forEach(System.out::println);
    }
}
