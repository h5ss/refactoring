package OOP.advanced.Abstract_231221;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }
    public String toString(){
        return "사각형 색상은 "+ super.getColor() +"그리고 면적은 : "+ this.area();
    }
}
