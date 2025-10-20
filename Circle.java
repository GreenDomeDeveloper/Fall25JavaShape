public class Circle extends Shape {
    private double radius;

    Circle(){
        radius = 1.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    }

   /*  @Override
    public String speak(){
        return "Im a Circle";
    } */

    public boolean canPrint(){
        return false;
    }
}
