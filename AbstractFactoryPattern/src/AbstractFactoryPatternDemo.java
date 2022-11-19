public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory1.getShape("Circle");
        shape2.draw();
    }
}
