package structural.bridge;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new BlueColor());
        circle.draw();

        Square square = new Square(new RedColor());
        square.draw();
    }
}
