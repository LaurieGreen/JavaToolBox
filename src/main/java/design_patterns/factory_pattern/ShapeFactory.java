package design_patterns.factory_pattern;

public class ShapeFactory {

    public static Shape createShape(String typeOfShape){
        if (typeOfShape.equals("circle")){
            return new Circle();
        } else if (typeOfShape.equals("square")){
            return new Square();
        } else {
            System.out.println("Shape not available");
        }
        return null;
    }

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");

        circle.draw();

    }

}
