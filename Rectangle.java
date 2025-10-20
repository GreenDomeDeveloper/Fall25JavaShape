public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(){
        length = 2.0;
        width = 1.0;
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public String speak(){
        return "Im a Rectangle";
    }

    public boolean canPrint(){
        return true;
    }
}
