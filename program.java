
// В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
// 2.Посчитать периметр у всех фигур
// 3.Посчитать площадь у всех фигур
import java.util.*;

public class program {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Figure> figures = new ArrayList<>();

        ColFigure figures_ = new ColFigure(figures);
        figures.add(new Rectangle(10.0, 5.0));
        figures.add(new Square(10.0));
        figures.add(new Triangle(10.0, 15.0, 15.0));
        figures.add(new Circle(12.0));
        figures.add(new Circle(10.0));
        figures.add(new Triangle(3.0, 4.0, 5.0));

        figures_.info();
        figures_.remove(2);
        figures_.change(3, new Circle(15.0));
        figures_.SortByArea();           //для сортировки коллекции
        figures_.add(new Triangle(14.0,14.0, 14.0));
     
        // figures_.add(new Circle(0.0));  //исключение


        
        // Menu.ShowMenu();
        // System.out.println("Выберите, что хотите сделать:");
        // Scanner scan = new Scanner(System.in);
        // Menu.getMenu(scan, figures);
        // scan.close();

    }
}
