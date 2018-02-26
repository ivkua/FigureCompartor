public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getSquare() {
        return (int) (radius * radius * Math.PI);
    }
}
