package class20Homework;
//1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
// In circle class create a method to calculate the area of circle. Test your code
public class Shape {
    Double area;
    double radius;
    Shape(Double radius){
        this.radius=radius;
    }
}
class circle  extends Shape{
    circle(Double radius) {
        super(radius);
    }
    void CircleArea(){
        System.out.println("The circle area is : "+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        circle c=new circle(5.0);{
            c.CircleArea();
        }
}
}