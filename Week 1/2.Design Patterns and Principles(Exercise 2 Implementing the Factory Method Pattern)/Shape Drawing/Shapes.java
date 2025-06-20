public class Shapes {
    public Shape getShape(String type) {
        if (type == null || type.isEmpty()) return null;
        if (type.equalsIgnoreCase("SQUARE")) return new Square();
        if (type.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}
