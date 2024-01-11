package OOP.advanced.stream.section2.product;

public class Product {
    private int productNo;
    private String name;
    private String company;
    private Integer price;

    public Product(int productNo, String name, String company, Integer price) {
        this.productNo = productNo;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getProductNo() {
        return productNo;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
