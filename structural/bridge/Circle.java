package structural.bridge;

public class Circle implements Shape {

    private Color color;

    public  Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        color.applyColor();
    }
}
