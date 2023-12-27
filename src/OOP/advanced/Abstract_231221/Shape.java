package OOP.advanced.Abstract_231221;

public abstract class Shape {
    private String color;
    public abstract double area();

    public Shape(String color) {
        System.out.println("Shape 클래스 생성자 호출");
        this.color = color;
    }

    public String getColor() {

        return color;
    }
}
