public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("abc.jpg");
        image.display();
        image.display();
    }
}
