package dayone.classesandobs.shapes;

public class Square {
    public double sides;

    public Square(double sides){
        this.sides = sides;
    }
   public double calcArea(){
        return Math.pow(this.sides, 2);

   }
    }

