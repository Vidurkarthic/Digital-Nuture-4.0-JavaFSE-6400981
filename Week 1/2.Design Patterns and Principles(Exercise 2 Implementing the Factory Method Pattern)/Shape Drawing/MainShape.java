public class MainShape {
    public static void main(String[] args) {
        Shapes shapeFactory = new Shapes();

        Shape s1 = shapeFactory.getShape("SQUARE");
        s1.draw();

        Shape s2 = shapeFactory.getShape("RECTANGLE");
        s2.draw();
    }
}
