
public class Polyhedron extends Figure {
    
    public Double area() {
        return null;
    }
   
    public Double perimetr() {
       return null;
    }
   
    public String toString() {
        return  String.format("\nПлощадь: %.2f; \nПериметр: %.2f;",area(), perimetr());
    }

    public int compareTo(Figure figure) {
        return super.compareTo(figure);
    }
}
