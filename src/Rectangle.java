public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public int getSquare() {
        return length * width;
    }
}
