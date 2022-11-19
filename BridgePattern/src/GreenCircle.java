public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Green Circle [Radius: "+radius+" X: "+x+" y: "+y+"]");
    }
}
