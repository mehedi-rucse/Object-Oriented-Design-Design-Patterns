public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
    public void setRedBorder(Shape shape){
        System.out.println("System color: RED");
    }
}
