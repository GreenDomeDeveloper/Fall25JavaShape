abstract public class Shape implements Printable{
 abstract public double getArea(); // Children HAVE to override
 public String speak(){ // Children can but don't HAVE to override
    return "Im a Shape";
 }

 // Children HAVE to implement canPrint() from Printable interface
}
