import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // private ArrayList<Figure> figures = new ArrayList<>();

    public static void ShowMenu() {
        System.out.println("1.Добавить новую фигуру\n" +
                "2.Посчитать периметр у всех фигур\n" +
                "3.Посчитать площадь у всех фигур");
    }


    public static void getMenu(Scanner scan, ArrayList<Figure> figures) {
        int a = scan.nextInt();
        switch (a) {
            case 1:
                figures.add(null);
                getMenu(scan, figures);
                break;
            case 2:
                for (Figure figure : figures) {
                    figure.perimetr();
                    figure.toString();                    
                }
                getMenu(scan, figures);
               
                break;
            case 3:
                for (Figure figure : figures) {
                    figure.area();
                    figure.toString();
                }
                getMenu(scan, figures);
                break;
            default:
                getMenu(scan, figures);
                break;
        }
    }
}
