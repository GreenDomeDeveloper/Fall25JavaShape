import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> myShapes = new ArrayList<Shape>();

        myShapes.add(new Circle());
        myShapes.add(new Circle(3.0));
        myShapes.add(new Rectangle());
        myShapes.add(new Rectangle(2.5, 3.5));
       // myShapes.add(new Shape());

        for (int i = 0; i < myShapes.size(); i++) {
            System.out.println("Area: "+myShapes.get(i).getArea()); 
        }

    for (int i = 0; i < myShapes.size(); i++) {
            System.out.println("Type: "+ myShapes.get(i).speak()); 
        }
    

    for (int i = 0; i < myShapes.size(); i++) {
         System.out.println("Can print?: "+ myShapes.get(i).canPrint()); 
     }
    /* Circle myCircle = new Circle(5.0);
    System.out.println("Can print?: "+ myCircle.canPrint());
    Rectangle myRectangle = new Rectangle(4.0, 6.5);
    System.out.println("Can print?: "+ myRectangle.canPrint()); */

    }
}