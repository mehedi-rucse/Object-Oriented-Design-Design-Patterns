public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;

    };
}
