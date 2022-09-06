package dayone.classesandobs.shapes;

public class Circle {
    public double radius ;

    public Circle(double radius){
        this.radius = radius;
    }
    // Calculate the area of a circle
    // PI * R * R
    public Double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }
}
