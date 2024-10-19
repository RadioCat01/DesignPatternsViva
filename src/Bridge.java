interface Shape{
    void draw();
}
interface Color{
    void paint();
}
//bridge class
class PaintedShape{
    private Shape shape;
    private Color color;

    public PaintedShape(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void draw(){
        color.paint();
        shape.draw();
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.printf("Drawing Circle");
    }
}
class Green implements Color{
    @Override
    public void paint(){
        System.out.printf("Paint green");
    }
}
public class Bridge{
    public static void main(String[] args) {
        Shape circle=new Circle();
        Color green = new Green();

        PaintedShape greenCircle=new PaintedShape(circle,green);
        greenCircle.draw();
    }
}