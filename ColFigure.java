
// 1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
// 2. добавления новой фигуры,
// 3. удаления фигуры,
// 4. изменения фигуры по ндексу,
// 5. сортировки по площади, вывод информации о всех фигурах.
import java.util.ArrayList;
import java.util.Collections;

public class ColFigure {

    private ArrayList<Figure> figures = new ArrayList<>();

    public ColFigure(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public void remove(int number) {
        this.figures.remove(number - 1);
    }

    public void change(int number, Figure figure) {
        this.figures.set(number, figure);
    }

    public void info() {
        System.out.println("Фигуры:\n");
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public void SortByArea(){
        Collections.sort(figures);
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
