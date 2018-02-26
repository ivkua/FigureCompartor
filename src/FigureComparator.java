import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {

    public int compare(Figure o1, Figure o2){
        return o1.getSquare() - o2.getSquare();
    }

}
