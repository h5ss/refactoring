package OOP.advanced.Abstract_231221;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle 클래스 생성자 호출");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "원 색상은 "+super.getColor()+"그리고 면적은 :" +this.area();
    }


}
