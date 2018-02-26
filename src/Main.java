import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Circle(5),
                new Rectangle(4, 5),
                new Rectangle(3, 2)
        };

        Arrays.sort(figures, new FigureComparator());

        for (Figure figure : figures) {
            System.out.print(figure.getSquare() + " ");
        }
    }
}
