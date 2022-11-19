public class BridgePatternDemo {
    public static void main(String[] args) {
        RedCircle redCircle = new RedCircle();
        Circle circle = new Circle(5,5,20,redCircle);
        circle.draw();
        GreenCircle greenCircle = new GreenCircle();
        Circle circle1 = new Circle(10,15,10,greenCircle);
        circle1.draw();
    }
}